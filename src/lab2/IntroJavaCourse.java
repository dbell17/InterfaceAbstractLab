package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse implements CreditedCourse {

    private int computersAvailable;
    private double totalPossiblePoints;

    private String courseName;
    private String courseNumber;

    public int getComputersAvailable() {
        return computersAvailable;
    }

    public void setComputersAvailable(int computersAvailable) {
        this.computersAvailable = computersAvailable;
    }

    public double getTotalPointsPossible() {
        return totalPossiblePoints;
    }

    public double getTotalPossiblePoints() {
        return totalPossiblePoints;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setTotalPossiblePoints(double totalPossiblePoints) {
        this.totalPossiblePoints = totalPossiblePoints;
    }
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

     /**
     *
     * @return
     */
        public String getCapitalizedCourseName() {
        return this.courseName.toUpperCase();
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
    public void setCourseNumber(String courseNumber) {
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

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Course name" + courseName;
    }

    public int getNumberOfComputersAvailable() {
        return computersAvailable;
                }
}