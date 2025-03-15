package com.ensas.program_service.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ResponsibleProgram {
    @Id
    private String id;
    private String name;
    private String phoneNumber;
    @NotBlank
    @Column(unique = true)
    private String email;
    @OneToMany(mappedBy = "responsibleProgram", cascade = CascadeType.ALL)
    private Program program;
}
