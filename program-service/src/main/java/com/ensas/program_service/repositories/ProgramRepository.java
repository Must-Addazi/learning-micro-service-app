package com.ensas.program_service.repositories;

import com.ensas.program_service.entities.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramRepository extends JpaRepository<Program,String> {
}
