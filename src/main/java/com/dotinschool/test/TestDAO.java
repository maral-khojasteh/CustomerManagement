package com.dotinschool.test;

import com.dotinschool.model.dao.CompanyDAO;
import com.dotinschool.model.to.Company;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Maral ito on 4/23/2015.
 */
public class TestDAO {

    public static void main(String[] args) throws SQLException {

        CompanyDAO companyDAO = new CompanyDAO();

//        personDAO.delete(10);
//
//        Person maral = new Person();
//        maral.setBirthDate(new Date());
//        maral.setFirstName("Maral");
//        maral.setLastName("Khojaste");
//        maral.setFatherName("Ali");
//        maral.setNationalCode("0077771772");
//        maral.setCustomerNumber("888");
//
//        personDAO.insert(maral);

        ArrayList<Company> result = companyDAO.find("داتین", "", "");
        System.out.println(result.size());
        for (Company company: result) {
            System.out.println(company.getId());
        }

    }

}
