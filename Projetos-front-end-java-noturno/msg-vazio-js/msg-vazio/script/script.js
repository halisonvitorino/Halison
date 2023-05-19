const campoNome = document.getElementById('idNome');
const spamNome = document.getElementById('idAlertaNome');
const campoEmail = document.getElementById('idEmail');
const spamEmail = document.getElementById('idAlertaEmail');
const btn = document.getElementById('idButton');

campoNome.addEventListener('blur', () => {
    const valorNome = campoNome.value;
    if ( valorNome === '') {
        document.getElementById('idAlertaNome').innerHTML =  "Campo Obrigatorio";
    } else {
        document.getElementById('idAlertaNome').innerHTML = '';
    }
});

campoEmail.addEventListener('blur', () => {
    const valorEmail = campoEmail.value;
    if ( valorEmail === '') {
        document.getElementById('idAlertaEmail').innerHTML =  "Campo Obrigatorio";
    } else {
        document.getElementById('idAlertaEmail').innerHTML = '';
    }
});
