package ma.enset.hopital.repository;

import ma.enset.hopital.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {


    Page<Patient> findByNomContainsIgnoreCase(String keyword, PageRequest of);
}
