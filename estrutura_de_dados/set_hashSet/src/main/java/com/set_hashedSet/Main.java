package com.set_hashedSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String args[]) {
		Set<Carro> hashSetCarros = new HashSet<Carro>();

		hashSetCarros.add(new Carro("Ford"));
		hashSetCarros.add(new Carro("Chevrolet"));
		hashSetCarros.add(new Carro("Fiat"));
		hashSetCarros.add(new Carro("Peugeot"));
		hashSetCarros.add(new Carro("Zip"));
		hashSetCarros.add(new Carro("Alfa Romeo"));

		System.out.println(hashSetCarros);

		Set<Carro> treeSetCarros = new TreeSet<Carro>();

		treeSetCarros.add(new Carro("Ford"));
		treeSetCarros.add(new Carro("Chevrolet"));
		treeSetCarros.add(new Carro("Fiat"));
		treeSetCarros.add(new Carro("Peugeot"));
		treeSetCarros.add(new Carro("Zip"));
		treeSetCarros.add(new Carro("Alfa Romeo"));

		System.out.println(treeSetCarros);

	}
}