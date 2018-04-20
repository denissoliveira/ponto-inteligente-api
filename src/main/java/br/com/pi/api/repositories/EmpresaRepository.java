package br.com.pi.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.pi.api.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

	/*
	 * definida para tal, assim o acesso é mais rápido, uma vez que não existirá
	 * a​ ​ necessidade​ ​ de​ ​ nenhum​ ​ tipo​ ​ de​ ​ lock​ ​ no​ ​ banco
	 */
	@Transactional(readOnly = true)
	Empresa findByCnpj(String cnpj);
	
}
