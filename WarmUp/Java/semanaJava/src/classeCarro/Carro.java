package classeCarro;

public class Carro {
    public String fabricante;
    public String modelo;
    public String cor;
    public Boolean vStatus;
    public Boolean vAcelerar;

    public void ligar() {
        if (vStatus.equals(false)) {
            this.vStatus = true;
        }
    }

    public void desligar() {
        if (vStatus.equals(true)) {
            this.vStatus = false;
        }
    }

    public String dirigir(Boolean vAcelerar) {
        if (vStatus.equals(true) && !vAcelerar.equals(false)) {
            return "Dirigindo";
        } else {
            return "Parado";
        }

    }
}

//todo     EXERCÍCIOS 06
//          Implemente uma classe carro com os seguintes atributos: fabricante,
//          modelo e cor. Instancie o objeto em um método main preenchendo as
//          informações dos atributos do carro. Ah! O carro deverá ter algumas
//          funcionalidades: Ligar, dirigir e desligar. Para poder ligar o carro
//          o mesmo deve estar desligado, para dirigir e desligar o mesmo deverá estar ligado.