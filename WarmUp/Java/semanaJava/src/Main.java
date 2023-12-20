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

//todo     EXERCÍCIO 01
//          Desenvolva um programa para calcular a área de um terreno.
//          O usuário deverá informar a largura e o comprimento do terreno
//          e o seu algoritmo deverá retornar a área.
//          Ex: O terreno possui 10 m² de área.

//todo     EXERCÍCIO 02
//          Desenvolva um programa para calcular a quantidade de salários mínimos.
//          Sabendo que o salário mínimo hoje é R$1.212,00, o usuário deverá
//          informar seu salário e o seu algoritmo deverá informar quantos salários ele recebe.
//          Ex: Você recebe 1 mínimo.

//todo     EXERCÍCIO 03
//          Um fazendeiro está comprando novos cavalos e precisa saber quantas
//          ferraduras serão necessárias para serem compradas.
//          Desenvolva um algoritmo que leia a quantidade de cavalos comprados
//          e retorne a quantidade de ferraduras necessárias.

//todo     EXERCÍCIOS 04
//          Crie um programa que o usuário deverá informar um número e o retorno
//          deverá ser o sucessor e o antecessor do número informado

//todo     EXERCÍCIOS 05
//          O governo do estado de Santa Catarina está contratando você para
//          desenvolver o sistema dos radares das estradas.  Nesse sistema,
//          haverá um sensor que entrará com o tempo que o veículo leva para
//          se deslocar entre uma placa e outra. Sabendo que a distância entre
//          as placas é de 1 metro, ao sensor entrar com o valor referente
//          ao tempo de deslocamento, o seu algoritmo deverá retornar
//          a velocidade média do veículo.
//          OBS: Velocidade média = distância/tempo

//todo     EXERCÍCIOS 06
//          Implemente uma classe carro com os seguintes atributos: fabricante,
//          modelo e cor. Instancie o objeto em um método main preenchendo as
//          informações dos atributos do carro. Ah! O carro deverá ter algumas
//          funcionalidades: Ligar, dirigir e desligar. Para poder ligar o carro
//          o mesmo deve estar desligado, para dirigir e desligar o mesmo deverá estar ligado.

//todo     EXERCÍCIOS 07
//          João está planejando um mochilão. Seus destinos são: EUA, Inglaterra,
//          França e planeja concluir na Argentina. Ele gostaria de um conversor de
//          moedas para saber quanto o valor em Real vale em cada moeda. Implemente
//          um conversor de moedas onde o usuário entrará com um valor em real,
//          selecionará para qual moeda deseja fazer a conversão e o sistema irá
//          retornar o valor na moeda selecionada.
//
// TODO: 19/12/2023
//          EXERCÍCIOS 08
//          Verificação de Números Pares e Ímpares:
//          Crie um programa em Java que solicita ao usuário para inserir
//          um número inteiro. Use uma estrutura de decisão para determinar
//          se o número é par ou ímpar. Exiba uma mensagem indicando se o
//          número é par ou ímpar.
//
// TODO: 19/12/2023
//          EXERCÍCIOS 09
//          Classificação de Idades:
//          Escreva um programa que pede ao usuário para inserir a idade.
//          Utilize estruturas de decisão para classificar a idade em categorias:
//          "Criança" (0-12 anos), "Adolescente" (13-19 anos), "Adulto" (20 anos ou mais).
//          Imprima a categoria correspondente.
//
// TODO: 19/12/2023
//          EXERCÍCIOS 10
//          Calculadora de Bônus Salarial:
//          Desenvolva um programa que solicita ao usuário para inserir o salário mensal e o
//          tempo de serviço em anos. Use estruturas de decisão para calcular um bônus salarial
//          com base nas seguintes regras:
//          Se o tempo de serviço for superior a 5 anos, o bônus é 10% do salário.
//          Caso contrário, o bônus é 5% do salário.
//          Exiba o salário original, o bônus calculado e o novo salário após o bônus.
//
// TODO: 19/12/2023
//          EXERCÍCIOS 11
//          Escreva um aplicativo em Java que recebe inteiro e mostrar os números pares
//          e ímpares (separados), de 1 até esse inteiro.
//
// TODO: 19/12/2023
//          EXERCÍCIOS 12
//          Escreva um aplicativo em Java mostrando todos os números pares de 1 até 100.
//
// TODO: 19/12/2023
//          EXERCÍCIOS 13
//          Xuxa, a rainha dos baixinhos, criou uma música que tem o seguinte formato:
//          (n) patinhos foram passear Além das montanhas para brincar...
//          A mamãe gritou: Quá, quá, quá, quá… Mas só (n) patinhos voltaram de lá.
//          Que se repete até que nenhum patinho voltar de lá.
//          Ao final, todos os patinhos voltam:
//          A mamãe patinha foi procurar. Além das montanhas na beira do mar.
//          A mamãe gritou: Quá, quá, quá, quá
//          E os (n) patinhos voltaram de lá.
//          Crie um programa em Java que recebe um inteiro positivo do usuário e exibe a
//          música inteira na tela, onde o inteiro recebido representa o número inicial
//          n de patinhos que foram passear.
//
// TODO: 19/12/2023
//          EXERCÍCIOS 14
//          Escreva um programa em JAVA que calcula os quadrados e cubos dos números de
//          1 a 10 e apresente o resultado no formato de tabela conforme imagem:
//
// TODO: 19/12/2023
//          EXERCÍCIOS 15
//          Escreva um programa que leia números reais maiores que zero. Quanto o usuário
//          inserir o valor zero, o programa deverá imprimir no console quantos números
//          foram digitados, o maior número digitado, o menor número digitado e a média
//          de todos os números. Escreva um programa que mostre para o usuário um menu
//          contendo 1 e 0 caso ele escolha uma opção diferente mostre “Opção inválida”.
//          A execução do programa só deverá ser interrompida caso o usuário insira o valor -5.
//
// TODO: 19/12/2023
//          EXERCÍCIOS 16
//          Giovanna adora roxo. Escreva um programa que percorrerá um array de cores e
//          caso tenha a cor roxo, será impresso no console “Eu amo essa cor!”.
//          Caso contrário, deve ser impresso no console “Palhaçada!”
//
// TODO: 19/12/2023
//          EXERCÍCIOS 17
//          Você foi selecionado pelo TSE para desenvolver o programa da urna eletrônica
//          das eleições deste ano. A urna deverá mostrar as seguintes opções de candidatos:
//          1 - Zezinho
//          2 - Lunguinho
//          3 - Luizinho
//          4 - Fernanda
//          5 - Tio Patinhas
//          6 - Pato Donaldo
//          Entre com seu voto:
//          Caso seja escolhida uma opção diferente das apresentadas o voto deverá
//          ser contabilizado como nulo. Ao ser inserido a palavra “shut down” o
//          programa deverá ser encerrado e apresentado o número de votos de cada
//          candidato, porcentagem de votos nulos e a porcentagem de votos brancos.




