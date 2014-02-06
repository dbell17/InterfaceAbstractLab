package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse extends CreditedCourse {

    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisites);
    }

    /**
     *
     * @return
     */
        public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    /**
     *
     * @param prerequisites
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
    public final void setCourseName(String courseName) {
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
    public final void setCourseNumber(String courseNumber) {
        this.setCourseNumber(courseNumber);
    }

    /**
     *
     * @param totalPointsPossible
     */
    public final void setTotalPointsPossible(double totalPointsPossible) {
        this.setTotalPointsPossible(totalPointsPossible);
    }

    /**
     *
     * @return
     */
    @Override
    public final String getRoomNumber() {
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

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Java Course name" + getCourseName();
    }
}
