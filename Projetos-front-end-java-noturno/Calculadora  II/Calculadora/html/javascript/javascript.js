const btn     = document.getElementById('idButton');
const btnSoma = document.getElementById('idSoma');
const btnSub  = document.getElementById('idSub');
const btnDiv  = document.getElementById('idDiv');
const btnMult = document.getElementById('idMult');

const um = document.getElementById('id1');
const dois = document.getElementById('id2');
const tres = document.getElementById('id3');
const quatro = document.getElementById('id4');
const cinco = document.getElementById('id5');
const seis = document.getElementById('id6');
const sete = document.getElementById('id7');
const oito = document.getElementById('id8');
const nove = document.getElementById('id9');
const zero = document.getElementById('id0');

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


um.addEventListener('click', () => {
    document.getElementById('idValor1').innerHTML = 1;
});
dois.addEventListener('click', () => {
    document.getElementById('id2').innerHTML = 2;
});
tres.addEventListener('click', () => {
    document.getElementById('id3').innerHTML = 3;
});
quatro.addEventListener('click', () => {
    document.getElementById('id4').innerHTML = 4;
});
cinco.addEventListener('click', () => {
    document.getElementById('id5').innerHTML = 5;
});
btnSoma.addEventListener('click', () => {
    document.getElementById('id6').innerHTML = 6;
});
btnSoma.addEventListener('click', () => {
    document.getElementById('id7').innerHTML = 7;
});
btnSoma.addEventListener('click', () => {
    document.getElementById('id8').innerHTML = 8;
});
btnSoma.addEventListener('click', () => {
    document.getElementById('id9').innerHTML = 9;
});
btnSoma.addEventListener('click', () => {
    document.getElementById('ido').innerHTML = 0;
});



