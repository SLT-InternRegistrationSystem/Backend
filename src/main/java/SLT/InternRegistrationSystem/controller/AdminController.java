package SLT.InternRegistrationSystem.controller;

import SLT.InternRegistrationSystem.dto.AdminDto;
import SLT.InternRegistrationSystem.service.AdminService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/admins")
public class AdminController {
    private AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping
    public ResponseEntity<AdminDto> createAdmin(@RequestBody AdminDto adminDto) {
        AdminDto savedAdmin = adminService.createAdmin(adminDto);
        return new ResponseEntity<>(savedAdmin, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<String> validateLogin(@RequestBody Map<String, String> loginDetails) {
        String email = loginDetails.get("email");
        String password = loginDetails.get("password");

        boolean isValid = adminService.login(email, password);
        if (isValid) {
            return ResponseEntity.ok("Login is valid.");
        } else {
            return ResponseEntity.status(401).body("Invalid email or password.");
        }
    }
}
