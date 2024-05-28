// TODO: Crie uma classe chamada Produto com os seguintes atributos:
//      nome
//      preço
//      quantidade
//  Crie um construtor para a classe Produto que permita receber os valores base para cada um dos parâmetros.

// ==================================== Ex. 01 ===========================================

// let numeros = [12, 3, 5, 8, 10, 6, 7]

// soma = 0;

// const total = numeros.reduce((soma, n) => { 
//     soma += n;
//     return soma;
// })

// console.log(total);

// // ==================================== Ex. 02 ===========================================

// let pares = numeros.filter((n) => {
//     if(n % 2 == 0) {
//         return true;
//     } else {
//         return false;
//     }
// })

// console.log(pares);

// // ==================================== Ex. 03 ===========================================

// let quadrado = numeros.map((n) => {
//     return n * n;
// })

// console.log(quadrado);

// ==================================== Ex. 04 ===========================================

class Produto {
    constructor(nome, preco, quantidade){
        this.nome = nome,
        this.preco = preco,
        this.quantidade = quantidade
    }
}

let Produto01 = new Produto("camiseta", 70.50, 12);

console.log(Produto01.nome, (Produto01.preco).toFixed(2), Produto01.quantidade);


