package com.fila_fifo;

public class Fila {

	private No refNoEntradaFila;

	public Fila() {
		this.refNoEntradaFila = null;
	}

	public boolean isEmpty() {
		return refNoEntradaFila == null ? true : false;
	}

	public void enqueue(No novoNo) {
		novoNo.setRefNo(refNoEntradaFila);
		refNoEntradaFila = novoNo;
	}

	public No dequeue() {
		if (!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			No noAux = refNoEntradaFila;
			while (true) {
				if (primeiroNo.getRefNo() != null) {
					noAux = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();
				} else {
					noAux.setRefNo(null);
					break;
				}
			}
			return primeiroNo;
		}
		return null;
	}

	public No first() {
		if (!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			while (true) {
				if (primeiroNo.getRefNo() != null) {
					primeiroNo = primeiroNo.getRefNo();
				} else {
					break;
				}
			}
			return primeiroNo;
		}
		return null;
	}

	@Override
	public String toString() {
		String stringRetorno = "";
		No noAux = refNoEntradaFila;

		if (refNoEntradaFila != null) {
			while (true) {
				stringRetorno += "[No{objeto = " + noAux.getObject() + "}]--->";
				if (noAux.getRefNo() != null) {
					noAux = noAux.getRefNo();
				} else {
					stringRetorno += "null";
					break;
				}
			}
		} else {
			stringRetorno = "null";
		}
		return stringRetorno;
	}
}
