/*
 * Copyright 2008 Web Cohesion
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.webcohesion.ofx4j.domain.data.tax1099;

import com.webcohesion.ofx4j.meta.Aggregate;
import com.webcohesion.ofx4j.meta.ChildAggregate;

import com.webcohesion.ofx4j.meta.Element;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Aparna Gawali
 * aparna.gawali@sungard.com
 */


@Aggregate ( "TAX1099R_V100")
public class Tax1099R  {

  
	private String srvrtId;
	private String taxYear;
	private String grossDist;
	
	private String taxAmt;
	private String taxAmtNd;
	private String totalDist;
	private String capGain;
	private String fedTaxWh;
	private String empContins;
	private String netUnapEmp;
	private List<String> distCodes;
	private String iraSepSimp;
	private String annCtrctDist;
	private String totEmpCount;
	private String firstYearDesignatedRoth;

	private StateTaxWithheldAggregate stateTaxWithheldAggregate;
	private PayerAddress payerAddress;
	private String payerId;
	private RecAddress recAddress;
	private String recId;
	private String recAcct;
	
	 
	@Element ( name = "SRVRTID",required = true , order = 0 )
	public String getSrvrtId() {
	    return srvrtId;
	  }


	public void setSrvrtId(String srvrtId) {
	    this.srvrtId = srvrtId;
	  }


	@Element ( name = "TAXYEAR", required = true, order = 1 )
	public String getTaxYear() {
	    return taxYear;
	  }


	public void setTaxYear(String taxYear) {
	    this.taxYear = taxYear;
	  }


	/**
	 * @return the grossDist
	 */
	@Element ( name = "GROSSDIST", required = true, order = 2 )
	public String getGrossDist() {
			return grossDist;
		}


	/**
	 * @param grossDist the grossDist to set
	 */
	public void setGrossDist(String grossDist) {
			this.grossDist = grossDist;
		}


	/**
	 * @return the taxAmt
	 */
	@Element ( name = "TAXAMT", required = false, order = 3 )
	public String getTaxAmt() {
			return taxAmt;
		}


	/**
	 * @param taxAmt the taxAmt to set
	 */
	public void setTaxAmt(String taxAmt) {
			this.taxAmt = taxAmt;
		}


    /**
	 * @return the taxAmtNd
	 */
	@Element ( name = "TAXAMTND", required = false, order = 4 )
    public String getTaxAmtNd() {
			return taxAmtNd;
		}


	/**
	 * @param taxAmtNd the taxAmtNd to set
	 */
	public void setTaxAmtNd(String taxAmtNd) {
			this.taxAmtNd = taxAmtNd;
		}


    /**
     * @return the totalDist
     */
    @Element ( name = "TOTALDIST", required = false, order = 5 )
    public String getTotalDist() {
        return totalDist;
    }

    /**
     * @param totalDist the totalDist to set
     */
    public void setTotalDist(String totalDist) {
        this.totalDist = totalDist;
    }

	/**
	 * @return the capGain
	 */
	@Element ( name = "CAPGAIN", required = false, order = 6 )
	public String getCapGain() {
			return capGain;
		}


	/**
	 * @param capGain the capGain to set
	 */
	public void setCapGain(String capGain) {
			this.capGain = capGain;
		}


	/**
	 * @return the fedTaxWh
	 */
	@Element ( name = "FEDTAXWH", required = false, order = 7 )
	public String getFedTaxWh() {
		return fedTaxWh;
	}


	/**
	 * @param fedTaxWh the fedTaxWh to set
	 */
	public void setFedTaxWh(String fedTaxWh) {
		this.fedTaxWh = fedTaxWh;
	}
	
	/**
	 * @return the empContins
	 */
	@Element ( name = "EMPCONTINS", required = false, order = 8 )
	public String getEmpContins() {
		return empContins;
	}


	/**
	 * @param empContins the empContins to set
	 */
	public void setEmpContins(String empContins) {
		this.empContins = empContins;
	}


	/**
	 * @return the netUnapEmp
	 */
	@Element ( name = "NETUNAPEMP", required = false, order = 9 )
	public String getNetUnapEmp() {
		return netUnapEmp;
	}


	/**
	 * @param netUnapEmp the netUnapEmp to set
	 */
	public void setNetUnapEmp(String netUnapEmp) {
		this.netUnapEmp = netUnapEmp;
	}


