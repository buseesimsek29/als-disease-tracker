package com.buse.alstracker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SymptomLogDTO {

    private Long id;
    private String symptomName;
    private Integer severity;
    private String notes;
    private LocalDateTime logDate;
}