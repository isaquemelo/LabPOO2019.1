package br.edu.ifpb;

public class Calculadora {
    private String calculadoraInfo;

    public void setCalculadoraInfo(String info){
        this.calculadoraInfo = info;
    }

    public String getCalculadoraInfo() {
        return calculadoraInfo;
    }

    public double sum(double num1, double num2){
        return num1 + num2;
    }

    public double sub(double num1, double num2){
        return num1 - num2;
    }

    public double mut(double num1, double num2){
        return num1 * num2;
    }

    public double div(double num1, double num2){
        return num1 / num2;
    }
}
