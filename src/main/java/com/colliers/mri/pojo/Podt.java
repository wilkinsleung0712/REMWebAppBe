package com.colliers.mri.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Podt extends PodtKey {
    private String poprefx;

    private String item;

    private String itemdesc;

    private String userid;

    private BigDecimal qty;

    private String unitmsr;

    private BigDecimal unitcost;

    private BigDecimal netcost;

    private String ordstat;

    private String altitem;

    private String itemtype;

    private String acctnum;

    private String department;

    private String jobcode;

    private String entityid;

    private Date recvqty;

    private BigDecimal received;

    private BigDecimal invoiced;

    private String reqnum;

    private String wrkoid;

    private String ataxgrpid;

    private BigDecimal taxcost;

    private BigDecimal totcost;

    private String qtype;

    private BigDecimal amtrecvd;

    private BigDecimal amtinvcd;

    private String currcode;

    private String jcPhasecode;

    private String jcCostlist;

    private String jcCostcode;

    private String category;

    private Date lastdate;

    private String crosssite;

    private String accrue;

    private String prepay;

    private String laccper;

    private String lprepper;

    private Date rwstdate;

    private Date rwendate;

    private String addldesc;

    public String getPoprefx() {
        return poprefx;
    }

    public void setPoprefx(String poprefx) {
        this.poprefx = poprefx == null ? null : poprefx.trim();
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item == null ? null : item.trim();
    }

    public String getItemdesc() {
        return itemdesc;
    }

    public void setItemdesc(String itemdesc) {
        this.itemdesc = itemdesc == null ? null : itemdesc.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public String getUnitmsr() {
        return unitmsr;
    }

    public void setUnitmsr(String unitmsr) {
        this.unitmsr = unitmsr == null ? null : unitmsr.trim();
    }

    public BigDecimal getUnitcost() {
        return unitcost;
    }

    public void setUnitcost(BigDecimal unitcost) {
        this.unitcost = unitcost;
    }

    public BigDecimal getNetcost() {
        return netcost;
    }

    public void setNetcost(BigDecimal netcost) {
        this.netcost = netcost;
    }

    public String getOrdstat() {
        return ordstat;
    }

    public void setOrdstat(String ordstat) {
        this.ordstat = ordstat == null ? null : ordstat.trim();
    }

    public String getAltitem() {
        return altitem;
    }

    public void setAltitem(String altitem) {
        this.altitem = altitem == null ? null : altitem.trim();
    }

    public String getItemtype() {
        return itemtype;
    }

    public void setItemtype(String itemtype) {
        this.itemtype = itemtype == null ? null : itemtype.trim();
    }

    public String getAcctnum() {
        return acctnum;
    }

    public void setAcctnum(String acctnum) {
        this.acctnum = acctnum == null ? null : acctnum.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getJobcode() {
        return jobcode;
    }

    public void setJobcode(String jobcode) {
        this.jobcode = jobcode == null ? null : jobcode.trim();
    }

    public String getEntityid() {
        return entityid;
    }

    public void setEntityid(String entityid) {
        this.entityid = entityid == null ? null : entityid.trim();
    }

    public Date getRecvqty() {
        return recvqty;
    }

    public void setRecvqty(Date recvqty) {
        this.recvqty = recvqty;
    }

    public BigDecimal getReceived() {
        return received;
    }

    public void setReceived(BigDecimal received) {
        this.received = received;
    }

    public BigDecimal getInvoiced() {
        return invoiced;
    }

    public void setInvoiced(BigDecimal invoiced) {
        this.invoiced = invoiced;
    }

    public String getReqnum() {
        return reqnum;
    }

    public void setReqnum(String reqnum) {
        this.reqnum = reqnum == null ? null : reqnum.trim();
    }

    public String getWrkoid() {
        return wrkoid;
    }

    public void setWrkoid(String wrkoid) {
        this.wrkoid = wrkoid == null ? null : wrkoid.trim();
    }

    public String getAtaxgrpid() {
        return ataxgrpid;
    }

    public void setAtaxgrpid(String ataxgrpid) {
        this.ataxgrpid = ataxgrpid == null ? null : ataxgrpid.trim();
    }

    public BigDecimal getTaxcost() {
        return taxcost;
    }

    public void setTaxcost(BigDecimal taxcost) {
        this.taxcost = taxcost;
    }

    public BigDecimal getTotcost() {
        return totcost;
    }

    public void setTotcost(BigDecimal totcost) {
        this.totcost = totcost;
    }

    public String getQtype() {
        return qtype;
    }

    public void setQtype(String qtype) {
        this.qtype = qtype == null ? null : qtype.trim();
    }

    public BigDecimal getAmtrecvd() {
        return amtrecvd;
    }

    public void setAmtrecvd(BigDecimal amtrecvd) {
        this.amtrecvd = amtrecvd;
    }

    public BigDecimal getAmtinvcd() {
        return amtinvcd;
    }

    public void setAmtinvcd(BigDecimal amtinvcd) {
        this.amtinvcd = amtinvcd;
    }

    public String getCurrcode() {
        return currcode;
    }

    public void setCurrcode(String currcode) {
        this.currcode = currcode == null ? null : currcode.trim();
    }

    public String getJcPhasecode() {
        return jcPhasecode;
    }

    public void setJcPhasecode(String jcPhasecode) {
        this.jcPhasecode = jcPhasecode == null ? null : jcPhasecode.trim();
    }

    public String getJcCostlist() {
        return jcCostlist;
    }

    public void setJcCostlist(String jcCostlist) {
        this.jcCostlist = jcCostlist == null ? null : jcCostlist.trim();
    }

    public String getJcCostcode() {
        return jcCostcode;
    }

    public void setJcCostcode(String jcCostcode) {
        this.jcCostcode = jcCostcode == null ? null : jcCostcode.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Date getLastdate() {
        return lastdate;
    }

    public void setLastdate(Date lastdate) {
        this.lastdate = lastdate;
    }

    public String getCrosssite() {
        return crosssite;
    }

    public void setCrosssite(String crosssite) {
        this.crosssite = crosssite == null ? null : crosssite.trim();
    }

    public String getAccrue() {
        return accrue;
    }

    public void setAccrue(String accrue) {
        this.accrue = accrue == null ? null : accrue.trim();
    }

    public String getPrepay() {
        return prepay;
    }

    public void setPrepay(String prepay) {
        this.prepay = prepay == null ? null : prepay.trim();
    }

    public String getLaccper() {
        return laccper;
    }

    public void setLaccper(String laccper) {
        this.laccper = laccper == null ? null : laccper.trim();
    }

    public String getLprepper() {
        return lprepper;
    }

    public void setLprepper(String lprepper) {
        this.lprepper = lprepper == null ? null : lprepper.trim();
    }

    public Date getRwstdate() {
        return rwstdate;
    }

    public void setRwstdate(Date rwstdate) {
        this.rwstdate = rwstdate;
    }

    public Date getRwendate() {
        return rwendate;
    }

    public void setRwendate(Date rwendate) {
        this.rwendate = rwendate;
    }

    public String getAddldesc() {
        return addldesc;
    }

    public void setAddldesc(String addldesc) {
        this.addldesc = addldesc == null ? null : addldesc.trim();
    }
}