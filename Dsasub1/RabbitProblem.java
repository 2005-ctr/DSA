/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Submission_3;

/**
 *
 * @author Ramindi
 */
public class RabbitProblem {
    public static int rabbitPairs(int months) {
        if (months <= 0) {
            return 0;
        }
        if (months == 1 || months == 2) {
            return 1;
        }
        return rabbitPairs(months - 1) + rabbitPairs(months - 2);
    }

    public static void main(String[] args) {
        int months = 8;
        System.out.println("Rabbit pairs after " + months + " months: " + rabbitPairs(months));
    }

}
