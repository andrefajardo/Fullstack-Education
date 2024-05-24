// TODO: Desenvolva um código JavaScript que faça o seguinte: 

// 1 - Faça as seguintes 5 perguntas ao usuário:

// Qual o nome do aluno?
// Qual a idade do aluno?
// Qual a série do aluno?
// Qual o nome da escola?
// Qual a sua matéria favorita?

// 2- Utilize o método confirm() do JavaScript para perguntar ao usuário se ele confirma os dados inseridos (isso apenas ao final das 5 perguntas).

// 4- Se o usuário confirmar, exiba todas as informações do aluno na tela utilizando o método document.write().

// 5- Caso ele não aceite o programa, deve ser encerrado e nada deve ser feito. apenas mostre uma mensagem de que os dados não foram confirmado.





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

var nome = window.prompt("Informe o nome do aluno: ")
var idade = window.prompt("Informe sua idade: ")
var serie = window.prompt("Informe a série do aluno: ")
var escola = window.prompt("Informe a escola do aluno: ")
var materia = window.prompt("Informe matéria: ")
var confirmacao = window.confirm("Confirma as informações?")

function f_validacao() {
    if (confirmacao) {
        document.write(`Nome: ${nome} <br> 
                        Idade: ${idade} <br>
                        Série: ${serie} <br>
                        Escola: ${escola} <br>
                        Matéria: ${materia} <br>`);
    } else {
        window.alert(`As informações não foram confirmadas`)
    }
    console.log(confirmacao);
}

f_validacao(confirmacao);