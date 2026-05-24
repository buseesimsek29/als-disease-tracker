package controller;

import entity.SymptomLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.SymptomLogService;

import java.util.List;

@RestController
@RequestMapping("/api/symptoms")
@CrossOrigin(origins = "*")
public class SymptomLogController {

    private final SymptomLogService symptomLogService;

    @Autowired
    public SymptomLogController(SymptomLogService symptomLogService) {
        this.symptomLogService = symptomLogService;
    }

    // 1. Tüm semptomları listeleme API'ı
    @GetMapping
    public ResponseEntity<List<SymptomLog>> getAllSymptomLogs() {
        return ResponseEntity.ok(symptomLogService.getAllSymptomLogs());
    }

    // 2. Yeni semptom ekleme API'ı
    @PostMapping
    public ResponseEntity<SymptomLog> createSymptomLog(@RequestBody SymptomLog symptomLog) {
        return ResponseEntity.ok(symptomLogService.createSymptomLog(symptomLog));
    }

    // 3. İsme göre filtreleme API'ı
    @GetMapping("/search")
    public ResponseEntity<List<SymptomLog>> getSymptomLogsByName(@RequestParam("name") String name) {
        return ResponseEntity.ok(symptomLogService.getSymptomLogsByName(name));
    }
}