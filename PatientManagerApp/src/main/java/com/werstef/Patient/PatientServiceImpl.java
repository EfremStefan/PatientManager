package com.werstef.Patient;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService{

    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public String getAllPatients() {
        return patientRepository.findAll().toString();
    }

    @Override
    public void addPatient(Patient patient) {
        patientRepository.save(patient);
    }
}
