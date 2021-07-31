package com.lista_duplamente_encadeada;

public class ListaDuplamenteEncadeada<T> {

	private NoDuplo<T> primeiroNo;
	private NoDuplo<T> ultimoNo;

	private int tamanhoLista = 0;

	public void add(T elemento) {
		NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
		novoNo.setNoPosterior(null);
		novoNo.setNoAnterior(ultimoNo);
		if (primeiroNo == null) {
			primeiroNo = novoNo;
		}
		if (ultimoNo != null) {
			ultimoNo.setNoPosterior(novoNo);
		}
		ultimoNo = novoNo;
		tamanhoLista++;
	}

	public void add(int index, T elemento) {
		NoDuplo<T> noAuxiliar = getNo(index);
		NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
		novoNo.setNoPosterior(noAuxiliar);

		if (novoNo.getNoPosterior() != null) {
			novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
			novoNo.getNoPosterior().setNoAnterior(novoNo);
		} else {
			novoNo.setNoAnterior(ultimoNo);
			ultimoNo = novoNo;
		}
		if (index == 0) {
			primeiroNo = novoNo;
		} else {
			novoNo.getNoAnterior().setNoPosterior(novoNo);
		}
		tamanhoLista++;
	}

	public void remove(int index) {
		if (index == 0) {
			primeiroNo = primeiroNo.getNoPosterior();
			if (primeiroNo != null) {
				primeiroNo.setNoAnterior(null);
			}
		} else {
			NoDuplo<T> noAuxiliar = getNo(index);
			noAuxiliar.getNoAnterior().setNoPosterior(noAuxiliar.getNoPosterior());
			if (noAuxiliar != ultimoNo) {
				noAuxiliar.getNoPosterior().setNoAnterior(noAuxiliar.getNoAnterior());
			} else {
				ultimoNo = noAuxiliar;
			}
		}
		tamanhoLista--;
	}

	public T get(int index) {
		return getNo(index).getConteudo();
	}

	private NoDuplo<T> getNo(int index) {
		NoDuplo<T> noAuxiliar = primeiroNo;
		for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
			noAuxiliar = noAuxiliar.getNoPosterior();
		}
		return noAuxiliar;
	}

	public int size() {
		return tamanhoLista;
	}

	@Override
	public String toString() {
		String strRetorno = "";
		NoDuplo<T> noAuxiliar = primeiroNo;
		for (int i = 0; i < size(); i++) {
			strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
			noAuxiliar = noAuxiliar.getNoPosterior();
		}
		strRetorno += "null";
		return strRetorno;
	}
}