package com.dencofamily.popeyes.punch.service;

import com.dencofamily.popeyes.punch.model.NewHire;
import com.dencofamily.popeyes.punch.repository.NewHireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewHireService {

    @Autowired
    private NewHireRepository newHireRepository;

    public List<NewHire> getAllNewHires() {
        return newHireRepository.findAll();
    }
}
