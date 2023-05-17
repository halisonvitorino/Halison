const btncalc = document.getElementById('idBotaoCalcular')

btncalc.addEventListener('click', () => {

    let nome = document.getElementById('idNome').value;
    let idade = document.getElementById('idIdade').value;

    if (nome == '' || idade == '') {
        alert('preenhe essa buceta')
    } else {
        if (idade >= 18) {
            alert(nome + ' é maior de idade')
        } else {
            alert(nome + ' é menor de idade');
        }
    }
});

