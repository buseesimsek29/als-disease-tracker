package com.buse.alstracker.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SymptomLogDTO {

    private Long id;

    @NotBlank(message = "Semptom adı boş olamaz")
    private String symptomName;

    @Min(value = 1, message = "Şiddet minimum 1 olmalı")
    @Max(value = 5, message = "Şiddet maksimum 5 olmalı")
    private Integer severity;

    @NotBlank(message = "Not alanı boş olamaz")
    private String notes;

    private LocalDateTime logDate;
}