package com.buse.alstracker.service; // Paket ismin güncellendi

import com.buse.alstracker.entity.SymptomLog;
import com.buse.alstracker.repository.SymptomLogRepository; // IMPORT YOLU DÜZELTİLDİ
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SymptomLogServiceImpl implements SymptomLogService {

    private final SymptomLogRepository symptomLogRepository;

    @Autowired
    public SymptomLogServiceImpl(SymptomLogRepository symptomLogRepository) {
        this.symptomLogRepository = symptomLogRepository;
    }

    @Override
    public List<SymptomLog> getAllSymptomLogs() {
        return symptomLogRepository.findAll();
    }

    @Override
    public SymptomLog createSymptomLog(SymptomLog symptomLog) {
        return symptomLogRepository.save(symptomLog);
    }

    @Override
    public List<SymptomLog> getSymptomLogsByName(String symptomName) {
        return symptomLogRepository.findBySymptomNameContainingIgnoreCase(symptomName);
    }
}