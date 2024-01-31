// TODO: 30/01/2024 [M1S04] Ex 4 - Lista de cursos concluídos
//  Continuando nosso projeto! Vamos criar uma nova lista para armazenar os cursos que já
//  foram concluídos pelo usuário. Após criar a lista, será necessário adicionar mais
//  opções no menu. Novas opções (números são sugestões para executar as ações):
//  (4) Marcar como concluído
//  (5) Listar concluídos
//  Criar novas função (nome da função é apenas sugestão) "marcarComoConcluído":
//  utilizar a função "listarPedirIndice" (criada no Exercício 3)
//  adicionar na nova lista de concluídos o curso escolhido pelo usuário remover item
//  da lista de cursos utilizando a função "removerItem" (criada no Exercício 3).
//  Dessa forma o curso/professores será movido para a nova lista.

import java.util.ArrayList;
import java.util.Scanner;

public class Listagem {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<String> cursos = setupCursos();
        ArrayList<String> professores = setupProfessores();
        ArrayList<String> status = setupStatus();

        menu(entrada, cursos, professores, status);

    }

    // ============================== SEÇÃO DE SETUP - INÍCIO =================================//
    public static ArrayList<String> setupCursos() {
        ArrayList<String> cursos = new ArrayList<>();

        cursos.add("Psicologia");
        cursos.add("Direito");
        cursos.add("Medicina");
        cursos.add("Desenvolvimento de Sistemas");

        return  cursos;
    }

    public static ArrayList<String> setupProfessores() {
        ArrayList<String> professores = new ArrayList<>();

        professores.add("Zequinha");
        professores.add("Mariana");
        professores.add("Roberval");
        professores.add("Feitosa");

        return professores;
    }

    public static ArrayList<String> setupStatus() {
        ArrayList<String> status = new ArrayList<>();

        status.add("Aberto");
        status.add("Aberto");
        status.add("Concluído");
        status.add("Concluído");

        return  status;
    }

    public static void msgErro() {
        System.out.print("=======================================================\n");
        System.out.print("=====                Opção INVÁLIDA!              =====\n");
        System.out.print("=======================================================\n");

    }

    public static void menu(Scanner entrada, ArrayList cursos, ArrayList professores, ArrayList status) {

        SAIR_DO_LOOP:
        do {
            System.out.println("\n=======================================================");
            System.out.println("=====              Listagem de Cursos             =====");
            System.out.println("=======================================================");
            System.out.println("=====             Escolha uma opção:              =====");
            System.out.println("=====   (l) para listar                           =====");
            System.out.println("=====   (a) para adicionar                        =====");
            System.out.println("=====   (r) para remover                          =====");
            System.out.println("=====   (c) para concluir                         =====");
            System.out.println("=====   (r) para remover                          =====");
            System.out.println("=====   (s) para sair                             =====");
            System.out.println("=======================================================");
            System.out.print("===== Opção: ");
            String opcao = entrada.next();

            // Consumir "ENTER" perdido
            entrada.nextLine();

            switch (opcao) {
                case "s":{
                    entrada.close();
                    break SAIR_DO_LOOP; // Label que aponta para a sua referência ("mesmo_nome:") no ponto exterior do loop "Do While".
                }
                case "a": {
                    adicionar(entrada, cursos, professores, status);
                    listarTodos(cursos, professores, status);
                    break;
                }
                case "r": {
                    remover(entrada, cursos, professores, status);
                    break;
                }
                case "l": {
                    listar(cursos, professores, status);
                    break ;
                }
                default:{
                    msgErro();
                    break;
                }
            }
        } while (true);
    }

    // ============================== SEÇÃO DE SETUP - FIM =================================//
    public static void listar(ArrayList cursos, ArrayList professores, ArrayList status) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.println("=====   (t) para todos                            =====");
        System.out.println("=====   (c) para concluídos                       =====");
        System.out.println("=======================================================");
        System.out.print("===== Opção: ");
        String op = entrada.next();
        if (op.equals("t")) {
            listarTodos(cursos, professores, status);
        } else if (op.equals("c")) {
            listarConcluidos(cursos, professores, status);
        } else {
            msgErro();
        }
    }

    public static void adicionar(Scanner entrada, ArrayList cursos, ArrayList professores, ArrayList status) {
        //Scanner teste = new Scanner(System.in);
        System.out.print("Informe o curso: ");
        String itemCurso = entrada.nextLine();
        System.out.print("Informe o Professor: ");
        String itemProf = entrada.nextLine();
        status.add("Aberto");
        cursos.add(itemCurso);
        professores.add(itemProf);
    }

    public static void remover(Scanner entrada, ArrayList cursos, ArrayList professores, ArrayList status) {
        System.out.print("\nLista atual: \n");
        listar(cursos, professores, status);
        System.out.print("Informe o indice para remoção: ");
        int indice = entrada.nextInt();
        if (cursos.size() > indice){
            System.out.printf("Confirma a exclusão do item (%s)? (s)im/(n)ão: ", cursos.get(indice));
            String ok = entrada.next();
            if (ok.equals("s")) {
                cursos.remove(indice);
                professores.remove(indice);
            }
        } else {
            msgErro();
        }
    }

    public static void listarTodos(ArrayList cursos, ArrayList professores, ArrayList status) {
        for (int i = 0; i < cursos.size(); i++) {
            String itemCurso = cursos.get(i).toString();
            String itemProf = professores.get(i).toString();
            String itemStatus = status.get(i).toString();
            System.out.println(i + " - " + itemCurso + " - " + itemProf + " ===> " + itemStatus);
        }
    }

    public static void listarConcluidos(ArrayList cursos, ArrayList professores, ArrayList status) {
        for (int i = 0; i < status.size(); i++) {
            String itemStatus = status.get(i).toString();
            if (itemStatus.equals("Concluído")) {
                String itemCurso = cursos.get(i).toString();
                String itemProf = professores.get(i).toString();
                System.out.println(i + " - " + itemCurso + " - " + itemProf + " ===> " + itemStatus);
            }
        }
    }
}