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

		Patient patient = new Patient();
		patient.setId(null);
		patient.setNom("Oumayma");
		patient.setMalade(true);
		patient.setScore(10);
		patient.setDateNaissance(new Date());


		Patient patient2= new Patient(null,"Hajar",new Date(),true,30);

		// en utilisant builder
		Patient patient3 = Patient.builder()
				.nom("Mehdi")
				.dateNaissance(new Date())
				.malade(false)
				.score(50)
				.build();
	}
}
