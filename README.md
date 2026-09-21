# 📚 Lista de Exercícios 01 e 02 — Java

Repositório criado para registrar minha evolução nos estudos de **Java**, com foco nos fundamentos da linguagem, entrada e saída de dados, processamento de cálculos e estruturas de decisão.

Os exercícios foram desenvolvidos de forma progressiva, começando por operações básicas e avançando para estruturas condicionais mais complexas.

---

## 🎯 Objetivos

Este projeto tem como objetivo praticar:

* Variáveis e tipos de dados
* Entrada de dados com `Scanner`
* Operações matemáticas
* Operadores aritméticos
* Operadores relacionais e lógicos
* Estruturas condicionais
* `if`
* `if / else`
* `if / else if / else`
* `if` aninhado
* `switch`
* Manipulação de `String`
* Formatação de saída
* Organização e estruturação de código

---

# 📁 Estrutura do projeto

```text
src/
└── br.com.igor.lista01/
    ├── Exercicio_01.java
    ├── Exercicio_02.java
    ├── Exercicio_03.java
    ├── Exercicio_04.java
    ├── Exercicio_05.java
    ├── Exercicio_06.java
    ├── Exercicio_07.java
    ├── Exercicio_08.java
    ├── Exercicio_09.java
    ├── Exercicio_10.java
    ├── Exercicio_11.java
    └── Exercicio_12.java

└── lista_02/
    ├── Exercicio_01.java
    ├── Exercicio_02.java
    ├── Exercicio_03.java
    ├── Exercicio_04.java
    ├── Exercicio_05.java
    ├── Exercicio_06.java
    ├── Exercicio_07.java
    ├── Exercicio_08.java
    ├── Exercicio_09.java
    ├── Exercicio_10.java
    ├── Exercicio_11.java
    ├── Exercicio_12.java
    ├── Exercicio_13.java
    ├── Exercicio_14.java
    └── Exercicio_15.java
```

> A estrutura de pastas pode variar de acordo com a IDE utilizada.

---

# 📝 Lista 01 — Fundamentos

A primeira lista trabalha principalmente com **entrada de dados, variáveis e processamento de informações**.

### Exercício 01 — Dados pessoais

Leitura de:

* Nome
* Idade
* Altura

Exibição das informações fornecidas pelo usuário.

**Conceitos praticados:**
`String`, `int`, `double`, `Scanner` e saída de dados.

---

### Exercício 02 — Operações matemáticas

Leitura de dois números inteiros e cálculo de:

* Soma
* Subtração
* Divisão
* Resto da divisão

**Conceitos praticados:**

* Operadores aritméticos
* `%`
* Conversão para `double` em divisões

---

### Exercício 03 — Conversão de reais para dólares

Leitura de um valor em reais e da cotação do dólar para realizar a conversão.

**Conceitos praticados:**

* `double`
* Operações matemáticas
* Entrada de dados

---

### Exercício 04 — Média de quatro notas

Leitura de quatro notas bimestrais e cálculo da média aritmética.

**Conceitos praticados:**

* Variáveis
* Operações matemáticas
* Média aritmética

---

### Exercício 05 — Cálculo de salário

Leitura do valor da hora trabalhada e da quantidade de horas trabalhadas no mês.

Cálculo de:

* Salário bruto
* Desconto de 8% de INSS
* Salário líquido

**Conceitos praticados:**

* Porcentagem
* Operações matemáticas
* Variáveis `double`

---

### Exercício 06 — Círculo

Leitura do raio de um círculo e cálculo de:

* Área
* Perímetro

Utilização de `Math.PI`.

---

### Exercício 07 — Retângulo

Leitura da base e da altura de um retângulo e cálculo de:

* Área
* Perímetro
* Diagonal

Utilização de `Math.sqrt()` para calcular a raiz quadrada.

---

### Exercício 08 — Conversão de temperatura

Conversão de uma temperatura em Celsius para:

* Fahrenheit
* Kelvin

---

### Exercício 09 — Par ou ímpar

Verificação se um número inteiro é par ou ímpar.

**Conceito principal:**

```java
numero % 2 == 0
```

---

### Exercício 10 — Situação do aluno

Classificação de um aluno de acordo com sua média:

| Média     | Situação    |
| --------- | ----------- |
| ≥ 7       | Aprovado    |
| ≥ 5 e < 7 | Recuperação |
| < 5       | Reprovado   |

**Conceitos praticados:**

* `if`
* `else if`
* `else`

---

### Exercício 11 — Maior de três números

Leitura de três números inteiros distintos e identificação do maior valor.

**Conceitos praticados:**

* Comparações
* Operadores relacionais
* Estruturas condicionais

---

### Exercício 12 — Conta de energia

Cálculo do valor da conta de energia de acordo com o consumo mensal:

| Consumo          | Valor por kWh |
| ---------------- | ------------: |
| Até 100 kWh      |       R$ 0,50 |
| 101–300 kWh      |       R$ 0,75 |
| Acima de 300 kWh |       R$ 1,10 |

A tarifa da faixa é aplicada sobre o consumo total.

---

# 🧠 Lista 02 — Estruturas de Decisão

A segunda lista aprofunda o uso das estruturas condicionais e introduz diferentes formas de controlar o fluxo de execução de um programa.

---

## Parte 1 — IFs independentes

Neste modelo, cada condição é avaliada separadamente.

Mais de uma condição pode ser verdadeira na mesma execução.

### Exercício 01 — Classificação por idade

Verificação independente das seguintes condições:

* 16 anos ou mais → pode votar
* 18 anos ou mais → pode dirigir
* 60 anos ou mais → idoso

Uma pessoa de 65 anos pode receber as três mensagens.

---

### Exercício 02 — Características de um número

Verificação independente se o número:

