// TODO: 17/01/2024 Simulador de Banco:
//  Crie uma classe ContaBancaria com métodos para depósitos e saques.
//  Permita ao usuário criar uma conta bancária.
//  Implemente a lógica para depósitos e saques.
//  Exiba o saldo atual após cada transação.
//  Adicione a opção de criar várias contas.
//  Crie 2 contas bancárias no método main e transfira 100 reais de uma para a outra.
//  Utilize exceções para lidar com situações de saldo insuficiente.


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        int opcao = 0;
        int numConta = 1;
        while (opcao != 5) {
            System.out.println("=============================");
            System.out.println("      --- FC Bank SA --- ");
            System.out.println("=============================\n");
            System.out.println("Informe a operação a realizar: ");
            System.out.println("1 ------- Cria conta");
            System.out.println("2 ------- Depositar");
            System.out.println("3 ------- Sacar");
            System.out.println("4 ------- Transferir");
            System.out.println("5 ------- Sair");
            Scanner entrada = new Scanner(System.in);
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1: {
                    ContaBancaria Conta = new ContaBancaria(numConta);
                    contas.add(Conta);
                    System.out.println("=============================");
                    System.out.printf( " Conta %d criada com sucesso.\n", numConta);
                    System.out.println("=============================\n");
                    numConta++;
                    break;
                }
                case 2: {
                    System.out.println("Informe o número da conta:");
                    int numDeposito = entrada.nextInt();
                    System.out.println("Informe o valor do depósito:");
                    double valorDeposito = entrada.nextInt();
                    for (ContaBancaria c:contas ) {
                        if (c.getNumero() == numDeposito) {
                            c.depositar(numDeposito, valorDeposito);
                            System.out.printf("\nSaldo atual: %s\n", c.getSaldo());
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("Informe o número da conta:");
                    int numSaque = entrada.nextInt();
                    System.out.println("Informe o valor do saque:");
                    double valorSaque = entrada.nextInt();
                    for (ContaBancaria c:contas ) {
                        if (c.getNumero() == numSaque) {
                            c.sacar(numSaque, valorSaque);
                            System.out.printf("\nSaldo atual: %s\n", c.getSaldo());
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.println("Informe a conta de ORIGEM:");
                    int contaO = entrada.nextInt();
                    System.out.println("Informe a conta de DESTINO:");
                    int contaD = entrada.nextInt();
                    System.out.println("Informe o valor da transferência:");
                    double valorTransfer = entrada.nextDouble();
                    String transacao = "OK";
                    for (ContaBancaria c:contas ) {
                        if ((c.getNumero() == contaO) && (c.getSaldo() < valorTransfer)){
                            System.out.printf("\nSaldo atual da conta de ORIGEM: %s\n", c.getSaldo());
                            System.out.println("\nSaldo insuficiente. TRANSAÇÃO CANCELADA!\n");
                            transacao = "NOK";
                        }
                    }
                    if (transacao.equals("OK")) {
                        for (ContaBancaria c:contas ) {
                            if (c.getNumero() == contaO) {
                                c.sacar(contaO, valorTransfer);
                                System.out.printf("\nSaldo atual da conta de ORIGEM: %s\n", c.getSaldo());
                            }
                            if (c.getNumero() == contaD) {
                                c.depositar(contaD, valorTransfer);
                                System.out.printf("Saldo atual da conta de DESTINO: %s\n\n", c.getSaldo());
                            }
                        }
                    }
                    break;
                }
                default: {

                }
            }
        }
    }

}