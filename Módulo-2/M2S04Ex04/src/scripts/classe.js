
class Produto {
    constructor(nome, preco, quantidade){
        this.nome = nome,
        this.preco = preco,
        this.quantidade = quantidade
    }
}

let Produto01 = new Produto("camiseta", 70.50, 12);

console.log(Produto01.nome, (Produto01.preco).toFixed(2), Produto01.quantidade);