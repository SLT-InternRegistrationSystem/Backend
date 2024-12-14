package SLT.InternRegistrationSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SupervisorDto {
    private String supervisorID;
    private String name;
    private String specialization;



    public String getSupervisorID() { return supervisorID; }
    public void setSupervisorID(String supervisorID) { this.supervisorID = supervisorID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }



    public SupervisorDto(String supervisorID, String name, String specialization) {
        this.supervisorID = supervisorID;
        this.name = name;
        this.specialization = specialization;
    }

    public SupervisorDto() {}
}
