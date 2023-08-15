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
    public List<String> getAllPatients() {
        //return patientRepository.findAll().toString();
        return List.of(new Patient("Efrem Stefan"
                ,"stefan1@gmail.com",
                LocalDate.of(1998, Month.JULY, 3),
                23).toString(),
                new Patient("Efrem Teodora"
                        ,"teodora2@gmail.com",
                        LocalDate.of(1998, Month.JULY, 20),
                        24).toString());
    }
}
