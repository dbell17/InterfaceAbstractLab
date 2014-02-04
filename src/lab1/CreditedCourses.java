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
public abstract class CreditedCourses {
    private int numberOfComputersAvailable;
    private double totalPointsPossible;

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
    public abstract String roomNumber();
}
