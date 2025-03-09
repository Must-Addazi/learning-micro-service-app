package com.ensas.program_service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Program {
    @Id
    private String id;
    private String name;
    private String responsibleName;
    private String ResponsibleEmail;
    private String ResponsiblePhone;
}
