package com.dotinschool.model.to;

import java.util.Date;

/**
 * @author Maral Khojasteh
 */
public class Company extends Customer {

    private String companyName;
    private Date registrationDate;
    private String economicCode;

    public String getName() {
        return companyName;
    }

    public void setName(String companyName) {
        this.companyName = companyName;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getEconomicCode() {
        return economicCode;
    }

    public void setEconomicCode(String economicCode) {
        this.economicCode = economicCode;
    }

}
