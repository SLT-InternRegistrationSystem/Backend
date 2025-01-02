package SLT.InternRegistrationSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;



@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "supervisors")
public class Supervisor {
    @Id
    @GeneratedValue(generator = "supervisor-id-generator")
    @GenericGenerator(
            name = "supervisor-id-generator",
            strategy = "SLT.InternRegistrationSystem.util.SupervisorIDGenerator"
    )
    private String supervisorID;
    private String name;
    private String specialization;



    public String getSupervisorID() { return supervisorID; }
    public void setSupervisorID(String supervisorID) { this.supervisorID = supervisorID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }


    public Supervisor(String supervisorID, String name, String specialization) {
        this.supervisorID = supervisorID;
        this.name = name;
        this.specialization = specialization;
    }

    public Supervisor() {}
}
