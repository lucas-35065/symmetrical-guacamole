import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner (System.in);
        String nome = "Lucas Rodrigues Ribeiro";
        String tipoDeConta = "Conta Corrente";
        double saldoAtual = 500.00;
        int opcaoEscolhida = 0;

        System.out.println(String.format("""

                ********************************
                Dados Iniciais do Cliente:
                Nome: %s
                Tipo de Conta: %s
                Saldo Atual = R$%.2f
                ********************************

                """, nome, tipoDeConta, saldoAtual));

        String menu = """
                
        Operações:

        1 - Consultar Saldos
        2 - Depósito
        3 - Saque
        4 - Sair

        Digite a opção desejada:""";

        while (opcaoEscolhida != 4) {
            System.out.println(menu);

            opcaoEscolhida = scanner.nextInt();

            if (opcaoEscolhida == 1) {
                System.out.println(String.format("\n O saldo atual de sua conta é R$%.2f", saldoAtual));

            } else if (opcaoEscolhida == 2) {
                System.out.println("Digite o valor para depósito:");
                double valorDeposito = scanner.nextDouble();
                saldoAtual += valorDeposito;
                System.out.println(String.format("\n O valor atualizado de seu saldo é R$%.2f", saldoAtual));

            } else if (opcaoEscolhida == 3) {
                System.out.println("Digite o valor para saque");
                double valorSaque = scanner.nextDouble();

                    if (valorSaque <= saldoAtual) {
                        saldoAtual -= valorSaque;
                        System.out.println(String.format("\n O valor atualizado de seu saldo é R$%.2f", saldoAtual));
                    } else {
                        System.out.println("\n Você digitou um valor inválido, verifique o saldo atual e tente novamente");
                    }

            } else if (opcaoEscolhida == 4) {
                System.out.println("\n Aplicação finalizada! Tenha uma excelente jornada 🥰");
                break;
            } else {
                System.out.println("\n A opção digitada é inválida");
            }

        }
        scanner.close();
    }
}
