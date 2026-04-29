package com.amin.patientservice.service;

import com.amin.patientservice.dto.PatientResponseDto;
import com.amin.patientservice.mapper.PatientMapper;
import com.amin.patientservice.model.Patient;
import com.amin.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }
    public List<PatientResponseDto> getPatients(){
        List<Patient> patients = patientRepository.findAll();
        return patients.stream()
                .map(PatientMapper::toDto).toList();
    }
}
