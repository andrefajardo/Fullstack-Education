import { f_getAddress, f_getData, f_preparaTela, f_listarAlunos} from './scripts.js';

var i_botao = window.document.querySelector(`button#id_btConfirmar`);
i_botao.addEventListener('click', f_getData);
i_botao.addEventListener('click', f_listarAlunos);
i_botao.addEventListener('click', f_preparaTela, Event);



var i_pesquisa = window.document.querySelector(`button#id_BtPesquisa`);
i_pesquisa.addEventListener('click', f_getAddress);