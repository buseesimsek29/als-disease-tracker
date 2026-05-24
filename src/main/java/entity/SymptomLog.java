package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "symptom_logs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SymptomLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String symptomName;

    @Column(nullable = false)
    private Integer severity;

    private String notes;

    @Column(nullable = false)
    private LocalDateTime logDate;

    @PrePersist
    protected void onCreate() {
        this.logDate = LocalDateTime.now();
    }
}