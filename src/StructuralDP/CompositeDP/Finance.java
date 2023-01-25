package StructuralDP.CompositeDP;

import java.util.*;

public class Finance extends Department{
    @Override
    String getName() {
        return "Finance";
    }

    @Override
    List<String> getEmployees() {
        return Arrays.asList("F1", "F2", "F3");
    }
}
