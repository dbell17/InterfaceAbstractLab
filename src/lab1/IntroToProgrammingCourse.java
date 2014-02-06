package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroToProgrammingCourse extends CreditedCourse {

//
    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }

    /**
     *
     * get the course name capitalized
     * @return A capitalized course name 
     */
    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    /**
     * sets the prerequisite course 
     * @param prerequisites a string that holds the prerequisite
     */
    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.setPrerequisites(prerequisites);
    }

    /**
     *
     * @param credits
     */
    @Override
    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }

    /**
     *
     * @param courseName
     */
    @Override
    public void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
            this.setCourseName(courseName);
        }
    }

    /**
     *
     * @param courseNumber
     */
    @Override
        public void setCourseNumber
        (String courseNumber) {
        this.setCourseNumber(courseNumber);
        }

    /**
     *
     * @param totalPointsPossible
     */
    public final void setTotalPointsPossible(double totalPointsPossible){
             this.setTotalPointsPossible(totalPointsPossible);
         }

    /**
     *
     * @return
     */
    public String getRoomNumber() {
        return ("L111");
    }

    /**
     *
     * @param roomNumber
     */
    @Override
    public void setRoomNumber(String roomNumber) {
    this.setRoomNumber(roomNumber);
    }

    /**
     *
     * @param numberOfComputersAvailable
     */
    @Override
    public void setNumberOfComputersAvailable(int numberOfComputersAvailable) {
    this.setNumberOfComputersAvailable(numberOfComputersAvailable);
    }

}
