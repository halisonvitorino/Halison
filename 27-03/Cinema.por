programa {
  funcao inicio() {

    cadeia  nome
    inteiro idade
    inteiro sala
    logico a = falso

faca {
          escreva ("Informe seu nome:  ")
          leia (nome)
          escreva ("Informe sua idade:  ")
          leia (idade)
          escreva("Escolha o filme desejado: \n")

          escreva("---- Tons de Cinza  - sala 1 - Classificação Indicativa 18 anos\n")
          escreva("---- Titanic        - sala 2 - Classificação Indicativa 18 anos\n")
          escreva("---- Matrix         - sala 3 - Classificação Indicativa 16 anos\n")
          escreva("---- Avatar         - sala 4 - Classificação Indicativa 14 anos\n")
          escreva("---- Pinoquio       - sala 5 - Classificação Indicativa Livre \n")         
          
          escreva ("Informe a sala:  ")
          leia (sala)

          escolha(sala) {
              caso 1:  
                se (idade < 18){
                     escreva ("Idade abaixo da classificação \n") 
                     pare
                } senao {
                     escreva ("Bom Filme!!") 
                     a == verdadeiro
                     pare
                }  
              caso 2:  
                se (idade < 18){
                     escreva ("Idade abaixo da classificação") 
                } senao {
                     escreva ("Bom Filme!!") 
                     a == verdadeiro
                }         
              caso 3:  
                se (idade < 16){
                     escreva ("Idade abaixo da classificação") 
                } senao {
                     escreva ("Bom Filme!!") 
                     a == verdadeiro
                }   
              caso 4:  
                se (idade < 14){
                     escreva ("Idade abaixo da classificação") 
                } senao {
                     escreva ("Bom Filme!!") 
                     a == verdadeiro
                }   
              caso 5:  
                    escreva ("Bom Filme!!")   
                    a == verdadeiro 
      }              
    } enquanto (a == falso) 
  }
}
