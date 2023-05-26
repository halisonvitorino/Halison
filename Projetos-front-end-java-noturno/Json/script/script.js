const btn = document.getElementById('btnId');

btn.addEventListener('click', ()=>{

    // Objeto Json
    let usuario = {
        'nome': document.getElementById('idNome').value, 
        'email': document.getElementById('idEmail').value,
        'telefone': document.getElementById('idTelefone').value
    };

    document.getElementById('resultId').innerHTML = 
    '<b>Nome         : </b>' + usuario.nome     + 
    '<br/><b>Email   : </b>' + usuario.email    + 
    '<br/><b>Telefone: </b>' + usuario.telefone;

});