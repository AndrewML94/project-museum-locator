# Projeto Museum Locator (Trigésimo primeiro projeto desenvolvido)

Neste projeto implementei uma API cuja principal funcionalidade é facilitar a busca por museus baseada em sua localização. Os dados foram retirados _(desta)[http://dados.cultura.gov.br/dataset/series-historicas-cadastro-nacional-de-museus]_ série histórica.

## Habilidades desenvolvidas

- Criar classes de controle e suas rotas;
- Criar classes de serviço;
- Utilizar injeção de dependências;
- Trabalhar com exceções customizadas;
- Tratar exceções da API através de gerenciadores de erros;
- Implementar testes unitários para cobertura de código;
- Criar uma configuração Docker para sua aplicação.

## O que foi desenvolvido pelo autor

Todo o conteúdo e elementos presentes na pasta "src/main" foram desenvolvidos exclusivamente por mim, representando minha contribuição integral a este projeto. É importante mencionar que os demais arquivos foram elaborados pela equipe da Trybe como parte do contexto mais amplo do projeto.

## Requisitos do projeto

1. Criar as classes de Modelo e DTO;
2. Habilitar o Spring Boot Actuator;
3. Implementar o método createMuseum da camada de serviço;
4. Implementar o método getClosestMuseum da camada de serviço;
5. Criar classe controller para /museums com rota POST;
6. Criar rota GET /museums/closest;
7. Criar um ControllerAdvice para tratar erros;
8. Criar um Dockerfile para sua aplicação.