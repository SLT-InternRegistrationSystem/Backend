package SLT.InternRegistrationSystem.service.impl;

import SLT.InternRegistrationSystem.dto.SupervisorDto;
import SLT.InternRegistrationSystem.entity.Intern;
import SLT.InternRegistrationSystem.entity.Supervisor;
import SLT.InternRegistrationSystem.mapper.InternMapper;
import SLT.InternRegistrationSystem.mapper.SupervisorMapper;
import SLT.InternRegistrationSystem.repository.SupervisorRepository;
import SLT.InternRegistrationSystem.service.SupervisorService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SupervisorServiceImpl implements SupervisorService {
    private SupervisorRepository supervisorRepository;

    @Autowired
    public SupervisorServiceImpl(SupervisorRepository supervisorRepository) {
        this.supervisorRepository = supervisorRepository;
    }

    @Override
    public SupervisorDto createSupervisor(SupervisorDto supervisorDto) {
        Supervisor supervisor = SupervisorMapper.mapToSupervisor(supervisorDto);
        Supervisor savedSupervisor = supervisorRepository.save(supervisor);
        return SupervisorMapper.mapToSupervisorDto(savedSupervisor);
    }

    @Override
    public List<SupervisorDto> getAllSupervisors() {
        List<Supervisor> supervisors = supervisorRepository.findAll();
        return supervisors.stream().map((supervisor) -> SupervisorMapper.mapToSupervisorDto(supervisor))
                .collect(Collectors.toList());
    }
}
