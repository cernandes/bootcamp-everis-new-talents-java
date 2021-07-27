package com.atribuicaoereferencia;

public class ReferenciaObj {
	Integer num;

	public ReferenciaObj(Integer num) {
		this.num = num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return this.num.toString();
	}
}
