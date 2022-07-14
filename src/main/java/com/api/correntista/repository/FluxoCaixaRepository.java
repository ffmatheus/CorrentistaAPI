package com.api.correntista.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.api.correntista.composite.domains.FluxoCaixaId;
import com.api.correntista.model.FluxoCaixa;

public interface FluxoCaixaRepository extends CrudRepository<FluxoCaixa, FluxoCaixaId> {

	//Listar fluxo caixa
	List<FluxoCaixa> findAll();
	
	//Pesquisa por ag/conta 
	@Query(value = "SELECT * FROM correntista.fluxo_caixa where ag = ?1 and conta = ?2", nativeQuery=true)
	List<FluxoCaixa> findAllByAgConta(int ag, int conta);
}
