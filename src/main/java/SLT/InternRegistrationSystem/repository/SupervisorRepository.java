package SLT.InternRegistrationSystem.repository;

import SLT.InternRegistrationSystem.entity.Supervisor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupervisorRepository extends JpaRepository<Supervisor, String> {
}
