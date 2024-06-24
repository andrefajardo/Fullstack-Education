import { f_getData, f_getAddress} from './scripts.js';
var i_botao = window.document.querySelector(`button#id_btConfirmar`);
// i_botao.addEventListener('click', f_inserirDados)
i_botao.addEventListener('click', f_getData);
var i_pesquisa = window.document.querySelector(`button#id_BtPesquisa`);
i_pesquisa.addEventListener('click', f_getAddress);