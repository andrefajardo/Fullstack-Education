// TODO: Pensando em um sistema de notas online, crie um código que irá capturar o nome da matéria e as suas quatro notas; deve ser usado um prompt dentro de uma laço while, para capturar apenas as notas. A ideia é que, a cada valor digitado no prompt, ele seja adicionado a um array e este irá ser o valor de uma propriedade de um objeto. Observe o fluxo:

// Exemplo: Digito o nome da matéria -> Digito as 4 notas -> montar o seguinte objeto:

// {
//   nomeMateria: “Matemática”,
//   notas: [10,6,8,9],
// }

// Após isso, crie um laço “for” que irá calcular a média de todos os itens da propriedade notas; pode ser utilizado o método criado no exercício 01, o resultado será o retorno dessa função.





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

// var alunos = [];
// var qtdAlunos = 4;

// function f_cadAlunos(alunos) {
//     for (let index = 0; index < qtdAlunos ; index++) {
//         alunos[index] = window.prompt(`Informe o nome ${index + 1}° do aluno: `);
//         console.log(alunos[index]);
//     }
//     for (let index = 0; index < alunos.length; index++) {
//         document.write(`Aluno(a): ` + alunos[index] + `<br>`);
//     }
//  }

// f_cadAlunos(alunos);


// var numero = window.prompt(`Informe o valor para calcular sua tabuada: `);

// function f_tabuada(numero) {
//     for (let index = 0; index < 11 ; index++) {
//         document.write(`${numero} X ${index} = ${index * numero} <br>`);
//     }
// }

// f_tabuada(numero);

// var nome = window.prompt("Informe o nome do aluno: ")
// var idade = window.prompt("Informe sua idade: ")
// var serie = window.prompt("Informe a série do aluno: ")
// var escola = window.prompt("Informe a escola do aluno: ")
// var materia = window.prompt("Informe a matéria: ")
// var confirmacao = window.confirm("Confirma as informações?")

// function f_validacao() {
//     if (confirmacao) {
//         document.write(`Nome: ${nome} <br> 
//                         Idade: ${idade} <br>
//                         Série: ${serie} <br>
//                         Escola: ${escola} <br>
//                         Matéria: ${materia} <br>`);
//     } else {
//         window.alert(`As informações não foram confirmadas`)
//     }
//     console.log(confirmacao);
// }

// f_validacao(confirmacao);

var media, index, materia;
var notas = [];

media = 0;
index = 0;
materiaNotas = {
    nomeMateria:"",
    notas:""
}
materia = window.prompt("Informe a matéria: ")

while (!(notas.length == 4)) {
    notas[index] = window.prompt(`Informe a ${index + 1}° nota: `);
    index++;
}

function f_media(notas) {
    for (let index = 0; index < notas.length; index++) {
        media += parseInt(notas[index]);   
        console.log(notas[index]);
    }
    return media/notas.length;
}

media = f_media(notas);

materiaNotas.nomeMateria = materia;
materiaNotas.notas = notas;

function f_verifica(media) {
    if (media >= 7) {
        document.write(`Parabéns você passou com média ! <br>`);
    } else {
        document.write(`Infelizmente você está de recuperação. <br>`);
    }
}

f_verifica(media);