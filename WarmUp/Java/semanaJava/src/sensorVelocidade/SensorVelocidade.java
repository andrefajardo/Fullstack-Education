package sensorVelocidade;

import java.util.Scanner;

public class SensorVelocidade {

    public static void main(String[] args) {
        double vDistancia = 1;
        Scanner sTempo = new Scanner(System.in);
        System.out.print("Informe o tempo transcorrido (use a vírgula para decimais): ");
        double vTempo = sTempo.nextDouble();
        double vVelMedia = (vDistancia/vTempo) * 3.6;
        System.out.println("Sua velocidade média foi de: " + vVelMedia + "km/h");
        System.out.println("Develop");
    }
}


//todo     EXERCÍCIOS 05
//          O governo do estado de Santa Catarina está contratando você para
//          desenvolver o sistema dos radares das estradas.  Nesse sistema,
//          haverá um sensor que entrará com o tempo que o veículo leva para
//          se deslocar entre uma placa e outra. Sabendo que a distância entre
//          as placas é de 1 metro, ao sensor entrar com o valor referente
//          ao tempo de deslocamento, o seu algoritmo deverá retornar
//          a velocidade média do veículo.
//          OBS: Velocidade média = distância/tempo