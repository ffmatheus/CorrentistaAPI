package com.api.correntista.composite.domains;

import java.io.Serializable;
import java.util.Objects;

public class FluxoCaixaId implements Serializable {

	private Integer ag;
	private Integer conta;
	private Integer fluxo;
	
	public FluxoCaixaId() {
    	
    }

    public FluxoCaixaId(Integer ag, Integer conta, Integer fluxo) {
        this.ag = ag;
        this.conta = conta;
        this.fluxo = fluxo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FluxoCaixaId fluxoCaixaId = (FluxoCaixaId) o;
        return ag.equals(fluxoCaixaId.ag) &&
               conta.equals(fluxoCaixaId.conta) &&
               fluxo.equals(fluxoCaixaId.fluxo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ag, conta, fluxo);
    }
}
