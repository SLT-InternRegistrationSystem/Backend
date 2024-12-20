package SLT.InternRegistrationSystem.mapper;

import SLT.InternRegistrationSystem.dto.AdminDto;
import SLT.InternRegistrationSystem.entity.Admin;

public class AdminMapper {
    public static AdminDto mapToAdminDto(Admin admin) {
        return new AdminDto(
                admin.getAdminID(),
                admin.getEmail(),
                admin.getPassword()
        );
    }

    public static Admin mapToAdmin(AdminDto adminDto) {
        return new Admin(
                adminDto.getAdminID(),
                adminDto.getEmail(),
                adminDto.getPassword()
        );
    }
}
