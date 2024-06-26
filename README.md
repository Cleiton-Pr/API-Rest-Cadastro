
Uma API REST de cadastro medico, uma interface de programação seguindo os princípios REST (Representational State Transfer) e permite operações CRUD (Create, Read, Update, Delete) em um sistema ou banco de dados. Aqui estão os principais aspectos dessa API: 

Endpoints RESTful: Definição endpoints para manipulação de recursos: 

-POST /medicos: Cria um novo registro. 

-GET /medicos/{id}: Obtém detalhes de um registro específico. 

-PUT /medicos/{id}: Atualiza um registro existente. 

-DELETE /medicos/{id}: Exclui um registro existente. 


![Captura de tela 2024-06-26 131110](https://github.com/Cleiton-Pr/API-Rest-Cadastro/assets/109486247/27dca0f6-ba8b-4bd6-b48c-c2d28fa91c58)




*Importando o projeto no IntelliJ e executar uma aplicação Spring Boot pela classe contendo o método main;  

*Criação de classe Controller e mapear uma URL nela utilizando as anotações @RestController e @RequestMapping; 

*Requisição de teste no browser acessando a URL mapeada no Controller. 

*Adicionando novas dependências (Maven) no projeto; 

*Mapeamento de entidade JPA e criar uma interface Repository; 

*Flyway como ferramenta de Migrations do projeto; 

*Validações com Bean Validation utilizando algumas de suas anotações, como a @NotBlank. 

*Utilizar a anotação @GetMapping para mapear métodos em Controllers que produzem dados; 

*Interface Pageable do Spring para realizar consultas com paginação; 

*Paginação e a ordenação dos dados devolvidos pela API com os parâmetros page, size e sort; 

*Configurar o projeto para que os comandos SQL sejam exibidos no console. 


![Captura de tela 2024-06-26 135128](https://github.com/Cleiton-Pr/API-Rest-Cadastro/assets/109486247/4ae4f2e2-a68f-4737-9c41-246425834b53)

