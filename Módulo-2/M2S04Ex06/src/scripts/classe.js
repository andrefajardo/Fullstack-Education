
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
 }

let Produto02 = new Produto2("camiseta", 70.50, 12);

console.log("Estoque inicial");
console.log(Produto02.nome, (Produto02.preco).toFixed(2), Produto02.estoque);

Produto02.vender(10);

console.log("Estoque depois da primeira venda de 10 produtos");
console.log(Produto02.nome, (Produto02.preco).toFixed(2), Produto02.estoque);

Produto02.vender(3);

console.log("Estoque depois da segunda tentativa venda de mais 3 produtos");
console.log(Produto02.nome, (Produto02.preco).toFixed(2), Produto02.estoque);

Produto02.repor(4);

console.log("Estoque depois da reposição de mais 4 produtos");
console.log(Produto02.nome, (Produto02.preco).toFixed(2), Produto02.estoque);

Produto02.vender(3);

console.log("Estoque depois da segunda venda de mais 3 produtos");
console.log(Produto02.nome, (Produto02.preco).toFixed(2), Produto02.estoque);