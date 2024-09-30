package classwork;

import java.util.Scanner;

public class PatientDriverApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompting for basic patient information
        System.out.println("Enter patient's first name: ");
        String firstName = input.nextLine();
        System.out.println("Enter patient's middle name: ");
        String middleName = input.nextLine();
        System.out.println("Enter patient's last name: ");
        String lastName = input.nextLine();
        System.out.println("Enter patient's address: ");
        String streetAddress = input.nextLine();
        System.out.println("Enter city: ");
        String city = input.nextLine();
        System.out.println("Enter state: ");
        String state = input.nextLine();
        System.out.println("Enter zip: ");
        String zip = input.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = input.nextLine();
        System.out.println("Enter emergency contact name: ");
        String emergencyContactName = input.nextLine();
        System.out.println("Enter emergency contact phone: ");
        String emergencyContactPhone = input.nextLine();

        // Create a Patient instance
        Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zip, phoneNumber, emergencyContactName, emergencyContactPhone);

        // Create three Procedure instances
        Procedure procedure1 = new Procedure("Physical Exam", "7/20/2019", "Dr. Diop", 3250.00);
        Procedure procedure2 = new Procedure("X-ray", "7/20/2019", "Dr. Ndiaye", 5500.43);
        Procedure procedure3 = new Procedure("Blood Test", "7/20/2019", "Dr. Faye", 1400.75);

        // Display the patient information
        displayPatient(patient);

        // Display procedure information
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        // Calculate total charges
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.println("\nTotal Charges: $" + String.format("%,.2f", totalCharges));
    }

    public static void displayPatient(Patient patient) {
        System.out.println("\nPatient Information:");
        System.out.println(patient);
    }

    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure);
    }

    public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
        return p1.getCharges() + p2.getCharges() + p3.getCharges();
    }
   
}

