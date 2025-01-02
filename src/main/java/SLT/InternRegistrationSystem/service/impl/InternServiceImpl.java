package SLT.InternRegistrationSystem.service.impl;

import SLT.InternRegistrationSystem.dto.InternDto;
import SLT.InternRegistrationSystem.entity.Intern;
import SLT.InternRegistrationSystem.exception.ResourceNotFoundException;
import SLT.InternRegistrationSystem.mapper.InternMapper;
import SLT.InternRegistrationSystem.repository.InternRepository;
import SLT.InternRegistrationSystem.service.InternService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
//@AllArgsConstructor
public class InternServiceImpl implements InternService {
    private InternRepository internRepository;

    @Autowired
    public InternServiceImpl(InternRepository internRepository) {
        this.internRepository = internRepository;
    }

    @Override
    public InternDto createIntern(InternDto internDto) {
        Intern intern = InternMapper.mapToIntern(internDto);
        if (intern.getState() == 0) { intern.setState(1); }
        Intern savedIntern = internRepository.save(intern);
        return InternMapper.mapToInternDto(savedIntern);
    }

    @Override
    public InternDto getInternById(String internId) {
        Intern intern = internRepository.findById(internId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Intern does not exist with the given id: " + internId));
        return InternMapper.mapToInternDto(intern);
    }

    @Override
    public List<InternDto> getAllInterns() {
        List<Intern> interns = internRepository.findAll();
        return interns.stream().map((intern) -> InternMapper.mapToInternDto(intern))
                .collect(Collectors.toList());
    }

    @Override
    public InternDto updateIntern(String internId, InternDto updatedIntern) {
        Intern intern = internRepository.findById(internId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Intern does not exist with the given id: " + internId));

        intern.setName(updatedIntern.getName());
        intern.setNic(updatedIntern.getNic());
        intern.setMobile(updatedIntern.getMobile());
        intern.setEmail(updatedIntern.getEmail());
        intern.setAddress(updatedIntern.getAddress());
        intern.setInstitute(updatedIntern.getInstitute());
        intern.setStartDate(updatedIntern.getStartDate());
        intern.setEndDate(updatedIntern.getEndDate());
        intern.setSpecialization(updatedIntern.getSpecialization());
        intern.setLanguages(updatedIntern.getLanguages());
        intern.setSupervisor(updatedIntern.getSupervisor());
        intern.setTargetDate(updatedIntern.getTargetDate());
        intern.setAssignedWork(updatedIntern.getAssignedWork());

        Intern updatedInternObj = internRepository.save(intern);
        return InternMapper.mapToInternDto(updatedInternObj);
    }

    @Override
    public InternDto deleteIntern(String internId) {
        Intern intern = internRepository.findById(internId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Intern does not exist with the given id: " + internId));
        intern.setState(0);
        Intern deletedInternObj = internRepository.save(intern);
        return InternMapper.mapToInternDto(deletedInternObj);
    }
}
