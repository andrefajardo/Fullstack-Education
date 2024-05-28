// TODO: Crie um array chamado pares que contenha apenas os números pares do array numeros criado no exercício anterior. Em seguida, imprima esse novo array no console. Utilize o método filter para realizar a operação de filtragem.

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

