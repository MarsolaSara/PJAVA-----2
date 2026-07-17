# ☕ Desafios de Controle de Fluxo em Java

Projeto desenvolvido durante a trilha de Java da DIO com o objetivo de praticar conceitos fundamentais da linguagem, como estruturas de repetição, tratamento de exceções, entrada de dados e lógica de programação.

O repositório reúne pequenos desafios que simulam situações do mundo real, como validação de parâmetros e etapas de um processo seletivo.

---

## 📚 Conceitos praticados

- Estruturas condicionais (`if` e `else`);
- Laços de repetição (`for` e `while`);
- Vetores (`arrays`);
- Entrada de dados com `Scanner`;
- Métodos;
- Criação de exceções personalizadas;
- Tratamento de erros com `try/catch`;
- Geração de valores aleatórios;
- Organização de projetos em Java.

---

## ⚙️ Funcionalidades

### 🔢 Sistema de Contagem

O programa solicita dois números ao usuário e realiza uma contagem baseada na diferença entre eles.

Caso o segundo número seja menor que o primeiro, uma exceção personalizada é lançada para informar o erro.

Exemplo:

```text
Digite o primeiro parâmetro: 5
Digite o segundo parâmetro: 10

Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
Imprimindo o número 4
Imprimindo o número 5
```

---

### ⚠️ Exceção Personalizada

Foi criada a classe:

```text
ParametrosInvalidosException
```

Ela é responsável por validar as entradas do usuário e impedir execuções incorretas.

Mensagem exibida:

```text
O segundo parâmetro deve ser maior que o primeiro.
```

---

### 👨‍💼 Simulação de Processo Seletivo

O projeto também contém uma simulação simples de um processo seletivo, permitindo:

- Selecionar candidatos;
- Simular tentativas de contato;
- Trabalhar com listas;
- Gerar resultados aleatórios;
- Utilizar métodos auxiliares.

---

## 🛠️ Tecnologias utilizadas

- Java
- Visual Studio Code

---

## 📂 Estrutura do projeto

```text
src/
├── Contador.java
├── ParametrosInvalidosException.java
└── ProcessoSeletivo.java
```

---

## ▶️ Como executar

Clone o repositório:

```bash
git clone https://github.com/seu-usuario/nome-do-repositorio.git
```

Entre na pasta:

```bash
cd nome-do-repositorio
```

Compile os arquivos:

```bash
javac src/*.java
```

Execute a aplicação:

```bash
java src/Contador
```

ou:

```bash
java src/ProcessoSeletivo
```

---

## 🎯 Objetivo do projeto

Este projeto faz parte da minha jornada de aprendizado em Java e foi desenvolvido para consolidar conceitos essenciais da linguagem antes de avançar para tecnologias mais robustas, como:

- Programação orientada a objetos;
- APIs REST;
- Spring Boot;
- Bancos de dados;
- Desenvolvimento web.

---

## 🚀 Próximos passos

- Aplicar orientação a objetos de forma mais avançada;
- Integrar banco de dados;
- Criar interfaces gráficas;
- Desenvolver APIs em Java;
- Construir sistemas completos utilizando Spring Boot.

---

## 👨‍💻 Desenvolvido por

**Sara Silva Marsola**

Estudante de Desenvolvimento de Sistemas com foco em Java, desenvolvimento web e construção de sistemas completos.
