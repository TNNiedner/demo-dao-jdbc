package com.tnn;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById ===");

        Department department = departmentDao.findById(1);

        System.out.println(department);

        System.out.println("\n=== TEST 2: department update ===");
        department = departmentDao.findById(6);
        department.setName("UdtTest");
        departmentDao.update(department);
        System.out.println("Update completed");

    }

}
