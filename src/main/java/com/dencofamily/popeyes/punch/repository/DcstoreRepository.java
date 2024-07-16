package com.dencofamily.popeyes.punch.repository;

import com.dencofamily.popeyes.punch.model.Dcstore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DcstoreRepository extends JpaRepository<Dcstore, Integer> {
}
