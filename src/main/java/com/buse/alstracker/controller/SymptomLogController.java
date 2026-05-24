package com.buse.alstracker.controller;

import com.buse.alstracker.dto.SymptomLogDTO;
import com.buse.alstracker.entity.Patient;
import com.buse.alstracker.entity.SymptomLog;
import com.buse.alstracker.exception.ResourceNotFoundException;
import com.buse.alstracker.repository.PatientRepository;
import com.buse.alstracker.repository.SymptomLogRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/symptoms")
@CrossOrigin(origins = "*")
public class SymptomLogController {

    @Autowired
    private SymptomLogRepository symptomLogRepository;

    @Autowired
    private PatientRepository patientRepository;

    // TÜM semptomları getir
    @GetMapping
    public List<SymptomLog> getAllSymptomLogs() {
        return symptomLogRepository.findAll();
    }

    // SEARCH endpoint EKLENDİ
    @GetMapping("/search")
    public List<SymptomLog> searchSymptoms(@RequestParam String name) {
        return symptomLogRepository
                .findBySymptomNameContainingIgnoreCase(name);
    }

    // Yeni semptom ekle
    @PostMapping
    public SymptomLog createSymptomLog(
            @Valid @RequestBody SymptomLogDTO dto,
            @RequestParam Long patientId) {

        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Hasta bulunamadı!"));

        SymptomLog symptomLog = new SymptomLog();

        symptomLog.setSymptomName(dto.getSymptomName());
        symptomLog.setSeverity(dto.getSeverity());
        symptomLog.setNotes(dto.getNotes());
        symptomLog.setLogDate(LocalDateTime.now());
        symptomLog.setPatient(patient);

        return symptomLogRepository.save(symptomLog);
    }

    // Güncelle
    @PutMapping("/{id}")
    public SymptomLog updateSymptom(
            @PathVariable Long id,
            @Valid @RequestBody SymptomLogDTO dto) {

        SymptomLog existing = symptomLogRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Semptom kaydı bulunamadı!"));

        existing.setSymptomName(dto.getSymptomName());
        existing.setSeverity(dto.getSeverity());
        existing.setNotes(dto.getNotes());

        return symptomLogRepository.save(existing);
    }

    // Sil
    @DeleteMapping("/{id}")
    public void deleteSymptom(@PathVariable Long id) {
        symptomLogRepository.deleteById(id);
    }
}