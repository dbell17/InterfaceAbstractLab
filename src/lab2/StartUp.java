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
public class StartUp {

    public static void main(String[] args) {
        CreditedCourses introJava = new IntroJavaCourse("Intro To Java", "801-115", 4.0, "Introduction to programming");
        CreditedCourses introProgramming = new IntroToProgrammingCourse("Intro to programming", "801-111", 4.0);
        CreditedCourses advancedJava = new AdvancedJavaCourse("Advanced Java", "805-118", 4.0, " Intro to java");

        System.out.println(introJava);
        System.out.println(introProgramming);
        System.out.println(advancedJava);
    }
}
