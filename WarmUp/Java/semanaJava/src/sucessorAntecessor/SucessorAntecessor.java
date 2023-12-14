package sucessorAntecessor;
import java.util.Scanner;
public class SucessorAntecessor {

    public static void main(String[] args) {
        Scanner sNumero = new Scanner(System.in);
        System.out.print("Digite um número inteiro para verificação: ");
        int vNumero = sNumero.nextInt();
        int vantecessor = vNumero - 1;
        int vsucessor = vNumero + 1;
        System.out.println("O número " + vNumero + " possui com antecessor " + vantecessor + " e como sucessor " + vsucessor + ".");
    }
}
