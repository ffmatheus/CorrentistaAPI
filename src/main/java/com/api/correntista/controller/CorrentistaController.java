package com.api.correntista.controller;

import java.util.List;

import com.api.correntista.model.Correntista;
import com.api.correntista.repository.CorrentistaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/correntistas")
public class CorrentistaController {
	
	@Autowired
	private CorrentistaRepository correntistaRepository;
	
	@GetMapping(path="/inicio")
	public String inicio() {
		return "Bem vindo a API de correntistas";
	}
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Correntista> readCorrentistas() {
		return correntistaRepository.findAll();
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public @ResponseBody Correntista createCorrenstista(@RequestBody Correntista correntista) {
		return correntistaRepository.save(correntista);
	}

}
