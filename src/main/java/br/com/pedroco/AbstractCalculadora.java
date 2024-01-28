package main.java.br.com.pedroco;

public abstract class AbstractCalculadora implements ICalculadora {

    public static final float PI = 3.1415f;

    public Integer somar(Integer a, Integer b) {
        return a + b;
    }

    public Integer subtrair(Integer a, Integer b) {
        return a - b;
    }

    public Integer multiplicar(Integer a, Integer b) {
        return a * b;
    }

    public float dividir(Integer a, Integer b) {
        if (b == 0) {
            throw new RuntimeException("b nao pode ser 0");
        }
        return a / b;
    }

    public double exponenciar(Integer x, Integer y) {
        return Math.pow(x, y);
    }
}
