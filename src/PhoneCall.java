import java.util.Scanner;

public class PhoneCall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String input = scan.nextLine();
        System.out.println("Are you an admin or a patient?");

        System.out.println("Hello! Welcome to your local hospital - where your care is our mission! How can I help you today?");
        while (true) {
            System.out.println("Enter 'C' if you would like to create an appointment. \n " +
                    "Enter 'R' if you'd like someone to read your appointment to you. \n " +
                    "Enter 'U' if you'd like to update your appointment. \n" +
                    "Enter 'D' if you'd like to cancel your appointment. \n" +
                    "Enter 'Q' if you're done.");
                String input = scan.nextLine();
                switch(input.toUpperCase()) {
                    case "C":
                        Patient.addPatient();
                }
        }
    }
}
