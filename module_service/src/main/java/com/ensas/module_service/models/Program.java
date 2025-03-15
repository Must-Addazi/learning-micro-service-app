package com.ensas.module_service.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Program {
    private String id;
    private String name;
    private double price;
    private String timing;
    private String posterFile;
}
