import classeCarro.Carro;
public class Main {
    public static void main(String[] args){
        Carro oCarro = new Carro();
        oCarro.vStatus = false;
        oCarro.ligar();
        System.out.println("O carro está ligado? ===> (" + oCarro.vStatus + ")");
        oCarro.vAcelerar = true;
        System.out.println(oCarro.dirigir(false));
    }
}
