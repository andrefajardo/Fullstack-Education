// TODO: 30/01/2024 [M1S04] Ex 3 - Lista de cursos e professores -
//  Nova opção no menu. Após esta refatoração realizada no Exercício 2, adicione
//  uma opção no menu para que o curso/professores seja removido. Nova opção
//  (números são sugestões para executar as ações):
//  (3) Remover
//  Criar 3 novas funções (nomes das funções são apenas sugestões):
//    "listarPedirIndice":
//        -> utilizar a função de listagem (com índices - conforme alterado no Exercício 2)
//        -> pedir ao usuário que escolha um item da lista
//        -> retornar o índice escolhido
//    "removerItemLista":
//        -> utilizar a função "listarPedirIndice"
//        -> utilizar a função "removerItem" (próxima função a ser criada) e passar como parâmetro o índice retornado da função "listarPedirIndice"
//    "removerItem":
//        -> precisa receber o índice por parâmetro
//        -> na sequência realizar a remoção do item existente no índice


import java.util.ArrayList;
import java.util.Scanner;

public class Listagem {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<String> cursos = new ArrayList<>();
        ArrayList<String> professores = new ArrayList<>();


        cursos.add("Psicologia");
        cursos.add("Direito");
        cursos.add("Medicina");
        cursos.add("Desenvolvimento de Sistemas");

        professores.add("Zequinha");
        professores.add("Mariana");
        professores.add("Roberval");
        professores.add("Feitosa");

        System.out.println("=======================================================");
        System.out.println("=====              Listagem de Cursos             =====");
        System.out.println("=======================================================");

        SAIR_DO_LOOP:
        do {

            System.out.print("Deseja (l)istar | (a)dicionar | (r)emover | (s)air: ");
            String opcao = entrada.next();

            switch (opcao) {
                case "s":{
                    break SAIR_DO_LOOP; // Label que aponta para a sua referência ("mesmo_nome:") no ponto exterior do loop "Do While".
                }
                case "a": {
                    adicionar(cursos, professores);
                    listar(cursos, professores);
                    opcao = "l";
                    break;
                }
                case "r": {
                    remover(cursos, professores);
                    opcao = "l";
                    break;
                }
                case "l": {
                    listar(cursos, professores);
                    break ;
                }
                default:{
                    System.out.print("==========================================.\n");
                    System.out.print("=====         Opção INVÁLIDA!        =====.\n");
                    System.out.print("==========================================.\n");
                    break;
                }
            }
        } while (true);
    }

    public static void listar(ArrayList cursos, ArrayList professores) {
        for (int i = 0; i < cursos.size(); i++) {
            String item = cursos.get(i).toString();
            System.out.print(i + " - " + item + " - ");
            item = professores.get(i).toString();
            System.out.println(item);
        }
    }

    public static void adicionar(ArrayList cursos, ArrayList professores) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o curso: ");
        String item = entrada.nextLine();
        cursos.add(item);
        System.out.print("Informe o Professor: ");
        item = entrada.nextLine();
        professores.add(item);
    }

    public static void remover(ArrayList cursos, ArrayList professores) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nLista atual: \n");
        listar(cursos, professores);
        System.out.print("Informe o indice para remoção: ");
        int indice = entrada.nextInt();
        System.out.printf("Confirma a exclusão do item (%s)? (s)im/(n)ão: ", cursos.get(indice));
        String ok = entrada.next();
        if (ok.equals("s")){
            cursos.remove(indice);
            professores.remove(indice);
        } else {
            System.out.print("==========================================.\n");
            System.out.print("=====         Opção INVÁLIDA!        =====.\n");
            System.out.print("==========================================.\n");
        }
    }
}