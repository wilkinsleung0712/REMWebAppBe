package com.colliers.common.utils;

import com.colliers.common.variance.VarienceResult;
import com.colliers.mri.pojo.Glsum;
import com.colliers.mri.pojo.VarienceReportBudget;

import java.util.List;
import java.util.Optional;

public class VarienceUtils {
    public static Optional<VarienceResult> CalculateVarienceResult(String entityId,
                                                                   String endPeriod,
                                                                   String acctNum,
                                                                   List<Glsum> glsumsData,
                                                                   List<VarienceReportBudget> budgetsData) {

        VarienceResult varResult = null;
        double actualMTD = 0, budgetMTD = 0, varienceDifference = 0, variencePercentage = 0;

        Optional<Glsum> glsum = glsumsData.stream().filter(data -> data.getAcctnum().trim().equals(acctNum.trim())).findFirst();
        actualMTD = glsum.isPresent() ? glsum.get().getActivity().doubleValue() * -1.0 : 0;

        Optional<VarienceReportBudget> vBudgetData = budgetsData.stream().filter(data -> data.getAcctnum().trim().equals(acctNum.trim())).findFirst();
        budgetMTD = vBudgetData.isPresent() ? vBudgetData.get().getActivity().doubleValue() * -1.0 : 0;

        String noteType = vBudgetData.isPresent() ? vBudgetData.get().getNoteType() : null;
        String noteText = vBudgetData.isPresent() ? vBudgetData.get().getNoteText() : null;

        varienceDifference = getVarienceDifference(actualMTD, budgetMTD);
        variencePercentage = getVariencePercentage(budgetMTD, varienceDifference);

        varResult = new VarienceResult();
        varResult.setAcctNum(acctNum.trim());
        varResult.setAcctDescription("unknown");
        varResult.setActualMTD(actualMTD);
        varResult.setBudgetMTD(budgetMTD);
        varResult.setVarianceDifference(varienceDifference);
        varResult.setVariancePrecentage(variencePercentage);
        varResult.setPeriod(endPeriod.trim());
        varResult.setNoteType(noteType);
        varResult.setComments(noteText);

        return Optional.of(varResult);
    }


    private static double getVarienceDifference(Double actualMTD, Double budgetMTD) {
        return actualMTD - budgetMTD;
    }

    private static double getVariencePercentage(Double budgetMTD, Double varienceDifference) {
        Double result = (varienceDifference / budgetMTD) * 100;
        return (result.isInfinite() || result.isNaN()) ? 0 : result;
    }

}
