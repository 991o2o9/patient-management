package com.amin.patientservice.mapper;

import com.amin.patientservice.dto.PatientResponseDto;
import com.amin.patientservice.model.Patient;

public class PatientMapper {
    public static PatientResponseDto toDto(Patient patient){
        PatientResponseDto patientDto = new PatientResponseDto();
        patientDto.setId(patient.getId().toString());
        patientDto.setName(patient.getName());
        patientDto.setEmail(patient.getEmail());
        patientDto.setAddress(patient.getAddress());
        patientDto.setRegisteredData(patient.getDateOfBirth().toString());
        patientDto.setDateOfBirth(patient.getDateOfBirth().toString());
        return patientDto;
    }
}
