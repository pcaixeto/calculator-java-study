
# Projeto Calculadora Java

Este projeto contém implementações de uma calculadora básica e uma calculadora científica em Java.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes e interfaces:

- `ICalculadora`: Uma interface que define operações matemáticas básicas.
- `AbstractCalculadora`: Uma classe abstrata que implementa `ICalculadora` e fornece implementações padrão para as operações.
- `CalculadoraCientifica`: Uma classe que estende `AbstractCalculadora` e representa uma calculadora científica.
- `CalculadoraNormal`: Uma classe que também estende `AbstractCalculadora`, representando uma calculadora normal.
- `TesteCalculadora`: Uma classe com método `main` para testar as funcionalidades das calculadoras.

## Funcionalidades

As calculadoras suportam as seguintes operações:

- Soma
- Subtração
- Multiplicação
- Divisão
- Exponenciação

Além disso, a constante `PI` é definida na `AbstractCalculadora`.

## Uso

Para usar a calculadora, você pode instanciar `CalculadoraCientifica` ou `CalculadoraNormal` e chamar os métodos desejados. Por exemplo:

```java
AbstractCalculadora calc = new CalculadoraCientifica();
Integer resultado = calc.somar(2, 3);
System.out.println("Resultado: " + resultado);
```

## Executando Testes

A classe `TesteCalculadora` pode ser executada para testar a implementação da calculadora.

## Contribuições

Contribuições são bem-vindas. Por favor, abra um issue para discutir o que você gostaria de mudar.

## Licença

[MIT](https://choosealicense.com/licenses/mit/)
