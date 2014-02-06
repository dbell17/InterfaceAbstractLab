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
    private String roomNumber;


    /**
     *
     * @return
     */
    public final String getCourseName() {
        return courseName;
    }

    public abstract void setCourseName(String courseName);

    public final String getCourseNumber() {
        return courseNumber;
    }

    public abstract void setCourseNumber(String courseNumber);

    /**
     *
     * @return
     */
    public final double getCredits() {
        return credits;
    }

    public abstract void setCredits(double credits);

    public final String getPrerequisites() {
        return prerequisites;
    }

    public abstract void setPrerequisites(String prerequisites);

    public String getRoomNumber() {
        return roomNumber;
    }

    public abstract void setRoomNumber(String roomNumber);
   
    public final int getNumberOfComputersAvailable() {
        return numberOfComputersAvailable;
    }

    public abstract void setNumberOfComputersAvailable(int numberOfComputersAvailable);

    public final double getTotalPointsPossible() {
        return totalPointsPossible;
    }

    public abstract void setTotalPointsPossible(double totalPointsPossible);
}
