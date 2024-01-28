package br.com.pedroco;

public class TesteCalculadora {
    
    public static void main(String[] args) {
        System.out.println("RODOU");

        Integer a = 2;
        Integer b = 3;

        AbstractCalculadora calc = new CalculadoraCientifica();
        Integer resultado = calc.somar(a, b);

        System.out.println("PI: "+ AbstractCalculadora.PI);
        System.out.println("O resultado de " + a + " com " + b + " é igua a "+ resultado);
    }
}
