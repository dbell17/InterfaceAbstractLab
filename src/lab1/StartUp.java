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
public class StartUp {

    public static void main(String[] args) {
//        CreditedCourse introJava = new IntroJavaCourse("Intro To Java", "801-115", 4.0, "Introduction to programming");
//        CreditedCourse introProgramming = new IntroToProgrammingCourse("Intro to programming", "801-111", 4.0);
        CreditedCourse advancedJava = new AdvancedJavaCourse("Advanced Java", "805-118", 4.0, " Intro to java");

    
//        System.out.println(introJava);
//        System.out.println(introProgramming);
        System.out.println(advancedJava);

        /* I can really see how useful this can be.  It does seem to have a greater chance of breaking the code however.
         By making objects by referencing the super class, you are able to take advantage of all the methods created in each class which can be handy. 
         However if the method is poorly coded all classes are going to inherit this bad method. Super useful tool if used properly.
        
        
         */
    }

}
