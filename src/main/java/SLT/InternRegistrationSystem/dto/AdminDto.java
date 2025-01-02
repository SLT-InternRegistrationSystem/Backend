package SLT.InternRegistrationSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class AdminDto {
    private String adminID;
    private String email;
    private String password;


    public String getAdminID() { return adminID; }
    public void setAdminID(String adminID) { this.adminID = adminID; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }


    public AdminDto(String adminID, String email, String password) {
        this.adminID = adminID;
        this.email = email;
        this.password = password;
    }

    public AdminDto() {}
}
