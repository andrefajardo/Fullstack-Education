import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


// TODO: 15/01/2024 Lista de Tarefas
//  Crie uma classe Tarefa que irá conter todos os métodos a seguir.
//  Crie um método para adicionar tarefas à lista.
//  Crie um método para remover tarefas da lista.
//  Crie um método para marcar tarefas como concluídas.
//  Utilize um loop para exibir todas as tarefas na lista.
//  Implemente a funcionalidade de salvar e carregar a lista em um arquivo.
//  Adicione opções de filtragem, como exibir apenas tarefas concluídas ou não concluídas.
//  Coloque o programa em loop e pergunte ao fim de cada operação se o usuário deseja ou não
//  fechar o programa.


public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcao = -1;

        ArrayList<Tarefa> tarefas = new ArrayList<>();


        while (opcao != 6) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - ... Criar uma tarefa;");
            System.out.println("2 - ... Remover uma tarefa;");
            System.out.println("3 - ... Concluir uma tarefa;");
            System.out.println("4 - ... Listar uma tarefa;");
            System.out.println("5 - ... Salvar arquivo de tarefas;");
            System.out.println("6 - ... Sair");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1: {
                    Tarefa taf1 = new Tarefa();

                    System.out.println("Informe o CÓDIGO da tarefa: ");
                    Scanner scancod = new Scanner(System.in);
                    taf1.setCod(scancod.nextInt());

                    System.out.println("Informe a NOME da tarefa: ");
                    Scanner scannome = new Scanner(System.in);
                    taf1.setNome(scannome.nextLine());

                    System.out.println("Informe a DESCRIÇÃO da tarefa: ");
                    Scanner scandesc = new Scanner(System.in);
                    taf1.setDescricao(scandesc.nextLine());

                    System.out.println("Informe a DATA da tarefa: ");
                    Scanner scandata = new Scanner(System.in);
                    taf1.setData(scandata.nextLine());

                    taf1.setStatus(false);

                    tarefas.add(taf1);

                    break;
                }
                case 2: {
                    System.out.println("Informe o CÓDIGO da tarefa para DELETAR: ");
                    Scanner scancod = new Scanner(System.in);
                    int pos = scancod.nextInt()-1;
                    String nome = tarefas.get(pos).getNome();
                    System.out.println("DELETAR a tarefa: "+ nome +"? (1 - Sim | 2 - Não)");
                    int op = scancod.nextInt();
                    if (op == 1) {
                        tarefas.remove(pos);
                    }
                    break;
                }
                case 3: {
                    System.out.println("Informe o CÓDIGO da tarefa para CONCLUIR: ");
                    Scanner scancod = new Scanner(System.in);
                    int pos = scancod.nextInt()-1;
                    String nome = tarefas.get(pos).getNome();
                    System.out.println("Concluir a tarefa: "+ nome +"? (1 - Sim | 2 - Não)");
                    int op = scancod.nextInt();
                    if (op == 1) {
                        tarefas.get(pos).setStatus(true);
                    }
                    break;
                }
                case 4: {
                    System.out.println("Listar Tarefas: 1 - todas | 2 - Concluídas | 3 - Em aberto");
                    Scanner scancod = new Scanner(System.in);
                    int op = scancod.nextInt();
                    switch (op) {
                        case 1: {
                            for (Tarefa c:tarefas) {
                                if (c != null) {
                                    System.out.println(c.getCod());
                                    System.out.println(c.getNome());
                                    System.out.println(c.getStatus());
                                    System.out.println("-------------------");
                                }
                            }
                            break;
                        }
                        case 2: {
                            for (Tarefa c:tarefas) {
                                if ((c != null) && (c.getStatus())) {
                                    System.out.println(c.getCod());
                                    System.out.println(c.getNome());
                                    System.out.println(c.getStatus());
                                    System.out.println("-------------------");
                                }
                            }
                            break;
                        }
                        case 3: {
                            for (Tarefa c:tarefas) {
                                if ((c != null) && (!c.getStatus())) {
                                    System.out.println(c.getCod());
                                    System.out.println(c.getNome());
                                    System.out.println(c.getStatus());
                                    System.out.println("-------------------");
                                }
                            }
                            break;
                        }
                        default: {
                            break;
                        }
                    }
                    break;
                }
                case 5: {
                    try {
                        FileWriter arq = new FileWriter("d:\\Tarefas.txt", true);
                        PrintWriter gravarArq = new PrintWriter(arq);

                        for (Tarefa c : tarefas) {
                            if (c != null) {
                                gravarArq.printf("Código: ...... %d\n", c.getCod());
                                gravarArq.printf("Nome: ........ %s\n", c.getNome());
                                gravarArq.printf("Descrição: ... %s\n", c.getNome());
                                gravarArq.printf("Status: ...... %s\n", c.getStatus());
                                gravarArq.printf("\n-------------------------------\n");
                            }
                        }
                        arq.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                default: {
                    break;
                }
            }
        }
    }
}