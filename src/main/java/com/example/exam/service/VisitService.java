package com.example.exam.service;

import com.example.exam.model.Visit;
import com.example.exam.repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VisitService {
    @Autowired
    private VisitRepository visitRepository;
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private PatientService patientService;

    public Visit get(Integer id) {
        return null;
    }

    public Visit getEntity(Integer id) {
        return null;
    }

    public Visit create(Visit dto) {
        return null;
    }

    public boolean update(Integer id, Visit visit) {
        return false;
    }


    public boolean delete(Integer id) {
        return false;
    }


}
