fun main(args: Array<String>) {

    print("Digite a sua nota ref ao 1º bimestre: ")
    var primeiraNota = readLine()!!.toDouble()
    print("Digite a sua nota ref ao 2º bimestre: ")
    var segundaNota = readLine()!!.toDouble()
    print("Digite a sua nota ref ao 3º bimestre: ")
    var terceiraNota = readLine()!!.toDouble()
    print("Digite a sua nota ref ao 4º bimestre: ")
    var quartaNota = readLine()!!.toDouble()

    var media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4

    if(media < 4.0){
        println("\nVocê foi reprovado(a)! :(")
    }else if(media >= 4.0 && media <= 5.0){
        println("\nMédia regular! Bora fazer um curso de recperação?")
    }else if(media >= 5.0 && media <= 8.0){
        println("\nA sua média é boa! :)")
    }else if(media >= 8.0 && media <= 10.0){
        println("\nParabéns! A sua média é excelente =D")
    }else if(media >10.1){
        println("\nMédia invalida, escreva apenas numeros entre 0 e 10.")


    }    }

/*
   2 - Crie um programa onde o usuário digite as notas referente a 4 bimestres e calcule a média.
   No final, verifique a situação do aluno com base nesses dados:

   - Reprovado se a média for 4 ou menos
   - Regular se a média for maior que 4 e menor ou igual a 5
   - Boa se a média for maior do que 5 e menor ou igual a 8
   - Excelente se a média for maior do que 8 e menor ou igual a 10
   - Se a média der um número negativo ou     uma nota fora da escala de 0 a 10,
       deverá ser printado média inválida
    */