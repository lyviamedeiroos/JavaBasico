package BasicoJava;

import java.util.Scanner;

public class CadastroAluno {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva seu nome: ");
        String nome = ler.next();

        System.out.println("Escreva seu endereço: ");
        String endereço = ler.next();

        System.out.println("Escreva seu curso: ");
        String curso = ler.next();

        System.out.println("Escreva sua idade: ");
        int idade = ler.nextInt();

        if (idade < 18){
            System.out.println("Por favor, se dirigir a secretaria e preencher declaração com a assinatura do responsável");
        }else{
            System.out.println("Estudante cadastrado com sucesso!");}
    }
}
