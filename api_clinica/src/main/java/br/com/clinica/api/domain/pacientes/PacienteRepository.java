package br.com.clinica.api.domain.pacientes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository <Paciente, Long> {
    //Page<Paciente> findAllByAtivoTrue(Pageable paginacao);
}

