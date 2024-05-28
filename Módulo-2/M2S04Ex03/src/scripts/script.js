// TODO: Utilizando o array numeros utilizado nos exercícios anteriores, crie um novo array chamado quadrados que contenha o quadrado de cada número do array numeros. Imprima o array quadrados no console. Use o método map para realizar a criação de um novo array.

// ==================================== Ex. 01 ===========================================

let numeros = [12, 3, 5, 8, 10, 6, 7]

soma = 0;

const total = numeros.reduce((soma, n) => { 
    soma += n;
    return soma;
})

console.log(total);

// ==================================== Ex. 02 ===========================================

let pares = numeros.filter((n) => {
    if(n % 2 == 0) {
        return true;
    } else {
        return false;
    }
})

console.log(pares);

// ==================================== Ex. 03 ===========================================

let quadrado = numeros.map((n) => {
    return n * n;
})

console.log(quadrado);