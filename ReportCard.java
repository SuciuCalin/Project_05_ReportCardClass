package com.example.android.reportcard;

import java.util.ArrayList;

/**
 * Created by JukUm on 5/8/2017.
 */

public class ReportCard {

    private static final String SCHOOL_NAME = "School";     //The school name is never modified

    private ArrayList<Double> mGrades = new ArrayList<>(); //ArrayList that stores the grades
    private ArrayList<String> mCourses = new ArrayList<>(); //ArrayList that stores the courses

    private String mStudent;                                //Stores the student name
    private double mAverage;                                //Stores the grades average
    private String mReport;                                 //Report string containing the student name, grades, and the average


    /**
     * Constructor for creating a new ReportCard object.
     *
     * @param studentName is the name of the student
     * @param gradePA     is the grade for Programming Abstractions
     * @param gradeCOS    is the grade for Computer Organization and Systems
     * @param gradePCS    is the grade for Principles of Computer Systems
     * @param gradeMFC    is the grade for Mathematical Foundations of Computing
     * @param gradeIPCS   is the grade for Introduction to Probability for Computer Scientists
     * @param gradeDSA    is the grade for Data Structures and Algorithms
     */
    public ReportCard(String studentName, double gradePA, double gradeCOS, double gradePCS, double
            gradeMFC, double gradeIPCS, double gradeDSA) {

        mStudent = studentName;

        mCourses.add(0, "Programming Abstractions");
        mCourses.add(1, "Computer Organization and Systems");
        mCourses.add(2, "Principles of Computer Systems");
        mCourses.add(3, "Mathematical Foundations of Computing");
        mCourses.add(4, "Introduction to Probability for Computer Scientists");
        mCourses.add(5, "Data Structures and Algorithms");

        mGrades.add(0, gradePA);
        mGrades.add(1, gradeCOS);
        mGrades.add(2, gradePCS);
        mGrades.add(3, gradeMFC);
        mGrades.add(4, gradeIPCS);
        mGrades.add(5, gradeDSA);
    }


    /*
     *  Setters
     */

    //Set the student name
    public void setStudent(String studentName) {
        mStudent = studentName;
    }

    //Set the grade for Programming Abstractions
    public void setGradePA(double grade) {
        mGrades.set(0, grade);
    }

    //Set the grade for Computer Organization and Systems
    public void setGradeCOS(double grade) {
        mGrades.set(1, grade);
    }

    //Set the grade for Principles of Computer Systems
    public void setGradePCS(double grade) {
        mGrades.set(2, grade);
    }

    //Set the grade for Mathematical Foundations of Computing
    public void setGradeMFC(double grade) {
        mGrades.set(3, grade);
    }

    //Set the grade for Introduction to Probability for Computer Scientists
    public void setGradeIPCS(double grade) {
        mGrades.set(4, grade);
    }

    //Set the grade for Data Structures and Algorithms
    public void setGradeDSA(double grade) {
        mGrades.set(5, grade);
    }


    /*
     *  Getters
     */

    //Returns the student name
    public String getStudent() {
        return mStudent;
    }

    //Returns the grade for Programming Abstractions
    public double getGradePA() {
        double grade = mGrades.get(0);
        return grade;
    }

    //Returns the grade for Computer Organization and Systems
    public double getGradeCOS() {
        double grade = mGrades.get(1);
        return grade;
    }

    //Returns the grade for Principles of Computer Systems
    public double getGradePCS() {
        double grade = mGrades.get(2);
        return grade;
    }

    //Returns the grade for Mathematical Foundations of Computing
    public double getGradeMFC() {
        double grade = mGrades.get(3);
        return grade;
    }

    //Returns the grade for Introduction to Probability for Computer Scientists
    public double getGradeIPCS() {
        double grade = mGrades.get(4);
        return grade;
    }

    //Returns the grade for Data Structures and Algorithms
    public double getGradeDSA() {
        double grade = mGrades.get(5);
        return grade;
    }

    //Returns the calculated average
    public double getAverageGrade() {
        mAverage = 0.0;
        for (int i = 0; i < mGrades.size(); i++) {
            double grade = mGrades.get(i);
            mAverage = mAverage + grade;
        }
        mAverage = mAverage / mGrades.size();
        return mAverage;
    }

    @Override
    public String toString() {
        mReport = "";
        for (int i = 0; i < mGrades.size(); i++) {
            Double grade = mGrades.get(i);
            String course = mCourses.get(i);
            mReport = mReport + course + ": " + grade + "\n";
        }
        mReport = SCHOOL_NAME + "\n"
                + mStudent + "\n"
                + mReport
                + "Average: " + mAverage;
        return mReport;
    }
}
