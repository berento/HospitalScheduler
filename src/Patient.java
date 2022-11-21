import java.util.Scanner;

public class Patient {
    String name;
    String dob;
    int pmi;
    String appointmentReason;

    public Patient(String name, String dob, int pmi, String appointmentReason) {
        this.name = name;
        this.dob = dob;
        this.pmi = pmi;
        this.appointmentReason = appointmentReason;
    }
    public static void addPatient(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the patient's name?");
        String name = scan.nextLine();
        System.out.println("What is the patients dob?");
        String dob = scan.nextLine();
        System.out.println("What is the patients pmi?");
        int pmi = scan.nextInt();
        System.out.println("What is the reason for the appointment?");
        String appointmentReason = scan.nextLine();
        scan.next();
    }
    public static void readAppointment() {

    }
    public static void updateAppointment() {

    }
    public static void deleteAppointment() {

    }
}
