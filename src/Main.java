import java.util.Scanner;

public class Main {
    // Name: Domminick Hemphill
    // Date: 01/25/2020
    // Purpose: Hurricane Wind Speed Classifier
    // Instructor: Barry Mesa
    // Class Number: 2467

        // Scanner to accept user input
        public static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {

            long speed;
            String classification;

            // ask user for wind speed
            System.out.println("Please enter the wind speed (mph):");
            // store input from user in speed variable
            speed = input.nextLong();

            // logic to determine category type and response to user
            if(speed >= 157){
                classification = "Category Five Hurricane";
                System.out.println("Classification: " + classification);
            } else if(speed <= 156 && speed >= 130){
                classification = "Category Four Hurricane";
                System.out.println("Classification: " + classification);
            } else if(speed <= 129 && speed >= 111) {
                classification = "Category Three Hurricane";
                System.out.println("Classification: " + classification);
            } else if(speed <= 110 && speed >= 96) {
                classification = "Category Two Hurricane";
                System.out.println("Classification: " + classification);
            } else if(speed <= 95 && speed >= 74) {
                classification = "Category One Hurricane";
                System.out.println("Classification: " + classification);
            } else if(speed <= 73 && speed >= 39) {
                classification = "Tropical Storm";
                System.out.println("Classification: " + classification);
            } else if(speed <= 38 && speed >= 0) {
                classification = "Not in scale";
                System.out.println("Classification: " + classification);
            } else {
                classification = "Invalid input.";
                System.out.println("Classification: " + classification);
            }
        }

    }
