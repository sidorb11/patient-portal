package com.sda.patientportal.controller;

import com.sda.patientportal.model.Patient;
import com.sda.patientportal.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/patients")
public class PatientController {

    private PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping(value = "/demo")
    public String demo() {
        return "hello demo http get";

    }

    @PostMapping(value = "/demo")
    public String demo1(@RequestBody String message) {
        return message + "hello demo http post";
    }

    @PostMapping()
    public Patient createPatient(@RequestBody Patient patient) {
        System.out.println("patient was created");
        return patient;
        //return patientService.createPatient(patient);

    }
}
