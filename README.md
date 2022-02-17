# backendchallenge
Backend Developer Challenge
	Após ter instalado o Java, passei para a instalação do IDE da minha preferência que é o Eclipse e a posterior instalei o MySQL Workbench.
Passei para a criação do projecto o qual chamei de BackendDeveloper;
Terceiro optei por configurar o  Hibernate para  integrar Orientação a Objectos com a  Base de Dados Relacional.
Em seguida instalei o JUnit para testar o código;
Em seguida passei para a criação e mapeamento da minha tabela na base de dados, essa tabela vem em geito de uma classe java no pacote “mz.com.backenddeveloper.domain” com o nome “Pais.java”. Essa classe contem todos atributos de um pais requisitados no desafio.
Em seguida criei a camada DAO (Data Access Object) que contem todo CRUD  do nosso desafio o qual se encontra no pacote “mz.com.backenddeveloper.dao” do nosso projecto.
Em seguida passei para a instalação e integração do Tomcat server com o Java para correr o projecto.
Executei os testes para certificar me de que tudo estava tudo bem. A camada de testes está no pacote “mz.com.backenddeveloper.test” usando a classe PaisDAOTest.java.
Passei para a fase da instalação e configuração do Jersey Container Servlet para trabalhar com RESTfull.
A connfiguração do Jersey fiz basedo no código Java. A classe de configuração encontra se no pacote “mz.com.backenddeveloper.service” com o nome BackendDeveloperService.java.
Em seguida criei o meu serviço com o nome PaisService.java com os respectivos métodos. Esta classse está no pacote “mz.com.backenddeveloper.service”.
	Primeiros testes fiz usando o browser  e em seguida para outras chamadas como POST, PUT e DELETE usei o Advanced Rest Client.
