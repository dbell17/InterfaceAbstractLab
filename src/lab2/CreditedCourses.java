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
public interface CreditedCourses {
    public abstract int getComputersAvailable();
    public abstract void setComputersAvailable(int computersAvailable);
    
    public abstract double getTotalPossiblePoints();
    public abstract void setTotalPossiblePoints(double totalPossiblePoints);
    
    public abstract String getRoomNumber();
}
