// TODO: 30/01/2024 [M1S04] Ex 2 - Lista de cursos e professores -
//  Com menu de opções vamos melhorar nosso sistema!
//  O usuário precisa manipular as listas de cursos e professores,
//  portanto precisaremos adicionar a funcionalidade de um menu de opções:
//  Opções (números são sugestões para executar as ações):
//  (1) Listar
//  (2) Adicionar
//  (0) Sair
//  Quando a opção escolhida for "Listar", utilizar a função de listagem criada no Exercício 1.
//  Quando a opção escolhida for "Adicionar", utilizar a função criada para adicionar no Exercício 1.
//  Altere a função listar para que seja exibido o índice ao lado de cada item, usaremos posteriormente.


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

        System.out.println("=============================================");
        System.out.println("=====         Listagem de Cursos        =====");
        System.out.println("=============================================");

        SAIR_DO_LOOP:
        do {
            System.out.print("Deseja (l)istar | (a)dicionar | (s)air: ");
            String opcao = entrada.next();

            switch (opcao) {
                case "s":{
                    break SAIR_DO_LOOP; // Label que aponta o "break" para a sua referência ("mesmo_nome:") no ponto exterior do loop "Do While".
                }
                case "a": {
                    adicionar(cursos, professores);
                    listar(cursos, professores);
                    opcao = "l";
                    break;
                }
                case "l": {
                    listar(cursos, professores);
                    break ;
                }
                default:{
                    System.out.println("=====         Opção INVÁLIDA!        =====");
                    break SAIR_DO_LOOP;
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
}
