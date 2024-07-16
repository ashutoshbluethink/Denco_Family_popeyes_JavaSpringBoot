package com.dencofamily.popeyes.punch.service;

import com.dencofamily.popeyes.punch.model.PunchRecord;
import com.dencofamily.popeyes.punch.repository.PunchRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class CSVService {

    @Autowired
    private PunchRecordRepository punchRecordRepository;

    public List<String[]> processCSV(MultipartFile file) throws Exception {
        List<String[]> csvData = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            String line;
            // Read and discard the header line
            if ((line = reader.readLine()) != null) {
                // Skip header row
            }
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                csvData.add(data);

                PunchRecord punchRecord = new PunchRecord();
                punchRecord.setName(data[0]);
                punchRecord.setEmail(data[1]);
                punchRecord.setPhone(data[2]);
                punchRecord.setPunchIn(LocalTime.parse(data[3]));
                punchRecord.setBreakIn(LocalTime.parse(data[4]));
                punchRecord.setBreakOut(LocalTime.parse(data[5]));
                punchRecord.setPunchOut(LocalTime.parse(data[6]));
                punchRecord.setDate(LocalDate.parse(data[7], DateTimeFormatter.ofPattern("dd-MM-yyyy")));

                // Save the record to the database
                punchRecordRepository.save(punchRecord);
            }
        }
        return csvData;
    }
}
