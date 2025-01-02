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
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "admins")
public class Admin {
    @Id
    @GeneratedValue(generator = "admin-id-generator")
    @GenericGenerator(
            name = "admin-id-generator",
            strategy = "SLT.InternRegistrationSystem.util.AdminIDGenerator"
    )
    private String adminID;
    private String email;
    private String password;


    public String getAdminID() { return adminID; }
    public void setAdminID(String adminID) { this.adminID = adminID; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }


    public Admin(String adminID, String email, String password) {
        this.adminID = adminID;
        this.email = email;
        this.password = password;
    }

    public Admin() {}
}
