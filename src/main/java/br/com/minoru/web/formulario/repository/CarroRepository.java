package br.com.minoru.web.formulario.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.minoru.web.formulario.model.Carro;

@Repository
public interface CarroRepository extends CrudRepository<Carro, Integer>{
	
}
