# Maquina de Café em Java - Abstração e Encapsulamento

## Descrição do Projeto

Este projeto é uma implementação prática dos conceitos de Abstração e Encapsulamento em Java. Durante a aula, criamos uma máquina de café simulada, aplicando boas práticas de orientação a objetos.

## Tecnologias Utilizadas

Java

Programação Orientada a Objetos (POO)

Encapsulamento e Abstração

## Estrutura do Projeto

O projeto é composto pelos seguintes componentes:

### 1. Interface MaquinaCafe

Define os métodos essenciais da máquina de café:

* ```ligar()```

* ```desligar()```

* ```colocarCachimbo()```

* ```retirarCachimbo()```

* ```selecionarModo(ModoCafe modo)```

* ```fazerCafe()```

### 2. Enum ModoCafe

Define os tipos de café disponíveis:

* EXPRESSO

* AMERICANO

* PINGADO

### 3. Classe DolceGusto

Implementa a interface ```MaquinaCafe```, aplicando encapsulamento. Nesta classe:

* Apenas os métodos da interface são públicos.

* Atributos internos, como ```resistenciaLigada```, ```ligada``` e ```possuiCachimbo```, são privados.

* A lógica interna simula o funcionamento da máquina de café.

Conceitos Aplicados

✅ Abstração: Exposição apenas das funcionalidades essenciais da máquina de café.
✅ Encapsulamento: Proteção dos detalhes internos, permitindo acesso apenas pelos métodos públicos da interface.
✅ Interfaces: Definição de um contrato de funcionamento para diferentes implementações de máquinas de café.
✅ Enums: Representação de um conjunto fixo de valores para os modos de café disponíveis.

### Como Executar o Projeto

Clone este repositório:

```git clone https://github.com/seu-usuario/maquina-cafe-java.git```

Compile o projeto:

```javac *.java```

Execute a classe principal:

```java Main```

### Autor

Yago Moreira - Desenvolvedor e estudante de Java.

### Licença

Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.
