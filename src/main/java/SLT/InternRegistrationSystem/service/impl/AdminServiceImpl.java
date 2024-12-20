package SLT.InternRegistrationSystem.service.impl;

import SLT.InternRegistrationSystem.dto.AdminDto;
import SLT.InternRegistrationSystem.entity.Admin;
import SLT.InternRegistrationSystem.mapper.AdminMapper;
import SLT.InternRegistrationSystem.repository.AdminRepository;
import SLT.InternRegistrationSystem.service.AdminService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AdminServiceImpl implements AdminService {
    private AdminRepository adminRepository;

    @Autowired
    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public AdminDto createAdmin(AdminDto adminDto) {
        Admin admin = AdminMapper.mapToAdmin(adminDto);
        Admin savedAdmin = adminRepository.save(admin);
        return AdminMapper.mapToAdminDto(savedAdmin);
    }

    @Override
    public boolean login(String email, String password) {
        Admin admin = adminRepository.findByEmail(email);
        if (admin != null) {
            return admin.getPassword().equals(password);
        }
        return false;
    }
}
