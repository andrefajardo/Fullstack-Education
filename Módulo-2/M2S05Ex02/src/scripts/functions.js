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
