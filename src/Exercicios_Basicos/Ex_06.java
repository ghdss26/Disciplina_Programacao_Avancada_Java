
// Calcule o consumo médio de um automóvel sendo fornecidos a distância total 
// percorrida (em km) e o total de combustível  gasto (em litros) 

// Entrada = o arquivo de entrada contém dois valores: um valor inteiro x, 
// representando a distância total percorrida (em km) e um valor real Y, 
// representando o total de combustível gasto, com um dígito após o ponto 
// decimal. 

// Saída = Apresente o valor que representa o consumo médio do automóvel, 
// seguido da mensagem "km/l"

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		
		int x_distancia; 
		double x_combustivel;
		
		double total;
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Informe a distância percorrida"); 
		x_distancia = numero.nextInt(); 
		
		System.out.println("Informe o combustível gasto ?");
		x_combustivel = numero.nextDouble(); 
		
		total = x_distancia / x_combustivel;
		
		System.out.printf("O consumo médio de um automóvel é de: %.2f km/h",  total);
	}

}
