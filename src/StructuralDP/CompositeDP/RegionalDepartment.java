package StructuralDP.CompositeDP;

import java.util.*;
import java.util.stream.*;

public class RegionalDepartment extends Department{

    List<Department> childDepartments;

    public RegionalDepartment(List<Department> childDepartments) {
        this.childDepartments = childDepartments;
    }

    @Override
    String getName() {
        return childDepartments.stream(). // Finance objesi ile Sales objesi
                map(Department::getName). // "Finance" ve "Sales"
                collect(Collectors.joining(", ")); // "Finance, Sales"
    }

    @Override
    List<String> getEmployees() {
        return childDepartments.stream().
                flatMap(d -> d.getEmployees().stream()).
                collect(Collectors.toList());
    }
}
