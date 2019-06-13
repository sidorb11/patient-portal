package com.sda.patientportal.controller;

import com.sda.patientportal.model.Patient;
import com.sda.patientportal.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/patients")
public class PatientController {

    private PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }


    @PostMapping()
    public Patient createPatient(@RequestBody Patient patient) {
        return patientService.createPatient(patient);

    }

    @GetMapping
    public List<Patient> readPatients() {
        return patientService.getPatients();
    }

    @GetMapping(value = "/{id}")
    public Patient getPatient(@PathVariable Long id) {
        return patientService.getPatientById(id);

    }

    @DeleteMapping(value = "/{id}")
    public void deletePatientById(@PathVariable Long id) {
        patientService.deletePatient(id);
    }

    @PutMapping(value = "/{id}")
    public Patient updatePatient(@PathVariable Long id, @RequestBody Patient patient) {
        return patientService.updatePatient(patient);
    }
}
