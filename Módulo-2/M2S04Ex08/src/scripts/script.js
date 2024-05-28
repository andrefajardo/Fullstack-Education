// TODO: Crie um método chamada de AtualizarPreco dentro da classe Produto. Este método deve receber como parâmetro o novo valor do produto e atualizar o preço atual.

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

// class Produto2 {
//     constructor(nome, preco, estoque){
//         this.nome = nome,
//         this.preco = preco,
//         this.estoque = estoque
//     }

//     vender (quantidade) {
//         if (this.estoque - quantidade >= 0) {
//             this.estoque -= quantidade;
//             console.log("Venda efetuada");            
//         } else {
//             console.log("Estoque insuficiente");
//         }
//     }
// }

// let Produto02 = new Produto2("camiseta", 70.50, 12);

// Produto02.mostrarEstoque();

// Produto02.vender(10);

// Produto02.mostrarEstoque();

// Produto02.vender(3);

// Produto02.mostrarEstoque();

// ==================================== Ex. 06 ===========================================

// class Produto2 {
//     constructor(nome, preco, estoque){
//         this.nome = nome,
//         this.preco = preco,
//         this.estoque = estoque
//     }

//     vender (quantidade) {
//         if (this.estoque - quantidade >= 0) {
//             this.estoque -= quantidade;
//             console.log("Venda efetuada");            
//         } else {
//             console.log("Estoque insuficiente");
//         }
//     }

//     repor (quantidade) {
//         this.estoque += quantidade;
//     }
//  }

// let Produto02 = new Produto2("camiseta", 70.50, 12);

// console.log("Estoque inicial");
// Produto02.mostrarEstoque();

// Produto02.vender(10);

// console.log("Estoque depois da primeira venda de 10 produtos");
// Produto02.mostrarEstoque();

// Produto02.vender(3);

// console.log("Estoque depois da segunda tentativa venda de mais 3 produtos");
// Produto02.mostrarEstoque();

// Produto02.repor(4);

// console.log("Estoque depois da reposição de mais 4 produtos");
// Produto02.mostrarEstoque();

// Produto02.vender(3);

// console.log("Estoque depois da segunda venda de mais 3 produtos");
// Produto02.mostrarEstoque();

// ==================================== Ex. 07 ===========================================

class Produto2 {
    constructor(nome, preco, estoque){
        this.nome = nome,
        this.preco = preco,
        this.estoque = estoque
    }

    vender(quantidade) {
        if (this.estoque - quantidade >= 0) {
            this.estoque -= quantidade;
            console.log("Venda efetuada");            
        } else {
            console.log("Estoque insuficiente");
        }
    }

    repor(quantidade) {
        this.estoque += quantidade;
    }

    mostrarEstoque() {
        console.log(`O produto ${this.nome} possui ${this.estoque} unidades disponíveis.`);
        console.log();
    }

    mostrarPreco() {
        console.log(`O produto ${this.nome} custa R$${this.preco.toFixed(2)}`);
        console.log();
    }

    atualizarPreco(valor) {
        this.preco += valor;
    }
 }

let Produto02 = new Produto2("camiseta", 70.50, 12);

console.log("Preço inicial");
Produto02.mostrarPreco();

Produto02.atualizarPreco(12);
console.log("Preço do produto após atualização.");
Produto02.mostrarPreco();

