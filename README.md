# Sistema de Gerenciamento de Estoque para Hamburgueria

![Badge de Licença](https://img.shields.io/badge/licença-MIT-blue.svg)

Este projeto é um sistema de gerenciamento de estoque desenvolvido para uma hamburgueria, proporcionando uma interface intuitiva e eficiente para o administrador. O sistema foi construído utilizando NetBeans com JFrame, e integra-se a um banco de dados para realizar operações CRUD (Criar, Ler, Atualizar e Deletar).

## Índice

- [Sobre](#sobre)
- [Instalação](#instalação)
- [Como Usar](#como-usar)
- [Funcionalidades](#funcionalidades)
- [Tecnologias](#tecnologias)
- [Contribuindo](#contribuindo)
- [Licença](#licença)
- [Contato](#contato)

## Sobre

Este projeto foi desenvolvido como parte dos requisitos da disciplina [Projeto Integrador]. Ele teve como objetivo principal desenvolver um sistema de gerenciamento de estoque voltado para uma hamburgueria, proporcionando funcionalidades essenciais como visualização e cadastro de produtos, acompanhamento de pedidos e controle de estoque. O objetivo final foi otimizar os processos internos e melhorar a eficiência operacional da hamburgueria.

O escopo do projeto abrangeu o desenvolvimento completo do sistema de gerenciamento de estoque, incluindo a interface do administrador e a integração com o banco de dados. O sistema impõe restrições ao administrador, como o impedimento de cadastrar produtos sem os devidos campos preenchidos e a impossibilidade de procurar por um ID de produto inexistente. Aspectos como a interface do cliente e a integração com sistemas de pagamento foram excluídos deste escopo.

Este repositório também inclui o diagrama DER, o diagrama de classes e todo o escopo do projeto.

## Instalação

Para configurar e rodar o projeto localmente, siga os passos abaixo:

1. Clone o repositório:
    ```bash
    git clone https://github.com/seu-usuario/seu-repositorio.git
    ```

2. Entre no diretório do projeto:
    ```bash
    cd seu-repositorio
    ```

3. Abra o projeto no NetBeans.

4. Configure a conexão com o banco de dados no arquivo de configuração apropriado.

5. Compile e execute o projeto diretamente pelo NetBeans.

## Como Usar

Após instalar e configurar o projeto, siga os passos abaixo para usar o sistema:

1. Inicie a aplicação no NetBeans.

2. Acesse a interface do administrador.

3. Utilize as funcionalidades do sistema para gerenciar o estoque, cadastrar novos produtos, acompanhar pedidos e controlar o estoque.

## Funcionalidades

- [x] **Cadastro de Produtos**: Permite o cadastro de novos produtos com todos os campos obrigatórios preenchidos.
- [x] **Visualização de Produtos**: Exibe uma lista de todos os produtos cadastrados no sistema.
- [x] **Acompanhamento de Pedidos**: Permite acompanhar o status e detalhes dos pedidos.
- [x] **Controle de Estoque**: Facilita o controle de quantidades de produtos no estoque.
- [x] **Restrições Administrativas**: Implementa validações para garantir a integridade dos dados (e.g., impedir cadastro de produtos sem campos obrigatórios preenchidos).

## Tecnologias

As principais tecnologias e ferramentas utilizadas neste projeto foram:

- [Java](https://www.oracle.com/java/)
- [NetBeans](https://netbeans.apache.org/)
- [JFrame](https://docs.oracle.com/javase/tutorial/uiswing/components/frame.html)
- [MySQL](https://www.mysql.com/)

## Contribuindo

Contribuições são bem-vindas! Siga os passos abaixo para contribuir:

1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/sua-feature`).
3. Commit suas mudanças (`git commit -m 'Adiciona uma nova feature'`).
4. Push para a branch (`git push origin feature/sua-feature`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## Contato

Pedro Zardetti - pedrozardetti1@gmail.com

Link do Projeto: [https://github.com/seu-usuario/seu-repositorio](https://github.com/pedrozardetti/ProjetoHamburgueria)
