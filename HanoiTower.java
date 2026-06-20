/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Submission_4;

/**
 *
 * @author Ramindi
 */
public class HanoiTower {
    public static void solve(int disks, char source, char helper, char destination) {
        if (disks == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        solve(disks - 1, source, destination, helper);
        System.out.println("Move disk " + disks + " from " + source + " to " + destination);
        solve(disks - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        solve(3, 'A', 'B', 'C');
    }

}
