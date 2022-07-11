package com.api.correntista.composite.domains;

import java.io.Serializable;
import java.util.Objects;

public class CorrentistaId implements Serializable{
	
	 private Integer ag;
	 private Integer conta;

    public CorrentistaId() {
    }

    public CorrentistaId(Integer ag, Integer conta) {
        this.ag = ag;
        this.conta = conta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CorrentistaId correntistaId = (CorrentistaId) o;
        return ag.equals(correntistaId.ag) &&
                conta.equals(correntistaId.conta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ag, conta);
    }
}

