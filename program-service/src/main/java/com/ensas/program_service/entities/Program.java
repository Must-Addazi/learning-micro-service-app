package com.ensas.program_service.entities;

import com.ensas.program_service.models.CModule;
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
    @OneToMany(mappedBy = "program" , cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<ProgramPoster> posterList;
    @ManyToOne
    private ResponsibleProgram responsibleProgram;
}
