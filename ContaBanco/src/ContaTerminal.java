import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite sua Conta: ");
		int conta = scanner.nextInt();
		
		System.out.println("Por favor, digite sua Agencia: ");
		String agencia = scanner.next();
		
		System.out.println("Por favor, digite seu Nome: ");
		String nome = scanner.next();
		
		System.out.println("Por favor, digite seu Saldo: ");
		double saldo = scanner.nextDouble();
		
		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
		
		scanner.close();
	}

}
