package SLT.InternRegistrationSystem.repository;

import SLT.InternRegistrationSystem.entity.Intern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternRepository extends JpaRepository<Intern, String> {

}
