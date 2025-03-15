package com.ensas.student_service.entities;

import com.ensas.student_service.enums.PaymentStatus;
import com.ensas.student_service.enums.PaymentType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Payment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    @Positive(message = "Le montant doit être supérieur à 0.")
    private double amount;
    @Enumerated(EnumType.STRING)
    private PaymentType type ;
    @Enumerated(EnumType.STRING)
    private PaymentStatus status= PaymentStatus.CREATED;
    @NotNull
    private String file;
    @ManyToOne
    private Student student;
}
