
# Apache Maven

## Sobre
### O Apache Maven é uma excelente ferramenta de apoio a qualquer equipe que trabalhe com projetos Java (outras tecnologias também são suportadas), fornecendo aos desenvolvedores uma forma de automatizar e padronizar a construção e publicação de suas aplicações.

## Configuração e Intalação
### Para realizar a instalação inicial no windows, basta realizr o dowload no Site do Apache Maven, onde colocará em um local do equipamento, e em seguida add a variavel de hambiente do Apache (caminho da pasta realizado o dowaload colocando a pasta BIN).

mvn archetype:generate -DgroupId=one.digitalinnovation -DartifactId=[nome-da-pasta-do-projeto] -Darchetype=maven-archetype=maven-archetype-quickstart -DinteractiveMode=false

#### Códigos no Maven
- mvn compiller (vá até a pasta do projeto) -/*Realizando a compilação*/-
- mvn test (vá até a pasta do projeto) -/*Realizando o teste da aplicação(validando)*/-
- mvn package (vá até a pasta do projeto) -/*Cria o Package da aplicação - empacotam a aplicação*/-
- mvn clean (vá até a pasta do projeto) -/*Limpa a aplicação    */-