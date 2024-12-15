package SLT.InternRegistrationSystem.mapper;

import SLT.InternRegistrationSystem.dto.InternDto;
import SLT.InternRegistrationSystem.entity.Intern;

public class InternMapper {
    public static InternDto mapToInternDto(Intern intern) {
        return new InternDto(
                intern.getInternID(),
                intern.getName(),
                intern.getNic(),
                intern.getMobile(),
                intern.getEmail(),
                intern.getAddress(),
                intern.getInstitute(),
                intern.getStartDate(),
                intern.getEndDate(),
                intern.getSpecialization(),
                intern.getLanguages(),
                intern.getSupervisor(),
                intern.getTargetDate(),
                intern.getAssignedWork(),
                intern.getState()
        );
    }

    public static Intern mapToIntern(InternDto internDto) {
        return new Intern(
                internDto.getInternID(),
                internDto.getName(),
                internDto.getNic(),
                internDto.getMobile(),
                internDto.getEmail(),
                internDto.getAddress(),
                internDto.getInstitute(),
                internDto.getStartDate(),
                internDto.getEndDate(),
                internDto.getSpecialization(),
                internDto.getLanguages(),
                internDto.getSupervisor(),
                internDto.getTargetDate(),
                internDto.getAssignedWork(),
                internDto.getState()
        );
    }
}
