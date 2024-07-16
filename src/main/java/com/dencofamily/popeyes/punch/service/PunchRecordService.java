package com.dencofamily.popeyes.punch.service;

import com.dencofamily.popeyes.punch.model.PunchRecord;
import com.dencofamily.popeyes.punch.repository.PunchRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PunchRecordService {

    @Autowired
    private PunchRecordRepository punchRecordRepository;

    public List<PunchRecord> getAllPunchRecords() {
        return punchRecordRepository.findAll();
    }
}
