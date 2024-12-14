package SLT.InternRegistrationSystem.service;

import SLT.InternRegistrationSystem.dto.SupervisorDto;

import java.util.List;

public interface SupervisorService {
    SupervisorDto createSupervisor(SupervisorDto supervisorDto);

    List<SupervisorDto> getAllSupervisors();
}
