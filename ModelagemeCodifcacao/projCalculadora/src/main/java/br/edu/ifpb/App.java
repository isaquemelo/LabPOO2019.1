package br.edu.ifpb;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.setCalculadoraInfo("Calculadora v1");

        Menu menu = new Menu();
        Scanner user_input = new Scanner(System.in);

        menu.exibirMenu();

        while (true) {
            int opcao = menu.perguntarOpcao();
            if (opcao == 1) {
                System.out.println(calculadora.sum(user_input.nextDouble(), user_input.nextDouble()));
            } else if (opcao == 2) {
                System.out.println(calculadora.sub(user_input.nextDouble(), user_input.nextDouble()));
            } else if (opcao == 3) {
                System.out.println(calculadora.mut(user_input.nextDouble(), user_input.nextDouble()));
            } else if (opcao == 4) {
                System.out.println(calculadora.div(user_input.nextDouble(), user_input.nextDouble()));
            } else if (opcao == 5) {
                System.out.println(calculadora.getCalculadoraInfo());
            } else if (opcao == 6) {
                System.exit(0);
            } else {
                System.out.println("Opção invalida");
            }
        }
    }
}
