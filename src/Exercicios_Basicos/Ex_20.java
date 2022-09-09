/** 
 * A ELETROSHOCK S.A. é uma empresa de distribuição de energia bastante 
 * justa (pelo menos ela se diz ser!). Ela faz cobrança proporcional com a renda da
 * família e do bairro. O programa deve imprimir uma mensagem de erro caso o bairro 
 * digitado seja inválido. Além disso, caso a renda da pessoa caia fora das faixas da 
 * tabela, não haverá desconto. Se a renda OU o consumo forem valores negativos, 
 * deve ser emitida uma mensagem de erro. 
 * 
 * O programa deve ler o código do bairro (S: Santa Ana; I: Industriários; T: Tabatinga), 
 * a renda da família e o consumo em reais e obter o desconto de acordo com a tabela 
 * 
 * Entrada = Um caractere que indica o bairro do cliente (Santa Ana, Industriários, Tabatinga), 
 * o valor da renda do usuário e seu consumo energético em reais. 
 * 
 * Saída = Quanto a pessoa vai pagar já com o desconto. Caso a renda da pessoa caia fora 
 * das faixas da tabela, não haverá desconto.
 */
package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_20 {

	public static void main(String[] args) {
		
		int codigo; 
		double renda = 0; 
		double consumo = 0; 
		
		double pagamento = 0;
		double valor = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite na tela os seguintes números: \n");
		System.out.println("1 - Sobre o Bairro de Santa Ana ");
		System.out.println("2 - Sobre o Bairro de Industriários ");
		System.out.println("3 - Sobre o Bairro de Santa Ana \n");
		System.out.println("Não digite outro número: \n");
		
		System.out.println("Informe o código do bairro: ");
		codigo = sc.nextInt(); 
		
		if(codigo > 3 || codigo < 1) {
			
			System.out.println("Stop");
		}
		
		switch (codigo) {
		
		case 1:
			
			System.out.println("Bairro de Santa Ana: ");
			
			System.out.println("Informe a renda: ");
			renda = sc.nextDouble(); 
			
			System.out.println("Informe o consumo: "); 
			consumo = sc.nextDouble(); 
			
			
			
			if(renda >= 50 && renda <= 500) {
				
				if (consumo < 0) {
					
					System.out.println("Interromper");
					break;
				}
				
				double desconto = 50;
				
				pagamento = consumo - desconto;
				
			} else if(renda >= 500 && renda <= 1000 ) {
				
				if (consumo < 0) {
					
					System.out.println("Interromper");
					break;
				}
				
				double desconto = 25;
				pagamento = consumo - desconto;
				
			} 
			
			System.out.printf("Valor do Pagamento com desconto é: %.2f ", pagamento);
			
			break;
			
		case 2: 
			
			System.out.println("Bairro de Industriários: ");
			
			System.out.println("Informe a renda: ");
			renda = sc.nextDouble(); 
			
			System.out.println("Informe o consumo: "); 
			consumo = sc.nextDouble(); 
			
			if(renda >= 240 && renda <= 1000) {
				
				if (consumo < 0) {
					
					System.out.println("Interromper");
					break;
				}
				
				double desconto = 240;
				pagamento = consumo - desconto;
		
				
			} else if(renda >= 1000 && renda <= 5000) {
				
				if (consumo < 0) {
					
					System.out.println("Interromper");
					break;
				}
				
				double desconto = 120;
				pagamento = consumo - desconto;
			
			}
			
			System.out.println("Valor do Pagamento com desconto é:  " + pagamento);
			
			break;
		
		case 3:
			
			System.out.println("Bairro de Tabatinga: ");
			
			System.out.println("Informe a renda: ");
			renda = sc.nextDouble(); 
			
			System.out.println("Informe o consumo: "); 
			consumo = sc.nextDouble(); 
			
			if(renda >= 5000) {
				
				if (consumo < 0) {
					
					System.out.println("Interromper");
					break;
				}
				
				double desconto = 720;
				pagamento = consumo - desconto;
			
				
			} else if(renda <= 20000) {
				
				if (consumo < 0) {
					
					System.out.println("Interromper");
					break;
				}
				
				double desconto = 360;
				pagamento = consumo - desconto;
				
			}
			
			System.out.println("Valor do Pagamento com desconto é:  " + pagamento);
			
			break;
		}
		
	}

}
