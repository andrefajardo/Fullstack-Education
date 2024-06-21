import { f_preparaTela, f_getAddress} from './scripts.js';


var i_botao = window.document.querySelector(`button#id_btConfirmar`);
i_botao.addEventListener('click', f_preparaTela);

var i_pesquisa = window.document.querySelector(`button#id_BtPesquisa`);
i_pesquisa.addEventListener('click', f_getAddress);

