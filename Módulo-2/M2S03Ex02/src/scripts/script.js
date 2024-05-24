// TODO: Crie uma função a qual recebe um valor numérico como parâmetro que irá ser a média; caso a média seja maior que 7, retorne em um document.write() a seguinte mensagem “Parabéns você passou na média !”, já, caso a média seja menor que 7, deve escrever em um document.write() a mensagem “Infelizmente você está de recuperação.”

var nota0, nota1, nota2, nota3, media;

media = 0;
nota0 = 1;
nota1 = 2;
nota2 = 3;
nota3 = 4;

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

document.write(`Média: ` + f_media(notas) + `<br>`);

media = f_media(notas);

function f_verifica(media) {
    if (media >= 7) {
        document.write(`Parabéns você passou na média ! <br>`);
    } else {
        document.write(`Infelizmente você está de recuperação. <br>`);
    }
}

f_verifica(media);