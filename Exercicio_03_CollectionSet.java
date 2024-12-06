package exercicio_03_CollectionSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_03_CollectionSet {

	public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<Integer>();	
		Integer n;
		
		Scanner leia = new Scanner(System.in);
		
		for (Integer i = 0; i <= 9; i = i + 1) {
			System.out.println("Digite um número inteiro não repetido: ");
			n = leia.nextInt();
			
			numeros.add(n);
		}
		
		System.out.println("\nListar dados do Set: ");
		for (Integer num : numeros) {
			System.out.println(num);
			
		}

	}

}