* É positivo
* É par
* É múltiplo de 5
* Possui dois dígitos

Utilização de:

```java
Math.abs(numero)
```

para trabalhar com o módulo do número.

---

### Exercício 03 — Alertas climáticos

Leitura da temperatura e da umidade para verificar:

* Calor extremo
* Umidade baixa
* Risco de queimada

Mais de um alerta pode ser exibido simultaneamente.

---

# 🔀 Parte 2 — IF e ELSE

Nesta parte, existem dois caminhos possíveis.

### Exercício 04 — Múltiplo de outro número

Verificação se o primeiro número é múltiplo do segundo.

Também é feita uma verificação para evitar divisão por zero.

---

### Exercício 05 — Ano bissexto

Verificação da regra de ano bissexto utilizando operadores:

```java
&&
||
%
```

---

### Exercício 06 — Frete

Cálculo do frete de acordo com o valor da compra.

* Compra ≥ R$ 199,00 → frete grátis
* Compra < R$ 199,00 → frete de R$ 24,90

---

# 🔢 Parte 3 — IF, ELSE IF e ELSE

Utilização de condições mutuamente excludentes.

### Exercício 07 — Saudação

Classificação da hora do dia:

* 00–11 → Bom dia
* 12–17 → Boa tarde
* 18–23 → Boa noite
* Outros valores → Hora inválida

---

### Exercício 08 — Classificação de velocidade

Classificação da infração de acordo com o percentual acima do limite da via:

* Dentro do limite → sem multa
* Até 20% acima → média
* Acima de 20% até 50% → grave
* Acima de 50% → gravíssima

---

### Exercício 09 — Bônus por tempo de casa

Definição do percentual de bônus de acordo com os anos de trabalho:

| Tempo de casa | Bônus |
| ------------- | ----: |
| < 1 ano       |    0% |
| 1–3 anos      |    5% |
| > 3–10 anos   |   10% |
| > 10 anos     |   15% |

---

# 🪆 Parte 4 — IF Aninhado

Nesta parte, uma decisão depende de uma decisão anterior.

### Exercício 10 — Login

Verificação de:

1. Existência do usuário
2. Senha

O programa não verifica a senha caso o usuário não exista.

---

### Exercício 11 — Frequência e média

Primeiro é verificada a frequência.

Se a frequência for menor que 75%, o aluno é reprovado por falta.

Caso contrário, a média é analisada:

* ≥ 7 → aprovado
* ≥ 5 e < 7 → recuperação
* < 5 → reprovado por nota

---

### Exercício 12 — Saque bancário

Verificação sequencial de:

1. Saldo suficiente
2. Limite diário
3. Realização do saque

O saldo só é alterado quando todas as condições necessárias são satisfeitas.

---

# 🔀 Parte 5 — SWITCH

Utilização de `switch` para trabalhar com escolhas baseadas em valores exatos.

### Exercício 13 — Calculadora

Opções disponíveis:

```text
1 → Soma
2 → Subtração
3 → Multiplicação
4 → Divisão
```

Também é feita uma verificação para impedir divisão por zero.

Utilização da sintaxe moderna:

```java
case 1 -> {
    ...
}
```

---

### Exercício 14 — Dias do mês

Recebimento do número do mês e identificação da quantidade de dias.

Meses com a mesma quantidade de dias são agrupados no mesmo `case`.

Fevereiro é considerado com 28 dias.

---

# 🅿️ Parte 6 — Exercício Integrador

### Exercício 15 — Terminal de estacionamento

Exercício que reúne diversos conceitos estudados anteriormente.

O programa:

* Identifica o tipo de veículo utilizando `switch`
* Define a tarifa por hora
* Calcula o valor do estacionamento
* Verifica a existência de cupom
* Valida o valor mínimo para utilização do cupom
* Aplica desconto de 20%
* Emite alerta para permanência superior a 12 horas
* Emite alerta de cobrança de diária após 24 horas
* Classifica a permanência como curta, média ou longa
* Exibe o valor final com duas casas decimais

### Tarifas

| Veículo | Valor por hora |
| ------- | -------------: |
| Carro   |        R$ 8,00 |
| Moto    |        R$ 5,00 |

### Classificação da permanência

| Tempo            | Classificação |
| ---------------- | ------------- |
| Até 2 horas      | Curta         |
| Até 6 horas      | Média         |
| Acima de 6 horas | Longa         |

---

# 🛠️ Tecnologias utilizadas

* **Java**
* `Scanner`
* `Math`
* Estruturas condicionais
* `switch`
* Operadores matemáticos e lógicos

---

# 📈 Conteúdos praticados

```text
Java
│
├── Variáveis
├── Tipos primitivos
│   ├── int
│   └── double
│
├── String
│
├── Scanner
│
├── Operadores
│   ├── Aritméticos
│   ├── Relacionais
│   └── Lógicos
│
├── Math
│   ├── PI
│   ├── abs()
│   └── sqrt()
│
├── if
├── if / else
├── if / else if / else
├── if aninhado
│
└── switch
    └── case -> / default ->
```

---

# 🚀 Objetivo do projeto

Este repositório faz parte do meu processo de aprendizado em **programação Java**.

A proposta é construir uma base sólida de lógica de programação antes de avançar para conceitos mais complexos da linguagem, desenvolvendo gradualmente a capacidade de:

* interpretar problemas;
* transformar regras em lógica;
* escolher estruturas de controle adequadas;
* escrever código organizado;
* identificar e corrigir erros;
* desenvolver soluções de forma independente.

---

## 📌 Status

🟢 Em desenvolvimento — novos exercícios e conteúdos serão adicionados conforme meu avanço nos estudos de Java.

---

## 👨‍💻 Autor

**Igor Alcântara**

Estudante de programação e tecnologia.

---
