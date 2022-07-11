package com.api.correntista.repository;

import java.util.List;

import com.api.correntista.composite.domains.CorrentistaId;
import com.api.correntista.model.Correntista;

import org.springframework.data.repository.CrudRepository;

public interface CorrentistaRepository extends CrudRepository<Correntista, CorrentistaId>	{
	
	//Listar correntistas
	List<Correntista> findAll();
	
	//Deleta correntista
	void delete(Correntista correntista);
	
	//Salva correntista
	<CorrentistaMod extends Correntista> CorrentistaMod save(Correntista correntista);
	
}