	/**
	 * @return the distCode
	 */
	@Element ( name = "DISTCODE", required = true, order = 10 )
	public List<String> getDistCodes() {
		return distCodes;
	}

	public String getDistCode() {
	    return distCodes == null || distCodes.isEmpty() ? null : distCodes.get(0);
    }

	/**
	 * @param distCode the distCode to set
	 */
	public void setDistCode(String distCode) {
		this.distCodes = Collections.singletonList(distCode);
	}

    public void setDistCodes(List<String> distCodes) {
        this.distCodes = distCodes;
    }

	/**
	 * @return the iraSepSimp
	 */
	@Element ( name = "IRASEPSIMP", required = true, order = 11 )
	public String getIraSepSimp() {
		return iraSepSimp;
	}


	/**
	 * @param iraSepSimp the iraSepSimp to set
	 */
	public void setIraSepSimp(String iraSepSimp) {
		this.iraSepSimp = iraSepSimp;
	}


	/**
	 * @return the annCtrctDist
	 */
	@Element ( name = "ANNCTRCTDIST", required = false, order = 12 )
	public String getAnnCtrctDist() {
		return annCtrctDist;
	}


	/**
	 * @param annCtrctDist the annCtrctDist to set
	 */
	public void setAnnCtrctDist(String annCtrctDist) {
		this.annCtrctDist = annCtrctDist;
	}


	/**
	 * @return the totEmpCount
	 */
	@Element ( name = "TOTEMPCONT", required = false, order = 13 )
	public String getTotEmpCount() {
		return totEmpCount;
	}


	/**
	 * @param totEmpCount the totEmpCount to set
	 */
	public void setTotEmpCount(String totEmpCount) {
		this.totEmpCount = totEmpCount;
	}


    /**
     * @return the firstYearDesignatedRoth
     */
    @Element ( name = "FIRSTYEARDESIGROTH", required = false, order = 14 )
    public String getFirstYearDesignatedRoth() {
        return firstYearDesignatedRoth;
    }


    /**
     * @param firstYearDesignatedRoth the firstYearDesignatedRoth to set
     */
    public void setFirstYearDesignatedRoth(String firstYearDesignatedRoth) {
        this.firstYearDesignatedRoth = firstYearDesignatedRoth;
    }


    /**
     * @return the stateTaxWithheldAggregate
     */
    @ChildAggregate(required=false, order = 15)
    public StateTaxWithheldAggregate getStateTaxWithheldAggregate() {
        return stateTaxWithheldAggregate;
    }


    /**
     * @param stateTaxWithheldAggregate the stateTaxWithheldAggregate to set
     */
    public void setStateTaxWithheldAggregate(StateTaxWithheldAggregate stateTaxWithheldAggregate) {
        this.stateTaxWithheldAggregate = stateTaxWithheldAggregate;
    }

    /**
	 * @return the payerAddress
	 */
	@ChildAggregate(required=true, order = 16)
	public PayerAddress getPayerAddress() {
		return payerAddress;
	}


	/**
	 * @param payerAddress the payerAddress to set
	 */
	public void setPayerAddress(PayerAddress payerAddress) {
		this.payerAddress = payerAddress;
	}
	
	/**
	 * @return the payerId
	 */
	@Element ( name = "PAYERID", required = true, order = 17 )
	public String getPayerId() {
		return payerId;
	}


	/**
	 * @param payerId the payerId to set
	 */
	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}
	

	/**
	 * @return the recAddress
	 */
	@ChildAggregate(order = 18)
	public RecAddress getRecAddress() {
		return recAddress;
	}


	/**
	 * @param recAddress the recAddress to set
	 */
	public void setRecAddress(RecAddress recAddress) {
		this.recAddress = recAddress;
	}

	/**
	 * @return the recId
	 */
	@Element ( name = "RECID", required = true, order = 19 )
	public String getRecId() {
		return recId;
	}


	/**
	 * @param recId the recId to set
	 */
	public void setRecId(String recId) {
		this.recId = recId;
	}


	/**
	 * @return the recAcct
	 */
	@Element ( name = "RECACCT", required = true, order = 20 )
	public String getRecAcct() {
		return recAcct;
	}


	/**
	 * @param recAcct the recAcct to set
	 */
	public void setRecAcct(String recAcct) {
		this.recAcct = recAcct;
	}
}
