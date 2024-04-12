import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner (System.in);
        String nome = "Lucas Rodrigues Ribeiro";
        String tipoDeConta = "Conta Corrente";
        double saldoAtual = 500.00;

        System.out.println(String.format("""

                ********************************
                Dados Iniciais do Cliente:
                Nome: %s
                Tipo de Conta: %s
                Saldo Atual = R$%.2f
                ********************************

                """, nome, tipoDeConta, saldoAtual));
        
        int opcaoEscolhida = 0;

        while (opcaoEscolhida != 4) {
            System.out.println("""
                
                Operações:

                1 - Consultar Saldos
                2 - Depósito
                3 - Saque
                4 - Sair

                Digite a opção desejada:""");
                opcaoEscolhida = scanner.nextInt();

            if (opcaoEscolhida == 1) {
                System.out.println(String.format("O saldo atual de sua conta é R$%.2f", saldoAtual));

            } else if (opcaoEscolhida == 2) {
                System.out.println("Digite o valor para depósito:");
                double valorDeposito = scanner.nextDouble();
                saldoAtual += valorDeposito;
                System.out.println(String.format("O valor atualizado de seu saldo é R$%.2f", saldoAtual));

            } else if (opcaoEscolhida == 3) {
                System.out.println("Digite o valor para saque");
                double valorSaque = scanner.nextDouble();

                    if (valorSaque <= saldoAtual) {
                        saldoAtual -= valorSaque;
                        System.out.println(String.format("O valor atualizado de seu saldo 2é R$%.2f", saldoAtual));
                    } else {
                        System.out.println("Você digitou um valor inválido, verifique o saldo atual e tente novamente");
                    }

            } else if (opcaoEscolhida == 4) {
                System.out.println("Aplicação finalizada! Tenha uma excelente jornada 🥰");
                break;
            }

        }
        scanner.close();
    }
}
