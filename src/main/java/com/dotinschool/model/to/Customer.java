package com.dotinschool.model.to;

/**
 * @author Maral Khojasteh
 */
public abstract class Customer {

    private long id;
    private String customerNumber;

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String code) {
        this.customerNumber = code;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
