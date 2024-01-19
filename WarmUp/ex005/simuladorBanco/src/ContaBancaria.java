public class ContaBancaria {
    private int numero;
    private double saldo;

    public ContaBancaria(int numero) {
        this.saldo = 0;
        this.numero = numero;
    }
    public void depositar(int numConta, double valor) {
        this.saldo += valor;
    }
    public void sacar(int numConta, double valor) {
        if (this.saldo >= valor){
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }

    }
    public int getNumero(){
        return this.numero;
    }
    public double getSaldo(){
        return this.saldo;
    }

}
