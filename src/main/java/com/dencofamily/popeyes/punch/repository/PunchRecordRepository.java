package com.dencofamily.popeyes.punch.repository;

import com.dencofamily.popeyes.punch.model.PunchRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PunchRecordRepository extends JpaRepository<PunchRecord, Long> {
}
