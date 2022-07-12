package com.api.correntista.repository;

import java.util.List;

import com.api.correntista.composite.domains.CorrentistaId;
import com.api.correntista.global.QueryUtils;
import com.api.correntista.model.Correntista;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CorrentistaRepository extends CrudRepository<Correntista, CorrentistaId>{
	
	//Listar correntistas
	List<Correntista> findAll();
	
	//Deleta correntista
	void delete(Correntista correntista);
	
	//Pesquisa por ag/conta 
	@Query(value = "SELECT * FROM correntista.correntista where ag = ?1 and conta = ?2", nativeQuery=true)
	Correntista findAllByAgConta(int ag, int conta);
	
	//Salva correntista
	<CorrentistaMod extends Correntista> CorrentistaMod save(Correntista correntista);
	
}
