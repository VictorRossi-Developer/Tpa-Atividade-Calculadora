/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoradeoperacoesmatematicas;

/**
 *
 * @author FATEC ZONA LESTE
 */

public class CalculadoraVictor {

    public static void main(String[] args) {
        //Declaração de dois números, o double é usado para decimais
        double num1 = 21.3;
        double num2 = 7.3;
        
        // Fazendo operações de matemática
        double soma = num1 + num2; 
        double subtracao = num1 - num2;
       double multiplicacao = num1 * num2;
       double divisao = num2 != 0 ? num1 / num2 : Double.NaN; // Impede a divisão por 0
       double resto = num1 % num2;
       
               
    //Demonstrando os produtos (resultados)
    System.out.println("Resultados das operações:"); //Demonstrando o produto de todas as operações
    System.out.println("Soma: " +soma); //Demonstrando o produto da soma
    System.out.println("Subtração: " + subtracao); //Demonstrando o produto da substração
    System.out.println("Multiplicação: " + multiplicacao); //Demonstrando o produto da multiplicação
    System.out.println("Divisão: " + (num2 != 0 ? divisao : "Indefinida (Divisão por zero")); //Demonstrando o produto d
    System.out.println("Resto da divisão: " + resto);    //Demonstrando o resto de tudo
    
    }
}
