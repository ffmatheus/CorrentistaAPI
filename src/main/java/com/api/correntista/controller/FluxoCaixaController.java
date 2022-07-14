package com.api.correntista.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.correntista.model.FluxoCaixa;
import com.api.correntista.repository.FluxoCaixaRepository;

@RestController
@RequestMapping("/api/fluxo")

public class FluxoCaixaController {

	@Autowired
	private FluxoCaixaRepository fluxoCaixaRepository;
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<FluxoCaixa> readFluxoCaixa() {
		return fluxoCaixaRepository.findAll();
	}
	
	@RequestMapping(value="/{ag}/{conta}", method=RequestMethod.GET)
	public List<FluxoCaixa> filterFluxoCaixa(@PathVariable int ag, @PathVariable int conta) {
		return fluxoCaixaRepository.findAllByAgConta(ag, conta);
	}
}
