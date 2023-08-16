package com.werstef.Patient;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/patient")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @RequestMapping(value ={"/", ""}, method = RequestMethod.GET)
    public String getPatients(){
        return patientService.getAllPatients();
    }

    @RequestMapping(value = {"/add"}, method = RequestMethod.POST)
    public void addPatient(@RequestBody Patient patient){
        patientService.addPatient(patient);
    }

}
