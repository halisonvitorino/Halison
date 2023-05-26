
const cepPesquisado = document.getElementById('idCEP');

const limpa_formulário_cep = () => {
    //Limpa valores do formulário de cep.
    document.getElementById('idRua').value=("");
    document.getElementById('idBairro').value=("");
    document.getElementById('idCidade').value=("");
    document.getElementById('idUF').value=("");
};

const meu_callback = (conteudo) => {
    if (!('erro' in conteudo)) {

        //Atualiza os campos com os valores.
        document.getElementById('idRua').value = (conteudo.logradouro);
        document.getElementById('idBairro').value = (conteudo.bairro);
        document.getElementById('idCidade').value = (conteudo.localidade);
        document.getElementById('idUF').value = (conteudo.uf);

        document.getElementById('idComplemento').value = (conteudo.uf);
        document.getElementById('idUF').value = (conteudo.uf);
    } //end if.

    else {

        //CEP não Encontrado.
        limpa_formulário_cep();
        alert("CEP não encontrado.");
    }
};

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

