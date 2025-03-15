package com.ensas.student_service.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Program {
    @Id
    private String id;
    private String name;
    @Positive(message = "Le montant doit être supérieur à 0.")
    private double price;
    private String timing;
    private String posterFile;
}
