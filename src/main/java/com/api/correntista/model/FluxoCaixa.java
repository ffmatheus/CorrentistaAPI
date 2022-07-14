package com.api.correntista.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.api.correntista.composite.domains.FluxoCaixaId;

import lombok.Data;

@Data
@Entity
@Table(name="fluxo_caixa")
@IdClass(FluxoCaixaId.class)

public class FluxoCaixa implements Serializable {

	@Id
	@Column(name = "ag")
	private int ag;
	@Id
	@Column(name = "conta")
	private int conta;
	@Id
	@Column(name = "fluxo")
	private int fluxo;
	@Column(name = "entrada")
	private Double entrada;
	@Column(name = "saida")
	private Double saida;
	
}
