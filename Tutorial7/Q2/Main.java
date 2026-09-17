import doctor.Doctor;
import patient.Patient;

public class Main {

    // Maps a disease to the specialization that treats it
    static String requiredSpecialization(String disease) {
        switch (disease.toLowerCase()) {
            case "heart disease":
            case "hypertension":
            case "arrhythmia":
                return "Cardiology";
            case "migraine":
            case "epilepsy":
            case "stroke":
                return "Neurology";
            default:
                return "General Medicine";
        }
    }

    // Finds the doctor whose specialization matches the patient's disease
    static Doctor assignDoctor(Patient p, Doctor[] doctors) {
        String spec = requiredSpecialization(p.getDisease());
        for (Doctor d : doctors) {
            if (d.getSpecialization().equalsIgnoreCase(spec)) {
                return d;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Doctor[] doctors = {
            new Doctor(1, "Dr. Rajesh Kumar", "Cardiology", 800.0),
            new Doctor(2, "Dr. Sneha Patil", "Neurology", 1000.0)
        };

        Patient[] patients = {
            new Patient(101, "Amit Verma", "Heart Disease", 55),
            new Patient(102, "Neha Joshi", "Migraine", 32),
            new Patient(103, "Suresh Rao", "Hypertension", 61)
        };

        int[] patientCount = new int[doctors.length];

        System.out.println("========== PATIENT - DOCTOR ASSIGNMENTS ==========");
        for (Patient p : patients) {
            Doctor d = assignDoctor(p, doctors);
            System.out.println("Patient Details:");
            p.display();
            if (d != null) {
                System.out.println("Treated By:");
                d.display();
                for (int i = 0; i < doctors.length; i++) {
                    if (doctors[i] == d) {
                        patientCount[i]++;
                    }
                }
            } else {
                System.out.println("  No suitable doctor available.");
            }
            System.out.println("--------------------------------------------------");
        }

        System.out.println("\n========== CONSULTATION FEE SUMMARY ==========");
        for (int i = 0; i < doctors.length; i++) {
            double total = patientCount[i] * doctors[i].getConsultationFee();
            System.out.println(doctors[i].getName() + " (" + doctors[i].getSpecialization() + ")");
            System.out.println("  Patients Treated : " + patientCount[i]);
            System.out.println("  Total Fee        : Rs. " + total);
            System.out.println("----------------------------------------------");
        }
    }
}
