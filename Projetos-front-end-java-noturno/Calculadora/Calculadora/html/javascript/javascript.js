const btn     = document.getElementById('idButton');
const btnSoma = document.getElementById('idSoma');
const btnSub  = document.getElementById('idSub');
const btnDiv  = document.getElementById('idDiv');
const btnMult = document.getElementById('idMult');

let idValor1;
let idValor2;
let valorInteiro1;
let valorInteiro2;

btn.addEventListener('click', () => {

    idValor1 = document.getElementById('idValor1').value;
    document.getElementById('id1').innerHTML = idValor1;
    valorInteiro1 = parseInt(idValor1);

    idValor2 = document.getElementById('idValor2').value;
    document.getElementById('id2').innerHTML = idValor2;
    valorInteiro2 = parseInt(idValor2);
});

btnSoma.addEventListener('click', () => {
    let resultado = valorInteiro1 + valorInteiro2
    document.getElementById('idResult').innerHTML = resultado;
});

btnSub.addEventListener('click', () => {
    let resultado = valorInteiro1 - valorInteiro2
    document.getElementById('idResult').innerHTML = resultado;
});

btnDiv.addEventListener('click', () => {
    let resultado = valorInteiro1 / valorInteiro2
    document.getElementById('idResult').innerHTML = resultado;
});

btnMult.addEventListener('click', () => {
    let resultado = valorInteiro1 * valorInteiro2
    document.getElementById('idResult').innerHTML = resultado;
});

