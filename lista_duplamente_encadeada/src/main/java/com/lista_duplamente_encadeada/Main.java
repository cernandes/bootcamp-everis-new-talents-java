package com.lista_duplamente_encadeada;

public class Main {

	public static void main(String args[]) {

		ListaDuplamenteEncadeada<String> minhaListaEncadeada = new ListaDuplamenteEncadeada<String>();

		minhaListaEncadeada.add("Item#1");
		minhaListaEncadeada.add("Item#2");
		minhaListaEncadeada.add("Item#3");
		minhaListaEncadeada.add("Item#4");
		minhaListaEncadeada.add("Item#5");
		minhaListaEncadeada.add("Item#6");
		minhaListaEncadeada.add("Item#7");

		System.out.println(minhaListaEncadeada);

		minhaListaEncadeada.remove(3);
		minhaListaEncadeada.add(3, "Item#99");

		System.out.println(minhaListaEncadeada);
		System.out.println(minhaListaEncadeada.get(3));
	}
}