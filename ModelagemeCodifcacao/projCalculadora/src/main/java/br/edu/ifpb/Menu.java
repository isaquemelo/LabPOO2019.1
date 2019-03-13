package br.edu.ifpb;

import java.util.*;

public class Menu {

    public void exibirMenu() {
        System.out.println("Calculadora");
        System.out.println("===================");
        System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Sobre a calculadora");
        System.out.println("6. Sair");
    }

    public int perguntarOpcao() {
        Scanner user_input = new Scanner(System.in);
        return user_input.nextInt();
    }

}
