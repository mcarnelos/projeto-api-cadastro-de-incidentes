# Api para cadastro de incidentes
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/mcarnelos/projeto-api-cadastro-de-incidentes/blob/master/LICENSE) 

# Sobre o projeto

Trata-se de uma api para cadastro de incidentes que fornece operações REST que possibilitam o cadastro, manutenção e remoção de incidentes.

## Features
- Cadastro de Incidentes com verbo POST /incidents
- Busca de Incidentes com verbo GET /incidents
- Busca de Incidentes por id com verbo GET /incidents/id
- Update de Incidentes por id com verbo PUT /incidents/id
- Deletar Incidentes por id com verbo DELETE /incidents/id

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Banco de dados
- H2

# Como executar o projeto

## Pré-requisitos
Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:

- IDE para desenvolvimento JAVA como Spring Tool Suite 4 ou IntelliJ IDEA
- Gerenciador de dependências Maven
- Postman para testar os verbos HTTP

## Back end

```bash
# clonar repositório
git clone https://github.com/mcarnelos/projeto-api-cadastro-de-incidentes

# Importe o projeto na sua IDE

# Aguarde a sincronização das dependências do Maven

# Execute a aplicação (está no profile test)

# Caso queira alterar o seed do banco de dados altere os dados no arquivo resources/import.sql

# O servidor inciará na porta:8080 abra o Postman e execute os verbos HTTP na url <http://localhost:8080/clients>

# Faça os testes no banco de dados H2 na url <http://localhost:8080/h2-console>
```

# Autor

Murilo Carnelós

https://www.linkedin.com/in/murilo-carnel%C3%B3s/
