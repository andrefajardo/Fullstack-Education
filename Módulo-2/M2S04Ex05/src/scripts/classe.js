
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
