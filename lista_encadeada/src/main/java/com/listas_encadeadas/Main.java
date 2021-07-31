package com.listas_encadeadas;

public class Main {

	public static void main(String[] args) {
		ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<String>();
		minhaListaEncadeada.add("Item1");
		minhaListaEncadeada.add("Item2");
		minhaListaEncadeada.add("Item3");
		minhaListaEncadeada.add("Item4");
		
		System.out.println(minhaListaEncadeada.get(0));
		System.out.println(minhaListaEncadeada.get(1));
		System.out.println(minhaListaEncadeada.get(2));
		System.out.println(minhaListaEncadeada.get(3));
		
		System.out.println(minhaListaEncadeada);
		
		minhaListaEncadeada.remove(3);
		
		System.out.println(minhaListaEncadeada);		
	}
}
