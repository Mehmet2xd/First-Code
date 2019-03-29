package class5;

import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int age;
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter your age: ");
        age = userInput.nextInt();
        if(age < 1) {
            System.out.println("Invalid value");
        } else if(age >= 1 && age < 3) {
            System.out.println("Baby");
        } else if(age >= 3 && age < 5) {
            System.out.println("Toddler");
        } else if(age >= 5 && age < 13) {
            System.out.println("Kid");
        } else if(age >= 13 && age < 20) {
            System.out.println("Teenager");
        }else if(age >= 20 && age < 64) {
            System.out.println("Adult");
        }else {
            System.out.println("Senior");
        }
        
        
    }

}