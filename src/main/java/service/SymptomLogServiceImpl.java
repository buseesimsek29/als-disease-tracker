package service;

import entity.SymptomLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.SymptomLogRepository;

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