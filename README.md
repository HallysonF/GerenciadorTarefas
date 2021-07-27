# Projeto Gerenciador de tarefas recrutamento DEV - ESIG GROUP

Simples gerenciador de tarefas com funcionalidades:

- Criar uma tarefa
- Atualizar a tarefa
- Remover a tarefa
- Listar terefas

## Cloud

* [ Deploy Heroku ](https://gerenciatar.herokuapp.com/ )

## Download do projeto

Faça o clone do projeto:

```bash
$ git clone https://github.com/HallysonF/GerenciadorTarefas.git
$ cd GerenciadorTarefas
```
Para Executar a aplicação:

- Usando Maven

```bash
$ mvn clean install

```
para rodar o projeto: utilizar o server de preferência.
- podera rodar a aplicação direto do terminal com o comando

```bash
web:    java $JAVA_OPTS -jar target/dependency/webapp-runner.jar --port $PORT target/*.war

```

- Usando IDE Apache Netbeans
File -> open project -> Click com o botão direito do mouse sobre o projeto -> clean and build

Para rodar o projeto 

click com botão direito do mouse sobre o projeto -> run

* É necessário mudar os parametros de conexão com o banco de dados, caso possua configuração de admin e password personalizados.

### Desenvolvimento da Aplicação

Para o desenvolvimento da Aplicação web foi utilizado maven, jsf,  jpa, PrimeFaces PostgreSQL e para testes de unidades foi utilizado o Junit.
- Maven 

Apache Maven, ou Maven, é uma ferramenta de automação de compilação utilizada primariamente em projetos Java. Ela é similar à ferramenta Ant, mas é baseada em conceitos e trabalhos diferentes em um modo diferente. Também é utilizada para construir e gerenciar projetos escritos em C#, Ruby, Scala e outras linguagens. O projeto Maven é hospedado pela Apache Software Foundation, que fazia parte do antigo Projeto Jakarta.

- Java

  Um projeto Java é composto por classes e essas classes possui tipos, modicadores de acesso, interfaces etcc.

- JSF
  
  JavaServer Faces (JSF) é uma especificação Java para a construção de interfaces de usuário baseadas em componentes para aplicações web. Possui um modelo de programação dirigido a eventos, abstraindo os detalhes da manipulação dos eventos e organização dos componentes, permitindo que o programador se concentre na lógica da aplicação.(Wikipedia.org).
  
  
- JPA

  Java Persistence API (ou simplesmente JPA) é uma API padrão da linguagem Java que descreve uma interface comum para frameworks de persistência de dados. A JPA define um meio de mapeamento objeto-relacional para objetos Java simples e comuns (POJOs), denominados beans de entidade. Diversos frameworks de mapeamento objeto/relacional como o Hibernate implementam a JPA. Também gerencia o desenvolvimento de entidades do Modelo Relacional usando a plataforma nativa Java SE e Java EE.

Originou-se num projeto comum entre os desenvolvedores para se criar o padrão[1]. Fortemente baseado nas ideias trazidas pelo Hibernate, tanto que o líder da primeira versão dessa especificação é o criador do framework.

Ou seja, é utilizado principalmente para conexão e acesso a banco de dados relacionais.(Wikipedia.org).


- PrimeFaces

 PrimeFaces é uma biblioteca de componentes de interface de usuário (IU) de código aberto para aplicativos baseados em JavaServer Faces , criada pela empresa turca PrimeTek Informatics com caraceteristicas:
    Mais de 100 componentes de IU
    Ajax Framework
    Kit de UI para celular
    Push Framework
    Quadro de diálogo
    Validação do lado do cliente
    Theme Engine
    Estrutura de expressão de pesquisa
  
  
- PostgreSQL

  PostgreSQL é um sistema gerenciador de banco de dados objeto relacional (SGBD), desenvolvido como projeto de código aberto com as seguintes caracteristicas:

  Consultas complexas
  Chaves estrangeiras
  Integridade transacional
  Controle de concorrência multi-versão
  Suporte ao modelo híbrido objeto-relacional
  Facilidade de Acesso
  Gatilhos
  Visões
  Linguagem Procedural em várias linguagens (PL/pgSQL, PL/Python, PL/Java, PL/Perl) para Procedimentos armazenados
  Indexação por texto
  Estrutura para guardar dados Georreferenciados PostGIS

-Junit
  O JUnit é um framework open-source, que se assemelha ao raio de testes software java, criado por Erich Gamma e Kent Beck, com suporte à criação de testes automatizados na linguagem de programação Java.
Esse framework facilita a criação e manutenção do código para a automação de testes com apresentação dos resultados. Com ele, pode ser verificado se cada método de uma classe funciona da forma esperada, exibindo possíveis erros ou falhas podendo ser utilizado tanto para a execução de baterias de testes como para extensão.(Wikipedia.org)
- Heroku

  Plataforma em nuvem como um serviço que suporta várias linguagens de programação. Uma das primeiras plataformas em nuvem, o Heroku está em desenvolvimento desde junho de 2007, quando suportava apenas a linguagem de programação Ruby, mas agora suporta Java, Node.js, Scala, Clojure, Python, PHP e Go
##IDE para desenvolvimento

Para Desenvolvimento de todo o projeto foi utilizado o IDE Netbeans para mais informações
* [Apache NetBeans](https://netbeans.apache.org/)
## Banco de Dados


## Pontos Positivos

- Aplicação Estrutura organizada e ajustada padrão MVC

- Layout com primeFaces

-Testes utilizando o Junit

- Aplicação Funcional

- Deploy Heroku

## Pontos Negativos

- Deploy no Heroku com paradas inesperadas pagína 404

- css pouco trabalhado

## Pontos a Melhorar

- Testes de unidades

- Layout

- Folha de estilos

- Organização das tabuações
