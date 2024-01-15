public class Calculos {
    public static void calculo(double num1, double num2, int op) {
        double resultado;
        switch (op) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("ERRO: Divisão por zero.");
                }
                break;
            default:
                System.out.println("ERRO: Operação inválida.");
        }
    }
}
