// TODO: Crie uma variável que irá receber como valor um array de 4 notas. Após isso, crie uma função que irá calcular a média dessas 4 notas. Deverá ser passado a variável que recebe o array de notas como parâmetro da função. Utilize o laço ‘for’ para o cálculo.

var nota0, nota1, nota2, nota3, media;

media = 0;
nota0 = 10;
nota1 = 20;
nota2 = 30;
nota3 = 40;

var notas = [];

notas[0] = nota0;
notas[1] = nota1;
notas[2] = nota2;
notas[3] = nota3;

function f_media(notas) {
    for (let index = 0; index < notas.length; index++) {
        media += notas[index];    
    }
    return media/notas.length;
}

document.write(f_media(notas));