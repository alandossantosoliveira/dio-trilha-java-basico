import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		//TODO:conhecer e importar a classe Scanner
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		//Exibir as mensagens para nosso usu�rio
		//Obter pela classe Scanner os valores digitados
		System.out.println("Por favor, digite o n�mero da Ag�ncia !");
		numero = sc.nextInt();
		
		System.out.println("Por favor, digite a Ag�ncia !");
		sc.nextLine();
		agencia = sc.nextLine();
		
		System.out.println("Por favor, digite seu nome !");
		nomeCliente = sc.nextLine();
		
		System.out.println("Por favor, digite seu saldo !");
		saldo = sc.nextDouble();
		
		//Exibir a mensagem da conta criada.
		System.out.printf("Ol� "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua ag�ncia � "+agencia+", conta "+numero+" e seu saldo %.2f j� est� dispon�vel para saque. %n", saldo);
		
		sc.close();
	}

}
