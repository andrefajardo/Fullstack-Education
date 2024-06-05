import { f_validacao, f_inserirDados, f_media } from './functions.js';

var i_botao = window.document.querySelector(`button#id_botao`);

f_validacao();
i_botao.addEventListener("click", f_inserirDados);