const btn = document.getElementById('idButton');

btn.addEventListener('click', ()=>{
    let varTexto = document.getElementById('idTexto').value;
    document.getElementById('idResult').innerHTML = varTexto;
});