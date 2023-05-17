programa {
    funcao inicio() {
        
        cadeia nome, genero
        inteiro idade, inss
        
        escreva ("Informe o sexo (F/M):  ")
        leia (genero)
        escreva ("Informe a idade:  ")
        leia (idade)
        escreva ("Informe quantos anos de contribuição para o INSS:  ")
        leia (inss)
        escreva ("Informe o nome:  ")
        leia(nome)

    se (genero == "M") {
        se (idade >= 65) {
            se (inss >= 15){
                escreva(nome, ", pode descansar.")  
             } senao {
                escreva(nome, ", contribua mais , vai trabalhar.") 
             }
        } senao {
            escreva(nome, ", nao tem idade ainda, vai trabalhar.")
            }
        
    } senao {
        se (idade >= 60) {
            se (inss >= 15){
                escreva(nome, ", vai descansar.")  
             } senao {
                escreva(nome, ", vai trabalhar.") 
             }
        } senao {
            escreva(nome, ", vai trabalhar.")  
        }
     }
   }    
}
