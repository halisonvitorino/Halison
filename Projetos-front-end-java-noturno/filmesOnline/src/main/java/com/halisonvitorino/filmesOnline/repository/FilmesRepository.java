package com.halisonvitorino.filmesOnline.repository;

import org.springframework.data.repository.CrudRepository;

import com.halisonvitorino.filmesOnline.models.*;

public interface FilmesRepository extends CrudRepository<Filme, String> {
	
	Filme findByCodigoFilme(long codigoFilme);	
}
