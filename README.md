# Cadastro de Usuários

Projeto backend para gerenciamento de cadastro de usuários, desenvolvido em Java com Spring Boot e Maven.

## Sobre o Projeto

Este projeto tem como objetivo fornecer uma API para cadastro, consulta, atualização e remoção de usuários. É uma base para aplicações que necessitam de controle de usuários, podendo ser expandida conforme a necessidade.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Maven

## Estrutura do Projeto

```
cadastro-usuarios/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
├── .mvn/
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml

```
## Como Executar

1. **Clone o repositório:**
git clone https://github.com/RafaSoldatelli/cadastro-usuarios.git
cd cadastro-usuarios

2. **Compile e execute o projeto:**
./mvnw spring-boot:run ou, se estiver no Windows:mvnw.cmd spring-boot:run

3. **Acesse a API:**
- Por padrão, a aplicação estará disponível em: `http://localhost:8080`

## Funcionalidades

- Cadastro de novos usuários
- Listagem de usuários cadastrados
- Atualização de dados de usuários
- Remoção de usuários

## Como Contribuir

1. Faça um fork do projeto
2. Crie uma branch para sua feature/fix (`git checkout -b minha-feature`)
3. Commit suas alterações (`git commit -am 'Minha nova feature'`)
4. Faça push para a branch (`git push origin minha-feature`)
5. Abra um Pull Request

## Licença

Este projeto está sob a licença MIT.

---

> Projeto desenvolvido por [RafaSoldatelli](https://github.com/RafaSoldatelli)
