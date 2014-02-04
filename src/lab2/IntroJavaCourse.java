package lab2;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse implements CreditedCourses {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    private int computersAvailable;
    private double totalPossiblePoints;

    public int getComputersAvailable() {
        return computersAvailable;
    }

    public void setComputersAvailable(int computersAvailable) {
        this.computersAvailable = computersAvailable;
    }

    public double getTotalPossiblePoints() {
        return totalPossiblePoints;
    }

    public void setTotalPossiblePoints(double totalPossiblePoints) {
        this.totalPossiblePoints = totalPossiblePoints;
    }

    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.prerequisites = prerequisites;
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

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getRoomNumber() {
        return ("L119");
    }

}
