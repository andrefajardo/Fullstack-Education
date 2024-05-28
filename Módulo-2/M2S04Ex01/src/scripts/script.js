// TODO: Crie um array de numeros. Calcule e imprima a soma de todos os elementos do array. Utilize o reduce para realizar a soma.

let numeros = [12, 3, 5, 8, 10, 6, 7]

soma = 0;

const total = numeros.reduce((soma, n) => { 
    soma += n;
    return soma;
})

console.log(total);