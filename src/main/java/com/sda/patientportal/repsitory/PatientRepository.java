package com.sda.patientportal.repsitory;

import com.sda.patientportal.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
