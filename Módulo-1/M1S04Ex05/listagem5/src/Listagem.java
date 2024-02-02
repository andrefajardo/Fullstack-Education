// TODO: 31/01/2024
//  [M1S04] Ex 5 - (POO Abstração)
//  Criar classes de curso e professor
//  Vamos adicionar um pouco de Orientação à Objetos em nosso projeto
//  1) Crie uma classe de curso com ao menos:
//  Atributos:-> Nome-> Descrição-> Professores-> Carga horária
//  Métodos:-> Progresso-> Notas-> Participação
//  Obs.: Os métodos podem conter apenas textos que imprimam no console
//  2) Crie uma classe de professor com ao menos:
//  Atributos:-> Nome-> Especialidade
//  Métodos:-> Ensinar
//  Obs.: Os métodos podem conter apenas textos que imprimam no console


import java.util.ArrayList;
import java.util.Scanner;

public class Listagem {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Curso> cursos = setupCursos();
        ArrayList<Professor> professores = setupProfessores();
        menu(entrada, cursos, setupProfessores());
    }

    // ============================== SEÇÃO DE SETUP - INÍCIO =================================//

    public static ArrayList<Curso> setupCursos() {
        ArrayList<Curso> cursos = new ArrayList<>();
        Curso c1 = new Curso("Redes", "Bacharelado em análise de redes", 4000, 001);
        Curso c2 = new Curso("Direito", "Bacharelado em direito", 4400, 002);
        Curso c3 = new Curso("Medicina", "Bacharelado em medicina", 6500,003);
        Curso c4 = new Curso("Desenvolvimento de Sistemas", "Bacharelado em ADS", 4500, 004);
        cursos.add(c1);
        cursos.add(c2);
        cursos.add(c3);
        cursos.add(c4);

        return cursos;
    }
    public static ArrayList<Professor> setupProfessores() {
        ArrayList<Professor> professores = new ArrayList<>();
        Professor p1 = new Professor("Diego", "Engenharia de Redes", 001);
        Professor p2 = new Professor("Roberto", "Processo Penal", 002);
        Professor p3 = new Professor("Medina", "Anatomia II", 003);
        Professor p4 = new Professor("Edna", "Cloud Computer", 004);
        professores.add(p1);
        professores.add(p2);
        professores.add(p3);
        professores.add(p4);

        return  professores;
    }

    public static void msgErro() {
        System.out.print("=======================================================\n");
        System.out.print("=====                Opção INVÁLIDA!              =====\n");
        System.out.print("=======================================================\n");

    }

    public static void menu(Scanner entrada, ArrayList<Curso> cursos, ArrayList<Professor> professores) {

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
                    adicionar(cursos, professores);
                    listarTodos(cursos, professores);
                    break;
                }
                case "r": {
                    remover(cursos, professores);
                    break;
                }
                case "l": {
                    listar(cursos, professores);
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
    public static void listar(ArrayList<Curso> cursos, ArrayList<Professor> professores) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.println("=====            Opções de listagem               =====");
        System.out.println("=======================================================");
        System.out.println("=====   (t) para todos                            =====");
        System.out.println("=====   (c) para concluídos                       =====");
        System.out.println("=======================================================");
        System.out.print("===== Opção: ");
        String op = entrada.next();
        if (op.equals("t")) {
            listarTodos(cursos, professores);
        } else if (op.equals("c")) {
            listarConcluidos(cursos, professores);
        } else {
            msgErro();
        }
    }

    public static void adicionar(ArrayList<Curso> cursos, ArrayList<Professor> professores) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o curso: ");
        String itemCurso = entrada.nextLine();
        System.out.print("Informe a descrição: ");
        String itemDesc = entrada.nextLine();
        System.out.print("Informe a carga horária: ");
        int itemCarga = entrada.nextInt();
        System.out.print("Informe o professor: ");
            // Consumir "ENTER" perdido
            entrada.nextLine();
        String itemProf = entrada.nextLine();
        System.out.print("Informe a especialidade: ");
        String itemEsp = entrada.nextLine();
        int itemCod = cursos.size() + 1;
        Curso c = new Curso(itemCurso, itemDesc, itemCarga, itemCod);
        Professor p = new Professor(itemProf, itemEsp, itemCod);
        cursos.add(c);
        professores.add(p);
    }

    public static void remover(ArrayList<Curso> cursos, ArrayList<Professor> professores) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nLista atual: \n");
        listar(cursos, professores);
        System.out.print("Informe o indice para remoção: ");
        int indice = entrada.nextInt();
        if (cursos.size() > indice){
            System.out.printf("Confirma a exclusão do item (%s)? (s)im/(n)ão: ", cursos.get(indice).getNome().toString());
            String ok = entrada.next();
            if (ok.equals("s")) {
                cursos.remove(indice);
                professores.remove(indice);
            }
        } else {
            msgErro();
        }
    }

    public static void listarTodos(ArrayList<Curso> cursos, ArrayList<Professor> professores) {
        for (int i = 0; i < cursos.size(); i++) {
            String itemStatus = cursos.get(i).getStatus().toString();
            String itemCurso = cursos.get(i).getNome().toString();
            String itemProf = professores.get(i).getNome();
            System.out.println(i + " - " + itemCurso + " - " + itemProf + " ===> " + itemStatus);

        }
    }
    public static void listarConcluidos(ArrayList<Curso> cursos, ArrayList<Professor> professores) {
        for (int i = 0; i < cursos.size(); i++) {
            String itemStatus = cursos.get(i).getStatus().toString();
            if (itemStatus.equals("Concluído")) {
                String itemCurso = cursos.get(i).getNome().toString();
                String itemProf = professores.get(i).getNome().toString();
                System.out.println(i + " - " + itemCurso + " - " + itemProf + " ===> " + itemStatus);
            }
        }
    }
}