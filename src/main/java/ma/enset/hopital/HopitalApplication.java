package ma.enset.hopital;

import ma.enset.hopital.entities.Patient;
import ma.enset.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(HopitalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
 /*       //premier facent d'ajouter un patient
        Patient patient = new Patient();
        patient.setId(null);
        patient.setNom("Oussama");
        patient.setDateNaissance(new Date());
        patient.setMalade(false);
        patient.setScore(23);

        //Deuxieme facent d'ajouter un patient
        Patient patient2 = new Patient(null,"Yassine",new Date(),false,123);

        //Troisieme facent d'ajouter un patient en utilisant builder
        Patient patient3 = Patient.builder()
                .nom("Imane")
                .dateNaissance(new Date())
                .score(56)
                .malade(true)
                .build(); */
		patientRepository.save(new Patient(null,"Oumayma",new Date(),false,34));
		patientRepository.save(new Patient(null,"Hanane",new Date(),false,3334));
		patientRepository.save(new Patient(null,"Mohammed",new Date(),true,114));

	}
}