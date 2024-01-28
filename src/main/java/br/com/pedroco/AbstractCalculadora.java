package main.java.br.com.pedroco;

/**
 * Classe abstrata que fornece implementações básicas para operações de uma calculadora.
 * Implementa a interface ICalculadora.
 */
public abstract class AbstractCalculadora implements ICalculadora {

    /**
     * Constante que representa o valor de PI.
     */
    public static final float PI = 3.1415f;

    /**
     * Soma dois números inteiros.
     *
     * @param a O primeiro número inteiro.
     * @param b O segundo número inteiro.
     * @return A soma de a e b.
     */
    public Integer somar(Integer a, Integer b) {
        return a + b;
    }

    /**
     * Subtrai um número inteiro (b) de outro número inteiro (a).
     *
     * @param a O número inteiro a ser subtraído.
     * @param b O número inteiro a subtrair.
     * @return A diferença entre a e b.
     */
    public Integer subtrair(Integer a, Integer b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a O primeiro número inteiro.
     * @param b O segundo número inteiro.
     * @return O produto de a e b.
     */
    public Integer multiplicar(Integer a, Integer b) {
        return a * b;
    }

    /**
     * Divide um número inteiro (a) por outro número inteiro (b).
     *
     * @param a O dividendo.
     * @param b O divisor.
     * @return O quociente de a dividido por b.
     * @throws RuntimeException Se b é igual a 0.
     */
    public float dividir(Integer a, Integer b) {
        if (b == 0) {
            throw new RuntimeException("b nao pode ser 0");
        }
        return a / b;
    }

    /**
     * Exponencia um número inteiro (x) pela potência de outro número inteiro (y).
     *
     * @param x A base.
     * @param y O expoente.
     * @return O resultado de x elevado a y.
     */
    public double exponenciar(Integer x, Integer y) {
        return Math.pow(x, y);
    }
}
