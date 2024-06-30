var i_botao = window.document.querySelector(`button#id_botao`);

i_botao.addEventListener("click", inserirDados);

function inserirDados() {

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
}














function f_verifica(media) {
    if (media >= 7) {
        document.write(`Parabéns você passou com média ! <br>`);
    } else {
        document.write(`Infelizmente você está de recuperação. <br>`);
    }
}

f_verifica(media);