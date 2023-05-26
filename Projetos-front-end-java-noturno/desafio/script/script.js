
const cepPesquisado = document.getElementById('idCEP');
const campoNumero   = document.getElementById('idNumero');
const campoNome     = document.getElementById('idNome');
const numero        = document.getElementById('idNumero');
const ddd           = document.getElementById('idDDD');
const botao         = document.getElementById('idBotao');

cepPesquisado.addEventListener('blur', () => {
    //Nova variável "cep" somente com dígitos.
    let cep = cepPesquisado.value.replace(/\D/g, '');

    //Verifica se campo cep possui valor informado.
    if (cep != "") {

        //Expressão regular para validar o CEP.
        let validacep = /^[0-9]{8}$/;

        //Valida o formato do CEP.
        if (validacep.test(cep)) {

            //Cria um elemento javascript.
            let script  = document.createElement('script');
            let script2 = document.createElement('script');
            //Sincroniza com o callback.
            script.src  = 'https://viacep.com.br/ws/' + cep + '/json/?callback=meu_callback';
            script2.src = 'https://example.api.findcep.com/v1/geolocation/cep/' + cep;

            //Insere script no documento e carrega o conteúdo.
            document.body.appendChild(script);

        } //end if.
        else {
            //cep é inválido.
            limpa_formulário_cep();
            alert("Formato de CEP inválido.");
        }
    } //end if.
    else {
        //cep sem valor, limpa formulário.
        limpa_formulário_cep();
    }
});

const meu_callback = (conteudo) => {
    if (!('erro' in conteudo)) {

        //Atualiza os campos com os valores.
        document.getElementById('idRua').value = (conteudo.logradouro);
        document.getElementById('idBairro').value = (conteudo.bairro);
        document.getElementById('idCidade').value = (conteudo.localidade);
        document.getElementById('idUF').value = (conteudo.uf);
        document.getElementById('idDDD').value = (conteudo.ddd);
        //document.getElementById('idComplemento').value = (conteudo.uf);
        //document.getElementById('idUF').value = (conteudo.uf);
    } //end if.

    else {
        //CEP não Encontrado.
        limpa_formulário_cep();
        alert("CEP não encontrado.");
    }
};

// avisa o campo obrigatorio
campoNome.addEventListener('blur', () => {
    valorCampoNome = campoNome.value;
    if (valorCampoNome === '') 
        document.getElementById('idNome').setAttribute('placeholder', 'Preenchimento obrigatorio');
});

numero.addEventListener('blur', () => {
    valorNumero = numero.value;
    if (valorNumero === '') 
        document.getElementById('idNumero').setAttribute('placeholder', 'Preenchimento obrigatorio');
});

const limpa_formulário_cep = () => {
    //Limpa valores do formulário de cep.
    document.getElementById('idRua').value=("");
    document.getElementById('idBairro').value=("");
    document.getElementById('idCidade').value=("");
    document.getElementById('idUF').value=("");
};

botao.addEventListener('click', () => {
    document.getElementById('idResult').innerHTML = 
    '<br/><b> Quadra : ' +
    document.getElementById('idRua').value 
    + '<br/><b> Bairro : ' +
    document.getElementById('idBairro').value
    + '<br/><b> Cidade : ' +
    document.getElementById('idCidade').value
    + '<br/><b> Estado : ' +
    document.getElementById('idUF').value;
    
    //'<br/><b>Email   : </b>' + usuario.email    + 
   // '<br/><b>Telefone: </b>' + usuario.telefone;
});