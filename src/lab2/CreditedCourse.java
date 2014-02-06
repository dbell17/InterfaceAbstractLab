/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

/**
 *
 * @author Don
 */
public interface CreditedCourse {
    
   /**
     *
     * @return
     */
    public abstract String getCourseName();

    public abstract void setCourseName(String courseName);

    public abstract String getCourseNumber();

    public abstract void setCourseNumber(String courseNumber);

    /**
     *
     * @return
     */
    public abstract double getCredits();

    public abstract void setCredits(double credits);

    public abstract String getPrerequisites();

    public abstract void setPrerequisites(String prerequisites);

    public String getRoomNumber();

    public abstract void setRoomNumber(String roomNumber);
   
    public abstract int getNumberOfComputersAvailable();

    public abstract void setNumberOfComputersAvailable(int numberOfComputersAvailable);

    public abstract double getTotalPointsPossible();

    public abstract void setTotalPointsPossible(double totalPointsPossible);
}
