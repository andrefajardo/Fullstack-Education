package ferraduras;

import java.util.Scanner;

public class Ferraduras {
    public static void main(String[] args) {

        Scanner sQtdCavalos = new Scanner(System.in);
        System.out.print("Informe a quantidade de cavalos: ");
        int totalFerraduras = (sQtdCavalos.nextInt())*4;
        System.out.println("Serão necessárias " + totalFerraduras + " ferraduras.");
    }
}


//todo     EXERCÍCIO 03
//          Um fazendeiro está comprando novos cavalos e precisa saber quantas
//          ferraduras serão necessárias para serem compradas.
//          Desenvolva um algoritmo que leia a quantidade de cavalos comprados
//          e retorne a quantidade de ferraduras necessárias.