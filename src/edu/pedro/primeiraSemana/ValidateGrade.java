package edu.pedro.primeiraSemana;

import java.util.Scanner;

public class ValidateGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your final grade to see if you passed: ");
        double grade = sc.nextDouble();
        String passedOrNot = gradeValidator(grade);
        System.out.printf(passedOrNot);
        sc.close();
    }
    public static String gradeValidator(double grade){
        if(grade < 6) {
            return "You have not passed! You need to study more!";
        }
        else if (grade == 6){
                return "You have to make an extra exam to pass";
        }
        else {
            return "You have passed congratulations!";
        }
    }
}
