package com.halisonvitorino.cadastro.repository;

import org.springframework.data.repository.CrudRepository;
import com.halisonvitorino.cadastro.models.PessoaJuridica;

public interface CadastroRepositoryPj extends CrudRepository<PessoaJuridica, String>{
	
	PessoaJuridica findByCodigoPJ(long codigoPJ);

}
