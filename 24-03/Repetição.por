programa {
  funcao inicio() {

    cadeia nome, profissao
    caracter opcao

    faca   
        {  
          escreva("Informe seu nome: ")
          leia(nome)
          escreva("Informe sua profissão: ")
          leia(profissao)
          
          escreva (nome, "\n")  
          escreva (profissao, "\n")  

          escreva("Deseja informar outros dados? \n")
          escreva("(s) para Sim, ou aperte qualquer tecla e enter para encerrar \n")
          leia(opcao)
            
        } enquanto (opcao == "s") 
  }
}
