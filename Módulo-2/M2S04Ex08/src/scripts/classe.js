
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