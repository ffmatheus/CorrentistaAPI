package com.api.correntista.controller;

import java.util.List;

import com.api.correntista.model.Correntista;
import com.api.correntista.repository.CorrentistaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/correntistas")
public class CorrentistaController {
	
	@Autowired
	private CorrentistaRepository correntistaRepository;
	
	@RequestMapping(value="/api/correntista", method=RequestMethod.GET)
	public String inicio() {
		return "Bem vindo a API de correntistas";
	}
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Correntista> readCorrentistas() {
		return correntistaRepository.findAll();
	}
	
	@RequestMapping(value="/{ag}/{conta}", method=RequestMethod.GET)
	public Correntista filterCorrentistas(@PathVariable int ag, @PathVariable int conta) {
		return correntistaRepository.findAllByAgConta(ag, conta);
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public Correntista createCorrenstista(@RequestBody Correntista correntista) {
	
		correntistaRepository.save(correntista);
	
		return correntista;
	}
	
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public Correntista updateCorrenstista(@RequestBody Correntista correntista) {

		correntistaRepository.save(correntista);
		
		return correntista;
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public Correntista deleteCorrentista(@RequestBody Correntista correntista) {
	
		correntistaRepository.delete(correntista);
	
		return correntista;
	}

}
