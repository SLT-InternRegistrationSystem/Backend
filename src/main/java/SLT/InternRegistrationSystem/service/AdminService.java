package SLT.InternRegistrationSystem.service;

import SLT.InternRegistrationSystem.dto.AdminDto;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {
    AdminDto createAdmin(AdminDto adminDto);

    boolean login(String username, String password);
}
