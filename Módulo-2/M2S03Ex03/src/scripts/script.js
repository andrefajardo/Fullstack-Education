// TODO: Agora, crie uma função javascript que irá receber uma variável como parâmetro; ela será um array de nomes de alguns alunos (pode ser nomes aleatórios). Através do método de array forEach(), imprima em tela (com document.write) todos os nomes do array, um abaixo do outro.

// var nota0, nota1, nota2, nota3, media;

// media = 0;
// nota0 = 1;
// nota1 = 2;
// nota2 = 3;
// nota3 = 4;

// var notas = [];

// notas[0] = nota0;
// notas[1] = nota1;
// notas[2] = nota2;
// notas[3] = nota3;

// function f_media(notas) {
//     for (let index = 0; index < notas.length; index++) {
//         media += notas[index];    
//     }
//     return media/notas.length;
// }

// document.write(`Média: ` + f_media(notas) + `<br>`);

// media = f_media(notas);

// function f_verifica(media) {
//     if (media >= 7) {
//         document.write(`Parabéns você passou na média ! <br>`);
//     } else {
//         document.write(`Infelizmente você está de recuperação. <br>`);
//     }
// }

// f_verifica(media);

var alunos = [];
var qtdAlunos = 4;

function f_cadAlunos(alunos) {
    for (let index = 0; index < qtdAlunos ; index++) {
        alunos[index] = window.prompt(`Informe o nome ${index + 1}° do aluno: `);
        console.log(alunos[index]);
    }
    for (let index = 0; index < alunos.length; index++) {
        document.write(`Aluno(a): ` + alunos[index] + `<br>`);
    }
 }

f_cadAlunos(alunos);


