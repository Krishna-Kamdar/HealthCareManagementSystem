package services;

import models.Patient;

import java.util.ArrayList;
import java.util.List;

public class PatientService {
    private List<Patient> patients = new ArrayList<>();

    public void registerPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient registered successfully: " + patient.getName());
    }

    public void viewAllPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients registered.");
        } else {
            System.out.println("List of Patients:");
            for (Patient patient : patients) {
                System.out.println(patient);
            }
        }
    }
}
