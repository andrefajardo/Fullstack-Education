export function f_validacao() {

    var i_nome = window.document.querySelector('#id_nome');
    var i_idade = window.document.querySelector('#id_idade');
    var i_serie = window.document.querySelector(`#id_serie`);
    var i_escola = window.document.querySelector(`#id_escola`);
    var i_materia = window.document.querySelector(`#id_materia`);
                
    var nome = window.prompt("Informe o nome do aluno: ")
    var idade = window.prompt("Informe sua idade: ")
    var serie = window.prompt("Informe a série do aluno: ")
    var escola = window.prompt("Informe a escola do aluno: ")
    var materia = window.prompt("Informe matéria preferida: ")
    var confirmacao = window.confirm("Confirma as informações?")


    if (confirmacao) {
        i_nome.textContent = nome;
        i_idade.textContent = idade;
        i_serie.textContent = serie;
        i_escola.textContent = escola;
        i_materia.textContent = materia;
        var i_linha = window.document.querySelector('#id_notas_materias');
        i_linha.innerHTML = ``;        
    } else {
        window.alert(`As informações não foram confirmadas`)
    }

}

export function f_inserirDados() {

    var index, materia;
    var media = 0;
    var notas = [];
    var materiaNotas = {
        nomeMateria:"",
        notas:""
    }

    index = 0;
    materia = window.prompt("Informe a matéria: ");
    while (!(notas.length == 4)) {
        notas[index] = window.prompt(`Informe a ${index + 1}° nota: `);
        index++;
    }
    materiaNotas.nomeMateria = materia;
    materiaNotas.notas = notas;
    media = f_media(notas);

    console.log(materiaNotas);
    console.log(media)

    f_newLine(materiaNotas, media);


    return materiaNotas;

}

export function f_media(notas) {
    let soma = 0;
    for (let index = 0; index < notas.length; index++) {
        soma += parseInt(notas[index]);   
        console.log(notas[index]);
    }
    return soma/notas.length;
}

export function f_newLine(materiaNotas, media) {
    var i_linha = window.document.querySelector('#id_notas_materias');
    i_linha.innerHTML += `<tr>
                        <th scope="row">${materiaNotas.nomeMateria}</th>
                        <td>${parseFloat(materiaNotas.notas[0]).toFixed(2)}</td>
                        <td>${parseFloat(materiaNotas.notas[1]).toFixed(2)}</td>
                        <td>${parseFloat(materiaNotas.notas[2]).toFixed(2)}</td>
                        <td>${parseFloat(materiaNotas.notas[3]).toFixed(2)}</td>
                        <td>${media}</td>
                      </tr>`
}
