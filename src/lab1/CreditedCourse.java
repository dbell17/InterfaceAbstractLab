/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Don
 */
public abstract class CreditedCourse {

    private int numberOfComputersAvailable;
    private double totalPointsPossible;
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public int getNumberOfComputersAvailable() {
        return numberOfComputersAvailable;
    }

    public void setNumberOfComputersAvailable(int numberOfComputersAvailable) {
        this.numberOfComputersAvailable = numberOfComputersAvailable;
    }

    public double getTotalPointsPossible() {
        return totalPointsPossible;
    }

    public void setTotalPointsPossible(double totalPointsPossible) {
        this.totalPointsPossible = totalPointsPossible;
    }
}
