programa {
  funcao inicio() {
    inteiro x,y
    real result
    caracter operador

    escreva ("Informe o primeiro número: ")
    leia(x)
    escreva ("Informe o segundo número: ")
    leia(y)
    escreva ("Informe: \n")
    escreva ("+ para somar;\n")
    escreva ("- para subtrair;\n")
    escreva ("* para multiplicar;\n")
    escreva ("/ para dividir;\n")
    leia(operador)

    escolha(operador) {

    caso "+":  
        result = (x+y)
        escreva ("A multiplicação é: " + result)  
    pare  
  
    caso "-":  
        result = (x-y)
        escreva ("A subtração é: " + result)  
    pare  
      
    caso "*":  
        result = (x*y)
        escreva ("A multiplicação é: " + result)  
    pare  
      
    caso "/":  
        result = (x/y)
        escreva ("A divisão é: " + result)  
    pare  
   
    }    
  }
}
