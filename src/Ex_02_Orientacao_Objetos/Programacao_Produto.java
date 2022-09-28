package Ex_02_Orientacao_Objetos;

import java.util.Scanner;

public class Programacao_Produto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Produto p = new Produto();
		
		System.out.println("Informe o id do Produto: "); 
		p.setId(sc.nextInt());
		
		System.out.println(p.getId());

		sc.close();
		
	}

}
