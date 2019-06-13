package com.sda.patientportal.controller;

import com.sda.patientportal.repsitory.DoctorRepository;
import com.sda.patientportal.service.DoctorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/doctors")

public class DoctorController {
    private DoctorService doctorService;
}
