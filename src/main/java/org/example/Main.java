package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<StudentAnalyzer> studentAnalyzers = Arrays.asList(new StudentAnalyzer("rishav",99,21));
        new StudentAnalyzer("kunal",89,23);
        new StudentAnalyzer("saurabh",79,24);
        new StudentAnalyzer("aditya",86,25);

        Comparator<StudentAnalyzer> marksComparator= ((o1, o2) -> o2.getMarks()- o1.getMarks());
        studentAnalyzers.sort(marksComparator);
        System.out.println("sort student list in desending order");

        for (StudentAnalyzer analyzer:studentAnalyzers) {
            System.out.println(analyzer);

        }
        Comparator<StudentAnalyzer> nameComparator= ((o1, o2) -> o2.getName().compareTo(o1.getName()));
        studentAnalyzers.sort(nameComparator);
        System.out.println("sort student list in assending order");
        for (StudentAnalyzer analyzer:studentAnalyzers) {
            System.out.println(analyzer);

        }


    }
}