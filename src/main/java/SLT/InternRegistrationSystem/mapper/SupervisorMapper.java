package SLT.InternRegistrationSystem.mapper;

import SLT.InternRegistrationSystem.dto.SupervisorDto;
import SLT.InternRegistrationSystem.entity.Supervisor;

public class SupervisorMapper {
    public static SupervisorDto mapToSupervisorDto(Supervisor supervisor) {
        return new SupervisorDto(
                supervisor.getSupervisorID(),
                supervisor.getName(),
                supervisor.getSpecialization()
        );
    }

    public static Supervisor mapToSupervisor(SupervisorDto supervisorDto) {
        return new Supervisor(
                supervisorDto.getSupervisorID(),
                supervisorDto.getName(),
                supervisorDto.getSpecialization()
        );
    }
}
