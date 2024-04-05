# Assessement : Desenvolvimento de Serviços Web e Testes com Java
### Professor: Elberth Lins Costa de Moraes

## API de Gerenciamento de Equipamentos de Prevenção e Combate a Incêndio (PCI)
Este projeto é um sistema de inspeção de equipamentos, incluindo extintores e hidrantes. Ele permite a inclusão, exclusão e listagem de usuários, extintores, hidrantes e suas respectivas inspeções.

O sistema permite que os usuários realizem inspeções em extintores e hidrantes. As informações sobre cada inspeção, incluindo a data da inspeção e o status do equipamento.

## Rotas

### ViaCEPController
- **viaCEP/obterPorCEP/{cep}**: Retorna a consulta de CEP com o CEP fornecido.

### UsuarioController
- **usuario/obterLista**: Retorna uma lista de todos os usuários.
- **usuario/incluir**: Cria um novo usuário e retorna uma mensagem de confirmação.
- **usuario/excluir/{id}**: Exclui um usuário com base no ID fornecido e retorna uma mensagem de confirmação.
- **usuario/obterPorId/{id}**: Retorna o usuário com o ID fornecido.

### ExtintorController
- **extintor/obterLista**: Retorna uma lista de todos os extintores.
- **extintor/incluir**: Cria um novo extintor e retorna uma mensagem de confirmação.
- **extintor/excluir/{id}**: Exclui um extintor com base no ID fornecido e retorna uma mensagem de confirmação.
- **extintor/obterPorId/{id}**: Retorna o extintor com o ID fornecido.

### HidranteController
- **hidrante/obterLista**: Retorna uma lista de todos os hidrantes.
- **hidrante/incluir**: Cria um novo hidrante e retorna uma mensagem de confirmação.
- **hidrante/excluir/{id}**: Exclui um hidrante com base no ID fornecido e retorna uma mensagem de confirmação.
- **hidrante/obterPorId/{id}**: Retorna o hidrante com o ID fornecido.

### InspecaoExtintorController
- **inspecaoExtintor/obterLista**: Retorna uma lista de todas as inspeções de extintores.
- **inspecaoExtintor/incluir**: Cria uma nova inspeção de extintor e retorna uma mensagem de confirmação.
- **inspecaoExtintor/excluir/{id}**: Exclui uma inspeção de extintor com base no ID fornecido e retorna uma mensagem de confirmação.
- **inspecaoExtintor/obterPorId/{id}**: Retorna a inspeção de extintor com o ID fornecido.

### InspecaoHidranteController
- **inspecaoHidrante/obterLista**: Retorna uma lista de todas as inspeções de hidrantes.
- **inspecaoHidrante/incluir**: Cria uma nova inspeção de hidrante e retorna uma mensagem de confirmação.
- **inspecaoHidrante/excluir/{id}**: Exclui uma inspeção de hidrante com base no ID fornecido e retorna uma mensagem de confirmação.
- **inspecaoHidrante/obterPorId/{id}**: Retorna a inspeção de hidrante com o ID fornecido.

## Relacionamentos entre Classes

**Equipamento**: Esta é uma classe abstrata que serve como base para outras classes. Ela possui atributos como 'id', 'numeroControleInterno' e 'localizacao'.

**Extintor**: Esta classe estende a classe Equipamento e adiciona seus próprios atributos como 'numeroCilindro', 'numeroSeloInmetro' e 'cargaExtintora'.

**Hidrante**: Esta classe também estende a classe Equipamento e adiciona seus próprios atributos como 'dataDeInstalacao', 'alturaDeFixacao' e 'tipoDeHidrante'.

**InspecaoExtintor**: Esta classe tem um relacionamento com a classe Extintor. Ela representa uma inspeção de um extintor e possui atributos para armazenar os detalhes da inspeção.

**InspecaoHidrante**: Semelhante à InspecaoExtintor, esta classe representa uma inspeção de um hidrante. Ela tem um relacionamento com a classe Hidrante.

**InspecaoUsuario**: Esta classe representa o relacionamento entre um usuário e uma inspeção. Ela tem relacionamentos com as classes Usuario, InspecaoExtintor e InspecaoHidrante.

**Usuario**: Esta classe representa um usuário no sistema. Ela possui atributos como 'nome', 'email', 'logradouro', 'localidade' e 'uf'.

**Controllers**: As classes UsuarioController, ViaCepController, etc. são controladores que lidam com solicitações e respostas HTTP. Eles usam as classes de serviço para realizar operações.
