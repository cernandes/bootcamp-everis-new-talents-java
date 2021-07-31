package com.lista_circular;

public class Main {

	public static void main(String[] args) {
		ListaCircular<String> minhaListaCircular = new ListaCircular<String>();

		minhaListaCircular.add("Item#0");
		System.out.println(minhaListaCircular);

		minhaListaCircular.remove(0);
		System.out.println(minhaListaCircular);

		minhaListaCircular.add("Item#1");
		System.out.println(minhaListaCircular);

		minhaListaCircular.add("Item#2");
		minhaListaCircular.add("Item#3");
		System.out.println(minhaListaCircular);

		System.out.println(minhaListaCircular.get(0));
		System.out.println(minhaListaCircular.get(1));
		System.out.println(minhaListaCircular.get(2));
		System.out.println(minhaListaCircular.get(3));

		for (int i = 0; i < 10; i++) {
			System.out.println(minhaListaCircular.get(i));
		}
	}
}
