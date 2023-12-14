// Desenvolva um programa para calcular a área de um terreno.
// O usuário deverá informar a largura e o comprimento do terreno
// e o seu algoritmo deverá retornar a área.
// Ex: O terreno possui 10 m² de área.

package calculaArea;
import java.util.Scanner;
public class CalculaArea {
    public static void main(String[] args) {
        Scanner area = new Scanner(System.in);
        System.out.print("Informe a largura do terreno: " );
        int largura = area.nextInt();
        System.out.print("Informe o comprimento do terreno: ");
        int comprimento = area.nextInt();
        int vArea = (largura * comprimento);
        System.out.println("A área do terreno é de: " + vArea + "m2");

    }
}
