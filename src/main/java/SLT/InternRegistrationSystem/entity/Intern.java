package SLT.InternRegistrationSystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "interns")
public class Intern {
    @Id
    @GeneratedValue(generator = "intern-id-generator")
    @GenericGenerator(
            name = "intern-id-generator",
            strategy = "SLT.InternRegistrationSystem.util.InternIDGenerator"
    )
    private String internID;
    private String name;
    private String nic;
    private String mobile;
    private String email;
    private String address;
    private String institute;
    private LocalDate startDate;
    private LocalDate endDate;
    private String specialization;
    private String languages;
    private String supervisor;
    private LocalDate targetDate;
    private String assignedWork;
    @Column(columnDefinition = "int default 1")
    private int state;



    public String getInternID() { return internID; }
    public void setInternID(String internID) { this.internID = internID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getNic() { return nic; }
    public void setNic(String nic) { this.nic = nic; }

    public String getMobile() { return mobile; }
    public void setMobile(String mobile) { this.mobile = mobile; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getInstitute() { return institute; }
    public void setInstitute(String institute) { this.institute = institute; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public String getLanguages() { return languages; }
    public void setLanguages(String languages) { this.languages = languages; }

    public String getSupervisor() { return supervisor; }
    public void setSupervisor(String supervisor) { this.supervisor = supervisor; }

    public LocalDate getTargetDate() { return targetDate; }
    public void setTargetDate(LocalDate targetDate) { this.targetDate = targetDate; }

    public String getAssignedWork() { return assignedWork; }
    public void setAssignedWork(String assignedWork) { this.assignedWork = assignedWork; }

    public int getState() { return state; }
    public void setState(int state) { this.state = state; }



    public Intern(String internID, String name, String nic, String mobile, String email,
                  String address, String institute, LocalDate startDate, LocalDate endDate,
                  String specialization, String languages, String supervisor,
                  LocalDate targetDate, String assignedWork, int state) {
        this.internID = internID;
        this.name = name;
        this.nic = nic;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
        this.institute = institute;
        this.startDate = startDate;
        this.endDate = endDate;
        this.specialization = specialization;
        this.languages = languages;
        this.supervisor = supervisor;
        this.targetDate = targetDate;
        this.assignedWork = assignedWork;
        this.state = state;
    }

    public Intern() {}
}
