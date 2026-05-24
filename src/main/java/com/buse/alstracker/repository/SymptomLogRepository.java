package com.buse.alstracker.repository;

import com.buse.alstracker.entity.SymptomLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SymptomLogRepository extends JpaRepository<SymptomLog, Long> {

    List<SymptomLog> findBySymptomNameContainingIgnoreCase(String symptomName);

}