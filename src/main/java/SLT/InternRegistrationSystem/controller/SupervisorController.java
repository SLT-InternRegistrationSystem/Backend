package SLT.InternRegistrationSystem.controller;


import SLT.InternRegistrationSystem.dto.SupervisorDto;
import SLT.InternRegistrationSystem.service.SupervisorService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
//@AllArgsConstructor
@RestController
@RequestMapping("/api/supervisors")
public class SupervisorController {
    private SupervisorService supervisorService;

    @Autowired
    public SupervisorController(SupervisorService supervisorService) {
        this.supervisorService = supervisorService;
    }

    //Build Add Supervisor REST API
    @PostMapping
    public ResponseEntity<SupervisorDto> createSupervisor(@RequestBody SupervisorDto supervisorDto) {
        SupervisorDto savedSupervisor = supervisorService.createSupervisor(supervisorDto);
        return new ResponseEntity<>(savedSupervisor, HttpStatus.CREATED);
    }

    //Build Get All Supervisors REST API
    @GetMapping
    public ResponseEntity<List<SupervisorDto>> getAllSupervisors() {
        List<SupervisorDto> supervisors = supervisorService.getAllSupervisors();
        return ResponseEntity.ok(supervisors);
    }
}
