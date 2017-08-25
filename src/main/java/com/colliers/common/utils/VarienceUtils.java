package com.colliers.common.utils;

import com.colliers.common.variance.VarienceResult;
import com.colliers.mri.pojo.Budgets;
import com.colliers.mri.pojo.Glsum;

import java.util.List;
import java.util.Optional;

public class VarienceUtils {
    public static VarienceResult CalculateVarienceResult(String period, String acctNum, List<Glsum> glsumsData, List<Budgets> budgetsData) {
        VarienceResult varResult = new VarienceResult();
        Optional<List<Glsum>> optionalGlsumsData = Optional.of(glsumsData);
        Optional<List<Budgets>> optionalBudgetData = Optional.of(budgetsData);
        double actualMTD = (optionalGlsumsData.isPresent() && !optionalGlsumsData.get().isEmpty()) ? glsumsData.get(0).getActivity().doubleValue() * -1.0 : Double.valueOf(0);
        double budgetMTD = (optionalBudgetData.isPresent() && !optionalBudgetData.get().isEmpty())? budgetsData.get(0).getActivity().doubleValue() * -1.0: Double.valueOf(0);
        double varienceDifference = getVarienceDifference(actualMTD, budgetMTD);
        double variencePercentage = getVariencePercentage(budgetMTD, varienceDifference);

        varResult.setAcctNum(acctNum.trim());
        varResult.setAcctDescription("unknown");
        varResult.setActualMTD(actualMTD);
        varResult.setBudgetMTD(budgetMTD);
        varResult.setVarianceDifference(varienceDifference);
        varResult.setVariancePrecentage(variencePercentage);
        varResult.setPeriod(period.trim());
        varResult.setComments("waiting for implementation");
        return varResult;
    }

    private static double getVarienceDifference(Double actualMTD, Double budgetMTD) {
        return actualMTD - budgetMTD;
    }

    private static double getVariencePercentage(Double budgetMTD, Double varienceDifference) {
        return (varienceDifference / budgetMTD)*100;
    }

//    public static VarienceCategoryResult CalculateTotalValueForVarienceResult(VarienceCategoryResult varienceCategoryResult){
//        //This method aimed to calculate total value
//        return null;
//    }
}
