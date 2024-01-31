// TODO: 30/01/2024
//  [M1S04] Ex 1 - Lista de Cursos e Professores
//  Criar dois ArrayList para armazenar lista de cursos e professores.
//  Utilizando um laço de repetição, pedir ao usuário que informe alguns
//  cursos/professores ou um comando para sair (pode ser "0", mas fique à
//  vontade para mudar).
//  Para isso, criar funções para: Adicionar curso/professores na lista.
//  Ao sair listar os cursos/professores inseridos

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

        System.out.println("==============================================");
        System.out.println("=====         Listagem de Cursos         =====");
        System.out.println("==============================================");

        SAIR_DO_LOOP:

        do {
            System.out.print("Deseja (a)dicionar | (s)air: ");
            String opcao = entrada.next();
            switch (opcao) {
                case "s":{
                    break SAIR_DO_LOOP; // Label que aponta para a sua referência ("mesmo_nome:") no ponto exterior do loop "Do While".
                }
                case "a": {
                    adicionar(cursos, professores);
                    for (int i = 0; i < cursos.size(); i++) {
                        String item = cursos.get(i).toString();
                        System.out.print(i + " - " + item + " - ");
                        item = professores.get(i).toString();
                        System.out.println(item);
                    }
                    opcao = "v";
                    break;
                }
                default:{
                    System.out.println("=====         Opção INVÁLIDA!        =====");
                    break SAIR_DO_LOOP;
                }
            }
        } while (true);
        entrada.close();
    }

    public static void adicionar(ArrayList cursos, ArrayList professores) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o curso: ");
        String item = entrada.next();
        cursos.add(item);
        System.out.print("Informe o Professor: ");
        item = entrada.next();
        professores.add(item);
    }
}


