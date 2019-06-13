package com.sda.patientportal.repsitory;

import com.sda.patientportal.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
