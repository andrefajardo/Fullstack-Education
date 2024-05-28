// TODO: Crie um método para a classe Produto chamado de Vender().
//  Este método deve receber como parâmetro a quantidade vendida e deve reduzir (deduzir) da quantidade do  produto. Porém, para ser possível essa venda a quantidade vendida não pode ser maior que a quantidade disponível. 
// Caso não haja quantidade suficiente, exiba uma mensagem de “Estoque insuficiente”.

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

// // ==================================== Ex. 04 ===========================================

// class Produto {
//     constructor(nome, preco, quantidade){
//         this.nome = nome,
//         this.preco = preco,
//         this.quantidade = quantidade
//     }
// }

// let Produto01 = new Produto("camiseta", 70.50, 12);

// console.log(Produto01.nome, (Produto01.preco).toFixed(2), Produto01.quantidade);

// ==================================== Ex. 05 ===========================================

class Produto2 {
    constructor(nome, preco, estoque){
        this.nome = nome,
        this.preco = preco,
        this.estoque = estoque
    }

    vender (quantidade) {
        if (this.estoque - quantidade >= 0) {
            this.estoque -= quantidade;
            console.log("Venda efetuada");            
        } else {
            console.log("Estoque insuficiente");
        }
    }
}

let Produto02 = new Produto2("camiseta", 70.50, 12);

console.log(Produto02.nome, (Produto02.preco).toFixed(2), Produto02.estoque);

Produto02.vender(10);

console.log(Produto02.nome, (Produto02.preco).toFixed(2), Produto02.estoque);

Produto02.vender(3);

console.log(Produto02.nome, (Produto02.preco).toFixed(2), Produto02.estoque);
