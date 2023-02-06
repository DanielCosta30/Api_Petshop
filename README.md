<h1 align="center">:file_cabinet: Api_Rest</h1>

## :memo: Descrição
Integração com Eclipse (projeto java com Spring Boot).
Projeto consiste em uma API para front-end em desenvolvimento ( projeto petshop) para ser listado, editado, criado e delitado um item.

<div style="display: inline_block"><br>
<img align="center" alt="Daniel-java" height="80" width="80" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg">
<img align="center" alt="Daniel-java" height="60" width="60" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg">

</div>

## :books: Recursos utilizados:
* <b>IDE Eclipse</b>
* <b>Java version 17</b>
* <b>Spring Boot</b>
* <b>JPA</b>
* <b>SQL</b>
* <b>Banco de dados H2</b>
* <b>Postman</b>

  
## :wrench: Processos:
 <b> :heavy_check_mark: Implementação de modelo de dominio</br>
 * <b>Department:</br>
	 *Agendamento;
	 *Atendentes;
	 *Clientes;
	 *Produtos;
 * <b>Class:</br>
	 *Agendamento;
	 *Atendentes;
	 *Clientes;
         *Produtos;
##
 <b>:heavy_check_mark:Mapeamento Objeto Relacional (ORM):</br>
 * <b>Adiconado uma annotation JPA:</br>
      - Entity. 
      - Table(tb_department).

##
 <b>:heavy_check_mark: Configurar o banco de dados H2 em memoria:</br>
 * <b>http:localhost:80880/h2-console</br>

 * <b>Inserido dados através do SQL:</br>
       <b>Criado arquivo importsql</br>
      - INSERT INTO tb_department(name) VALUES (''); 
      - INSERT INTO tb_agendamento(department_id, cliente, pet, data, horario) VALUES ();
      - INSERT INTO tb_atendente(department_id, name, matricula) VALUES ();
      - INSERT INTO tb_cliente(department_id, cliente, email, contato) VALUES ();
      
 ![Postmain](https://user-images.githubusercontent.com/81030386/216981091-1e33699f-b326-4526-9929-1e4e441b1dd8.jpeg)

##
 <b> :heavy_check_mark: Criar Objetos para acessar os dados do banco de dados e  criar Endpoints da API REST:</br>
 * <b>Funcionalidade para acessar e alterar o banco de dados através:</br>
 * <b>Objetos repository Spring data jpa.</br>

         - AgendamentosRepository
         - AtendentesRepository
         - ClientesRepository
         - ProdutosRepository


* <b>Gerando Endpoints</br>
  Utiliado annotation @RestController para responder por requisiões e @RequestMapping (value="/api) "para declarar o caminho:

         - AgendamentosController
         - AtendentesController
         - ClientesController
         - ProdutosController
 ex: :mag: http:localhost:80880/agendametos
   
   Implementado o endpoint com:
   GetMapping("/agendamento") - retornando um json.
   
 ![Postmain](https://user-images.githubusercontent.com/81030386/216981220-f6a67192-7f54-427e-9933-54664785371a.jpeg)
 
 
 ##
 <b>:heavy_check_mark: Documentado e testado API no Postman</br>
 
![Postmain](https://user-images.githubusercontent.com/81030386/216981293-a0b05a49-40a6-48cd-87e7-5accff746013.jpeg)


## Implementação futura
- Documentar no Swagger. 
- Deploy.


##  Colaboradores
<table>
 Daniel Costa 
</table>

