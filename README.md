Aqui está um README mais simples para o seu projeto:

---

# OdontoGuardJA

Este é um projeto de aplicação MVC desenvolvido para a **OdontoPrev**, focado no gerenciamento odontológico, utilizando **Spring Boot**, **Thymeleaf**, **Spring Security**, e integração com **RabbitMQ** para mensagens assíncronas.

## Funcionalidades

* Cadastro e gerenciamento de pacientes.
* Login com segurança usando **Spring Security**.
* Interface em **Thymeleaf** para interação com o usuário.
* Sistema de roles (ADMIN e USER) para controlar o acesso a diferentes funcionalidades.
* Comunicação com **RabbitMQ** para envio de mensagens.

## Tecnologias Utilizadas

* **Spring Boot 3.4.3**
* **Spring Security** (Para autenticação e autorização)
* **Spring Data JPA** (Para interação com o banco de dados)
* **Thymeleaf** (Para renderização de templates)
* **RabbitMQ** (Para comunicação assíncrona)
* **Oracle JDBC** (Para conexão com o banco de dados Oracle)
* **BCryptPasswordEncoder** (Para codificação de senhas)

## Como Rodar o Projeto

### 1. Clonar o repositório

```bash
git clone https://github.com/usuario/odontoGuardJA.git
cd odontoGuardJA
```

### 2. Executar com Maven

Certifique-se de que você tenha o [Maven](https://maven.apache.org/) instalado. Depois, execute o comando abaixo para rodar a aplicação:

```bash
mvn spring-boot:run
```

A aplicação será iniciada na porta `8080`. Abra o navegador e acesse:

```
http://localhost:8080
```

### 3. Acessar o Sistema

Use as credenciais abaixo para login:

* **Admin**

  * Usuário: `admin`
  * Senha: `admin`
  * Role: `ADMIN`
* **Usuário Comum**

  * Usuário: `user`
  * Senha: `user`
  * Role: `USER`

## Configuração do Banco de Dados

* A aplicação está configurada para utilizar um banco de dados **Oracle**. O driver JDBC necessário (`ojdbc11`) já está incluso no projeto.

## Contribuições

Sinta-se à vontade para fazer um fork do projeto e enviar pull requests. Para sugestões ou correções, abra uma issue!

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
