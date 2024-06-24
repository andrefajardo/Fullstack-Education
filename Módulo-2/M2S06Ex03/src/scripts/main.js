import { f_getAddress, f_getData, f_preparaTela} from './scripts.js';

var i_botao = window.document.querySelector(`button#id_btConfirmar`);
i_botao.addEventListener('click', f_preparaTela, Event);
i_botao.addEventListener('click', f_getData);
//i_botao.addEventListener('click', f_teste);


var i_pesquisa = window.document.querySelector(`button#id_BtPesquisa`);
i_pesquisa.addEventListener('click', f_getAddress);