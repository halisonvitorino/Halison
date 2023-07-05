package com.halisonvitorino.cadastro.repository;

import org.springframework.data.repository.CrudRepository;
import com.halisonvitorino.cadastro.models.PessoaFisica;

public interface CadastroRepositoryPf extends CrudRepository<PessoaFisica, String>{
		
	PessoaFisica findByCodigoPF(long codigoPF);	
}
