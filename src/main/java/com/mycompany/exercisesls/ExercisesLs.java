/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercisesls;
import java.util.Scanner; //importei a classe scanner

public class ExercisesLs { //denominei o classe de exercisels

    //a classe principal: o scanner
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // nesse trecho do código, declarei a ordem que deve ser seguida
        exercicio1(scanner);
        exercicio2(scanner);
        exercicio3(scanner);
        exercicio4(scanner);
       
        scanner.close();//e após a execução o scanner será fechado
    }
    
    //bloco do exercício 1 : Tabuada
    public static void exercicio1(Scanner scanner){
        System.out.println("====Exercício 1 - Tabuada ====");// título
        System.out.print("Escolha um número de sua preferência e descubra a sua respectiva tabuada:");//é pedido ao usuário para que escolha um número
       int valor = scanner.nextInt();// que receberá um valor inteiro
        
        System.out.println("\n Tabuada do " + valor + ":");// é exibido a mensagem da tabuada do respectivo valor
         for (int i = 1; i <= 10; i++) {// segue-se a estrutura de: inicialização ( atribuido o valor 1 ao i), condição ( i deve ser menor ou igual a 10) e por fim, o incremento
            System.out.println(valor + " x " + i + " = " + (valor * i));//exibe visualmente o cálculo
        }
        System.out.println();// pula uma linha
    }
    public static void exercicio2(Scanner scanner){
        System.out.println("=== Exercicio 2 - Pulo dos numeros===");//título
        System.out.print("Escolha o número de pulos dos números de 1 a 100 de acordo com sua preferencia:");//pede para que o usuário escolha a quantidade de pulos entre os números
        int pulos = scanner.nextInt();//receberá o valor dos pulos
        
         System.out.println("\nNúmeros de 1 a 100 pulando de " + pulos+ " em " + pulos + ":");//mensagem ao usuário
         for (int i = 1; i <= 100; i += pulos) {
             System.out.print(i + "");
             
             System.out.println("");
             
             System.out.println("\n Proximo teste: Cronometro");
             
         }
    }
      
    // Exercício 3: Cronômetro
    public static void exercicio3(Scanner scanner) {
        System.out.println("=== Exercicio 3 - Cronometro ===");
        System.out.print("Digite o número final do cronômetro: ");
        int nfinal = scanner.nextInt();
        
        System.out.println("\nCronômetro iniciando...");
        for (int i = 0; i <= nfinal; i++) {
            System.out.println(i + " segundos");
            try {
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Cronômetro finalizado!\n");
    }
    
    // Exercício 4: Números de 1 a 30 pulando múltiplos de 4
    public static void exercicio4(Scanner scanner) {
        System.out.println("=== Exercicio 4 - Numeros sem os multiplos de 4 ===");
        System.out.println("Números de 1 a 30 (com exceçao dos multiplos de 4):");
        
        for (int i = 1; i <= 30; i++) {
            if (i % 4 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }
}

