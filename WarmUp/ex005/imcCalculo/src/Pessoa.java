public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public double calculaIMC(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        double imc = peso / (altura * altura);
        return imc;
    }
    public String verificaIMC(double imc) {
        String status;
        if (imc < 18.5) {
            status = "MAGREZA - 0";
        } else if ((imc >= 18.5) && (imc <= 24.9)) {
            status = "NORMAL - 0";
        } else if ((imc >= 25.0) && (imc <= 29.9)) {
            status = "SOBREPESO - I";
        } else if ((imc >= 30.0) && (imc <= 39.9)) {
            status = "OBESIDADE - II";
        } else {
            status = "OBESIDADE GRAVE - III";
        }
        return  status;
    }
}
