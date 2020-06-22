# Comutador de conexão

> Representação da migração do banco de dados Oracle para MySQL usando o padrão de projeto (design pattern) Adapter. 

## Objetivo

O padrão Adapter permite que objetos incompatíveis entre si passaem a ser incompatíveis. este proejto busca demonstrar esta adaptação de um objeto com outro, de modo a desenvolver os mesmo métodos que lhe são necessários de modo que se possa substituir uma classe, que representa o BD Oracle, por outra, que representa o BD MySQL.

## Analisando o código

Na classe de teste (ComutadorDeConexao) tem-se três conexões ao banco de dados: a primeira é um acesso de conexão com o banco Oracle, onde se estabelece normalmente.
```java
ConexaoBD conexao1 = new Oracle();
conexao1.insert();
```

Na segunda, a conexão falha pois o método `insert()` não é o mesmo método utilizado pela classe MySQL.
```java
ConexaoBD conexao2 = new MySQL();
conexao2.insert();
```

Na terceira, tem-se a conexão ao banco MySQL e o uso do método `insert()` pois a classe AdaptadorMySQL cumpre seu papel de adaptar os métodos da classe MySQL aos métodos da interface ConexaoBD.  
```java
ConexaoBD conexao3 = new AdaptadorMySQL(new MySQL());
conexao3.insert();
```

## Conexões obtidas

Executando o código é possível perceber que tanto os objetos conexao1 e conexao3 conseguem acionar o mesmo método para inserir dados em bancos diferentes.

Saída no console:
```
Insert no BD Oracle
Insert no BD MySQL
```
