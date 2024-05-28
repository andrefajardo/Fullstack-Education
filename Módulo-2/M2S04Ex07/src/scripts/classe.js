
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

    repor (quantidade) {
        this.estoque += quantidade;
    }

    mostrarEstoque () {
        console.log(`O produto ${this.nome} possui ${this.estoque} unidades disponíveis.`);
        console.log();
    }
 }

let Produto02 = new Produto2("camiseta", 70.50, 12);

console.log("Estoque inicial");
Produto02.mostrarEstoque();

Produto02.vender(10);
console.log("Estoque depois da primeira venda de 10 produtos");
Produto02.mostrarEstoque();

Produto02.vender(3);
console.log("Estoque depois da segunda tentativa venda de 3 produtos");
Produto02.mostrarEstoque();

Produto02.repor(4);
console.log("Estoque depois da reposição de mais 4 produtos");
Produto02.mostrarEstoque();

Produto02.vender(3);
console.log("Estoque depois da segunda venda de outros 3 produtos");
Produto02.mostrarEstoque();