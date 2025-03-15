package com.ensas.program_service.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class CModule {
    @Id
   private String id;
   private String name;
   private String teacherName;
   private String hourlyVolume;
   private String file;
}
