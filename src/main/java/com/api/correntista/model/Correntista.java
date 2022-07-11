package com.api.correntista.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.api.correntista.composite.domains.CorrentistaId;

import lombok.Data;

@Data
@Entity
@Table(name="correntista")
@IdClass(CorrentistaId.class)

public class Correntista implements Serializable{
	
	@Id
	@Column(name = "ag")
	private int ag;
	@Id
	@Column(name = "conta")
	private int conta;
	@Column(name = "nome")
	private String nome;
	@Column(name = "email")
	private String email;
	@Column(name = "telefone")
	private String telefone;
	@Column(name = "saldo")
	private Double saldo;

}
