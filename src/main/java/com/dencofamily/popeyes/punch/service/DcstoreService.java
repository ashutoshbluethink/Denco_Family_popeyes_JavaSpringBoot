package com.dencofamily.popeyes.punch.service;

import com.dencofamily.popeyes.punch.model.Dcstore;
import com.dencofamily.popeyes.punch.repository.DcstoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DcstoreService {

    @Autowired
    private DcstoreRepository dcstoreRepository;

    public List<Dcstore> getAllStores() {
        return dcstoreRepository.findAll();
    }
}