package StructuralDP.CompositeDP.DepartmentEx;

import java.util.*;

public class CompositeRunner {

    public static void main(String[] args) {
        CompositeRunner compositeRunner = new CompositeRunner();
        compositeRunner.compositeDemo();

    }

    public void compositeDemo(){

        Department financeDepartment = new Finance();
        Department salesDepartment = new Sales();
        Department argeDepartment = new Arge();

        Department regionalDepartment =
                new RegionalDepartment(Arrays.asList(financeDepartment, salesDepartment,argeDepartment));

        System.out.println(regionalDepartment.getName());
        System.out.println("*********************");
        System.out.println(regionalDepartment.getEmployees());
    }
}
