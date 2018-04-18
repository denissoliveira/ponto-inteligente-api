package br.com.pi.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.pi.api.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

	//Roda somente consulta, melhora o desempenho
	@Transactional(readOnly = true)
	Empresa findByCnpj(String cnpj);
	
}
