package com.tnn;

import model.dao.DaoFactory;
import model.entities.*;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        var obj = new Department(1, "Books");

        var seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);

        var sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);



    }
}
