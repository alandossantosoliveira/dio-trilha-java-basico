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
		
		//Exibir as mensagens para nosso usuário
		//Obter pela classe Scanner os valores digitados
		System.out.println("Por favor, digite o número da Agência !");
		numero = sc.nextInt();
		
		System.out.println("Por favor, digite a Agência !");
		sc.nextLine();
		agencia = sc.nextLine();
		
		System.out.println("Por favor, digite seu nome !");
		nomeCliente = sc.nextLine();
		
		System.out.println("Por favor, digite seu saldo !");
		saldo = sc.nextDouble();
		
		//Exibir a mensagem da conta criada.
		System.out.printf("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo %.2f já está disponível para saque. %n", saldo);
		
		sc.close();
	}

}
