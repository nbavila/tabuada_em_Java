package empresa;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor da tabuada: ");
		int n = teclado.nextInt();
		
		for(int i=0; i<11; i++) {
			int total = n * i;
			System.out.println(n + " x "+ i + " = "+ total);
		}
	}

}
