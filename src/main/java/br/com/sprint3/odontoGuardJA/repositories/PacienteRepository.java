package br.com.sprint3.odontoGuardJA.repositories;

import br.com.sprint3.odontoGuardJA.models.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
