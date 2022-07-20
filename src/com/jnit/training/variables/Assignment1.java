package com.jnit.training.variables;

public class Assignment1 {

	public static void main(String[] args) {
		Doctor doctor = new Doctor();
        doctor.doctor_name = "john";
        doctor.specalisation ="Dentist";
        Doctor.hospital = "NJ primary care";
        System.out.println("doctor_name : "+ doctor.doctor_name);
        System.out.println("specalisation : "+ doctor.specalisation);
        System.out.println("hospital : "+ Doctor.hospital);
        Patient patient = new Patient();
        patient.patient_name="chris";
        patient.patientId=123;
        patient.phone_number="12345678";
        
        System.out.println("patient_name : "+ patient.patient_name);
        System.out.println("specalisation : "+ patient.patientId);
        System.out.println("hospital : "+ Doctor.hospital);
        
        Patient patient1 = new Patient();
        System.out.println("patient_name="+ patient1.patient_name);
        System.out.println("specalisation"+ patient1.patientId);
        System.out.println("hospital="+ Doctor.hospital);
	}

}
