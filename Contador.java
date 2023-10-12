import java.util.Scanner;

public class Contador {
 	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		
		try {
			
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException exception) {
			
			System.out.println(exception.getMessage());
		}
		
		terminal.close();
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		int contagem = parametroDois - parametroUm;
		
		
		
		if (contagem > 0) {
			for (int i = 0; i < contagem; i ++) {
				System.out.println("Imprimindo o número " + (i + 1));
			}
		} else {
			throw new ParametrosInvalidosException();
		}
		
	}
}
