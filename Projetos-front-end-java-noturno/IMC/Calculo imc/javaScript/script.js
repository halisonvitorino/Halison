
const btnCalcular = document.getElementById('idCalcular');

btnCalcular.addEventListener('click', () => {

    let peso = document.getElementById('idPeso').value;
    let altura = document.getElementById('idAltura').value;
    let a;

    let result = (peso / (altura ** 2)).toFixed(2);  

    if (result <= 18.5) {
        a = "Magreza";
    }

    if (result > 18.5 && result <= 24.9) {
        a = "Normal";
    }

    if (result > 24.9 && result <= 29.9) {
        a = "Sobrepeso";
    }

    if (result > 29.9 && result <= 39.9) {
        a = "Obesidade";
    }

    if (result > 39.9) {
        a = "Obesidade grave";
    }

    document.getElementById('idResult').innerHTML = result + " " + a;
});