package service;

import entity.SymptomLog;
import java.util.List;

public interface SymptomLogService {
    // Tüm semptom kayıtlarını listeleme
    List<SymptomLog> getAllSymptomLogs();

    // Yeni semptom kaydı ekleme
    SymptomLog createSymptomLog(SymptomLog symptomLog);

    // Semptom adına göre filtreleme (Repository'deki derya sorgusunu çağıracak)
    List<SymptomLog> getSymptomLogsByName(String symptomName);
}