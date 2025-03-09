package com.ensas.program_service.web;

import com.ensas.program_service.entities.Program;
import com.ensas.program_service.repositories.ProgramRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProgramRestController {
    private final ProgramRepository programRepository;
    @GetMapping("/programs")
    public List<Program> programList(){
        return programRepository.findAll();
    }
    @GetMapping("/programs/{id}")
    public Program getprogram(@PathVariable String id){
        return programRepository.findById(id).get();
    }
}
