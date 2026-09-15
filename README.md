# Terminal Mystery Doors

Projeto prático desenvolvido para a disciplina de Programação Orientada a Objetos (POO). A aplicação consiste em um jogo interativo via terminal baseado em tomada de decisões, onde o jogador deve escolher entre diferentes portas misteriosas a cada rodada.

## Sobre o Jogo

O objetivo é sobreviver ou alcançar a maior pontuação possível enfrentando eventos imprevisíveis. A cada rodada, o jogador é apresentado a um conjunto de portas, e a escolha tomada aciona um evento gerado aleatoriamente, que pode conter:

- Encontros com armadilhas ou monstros (combate ou perda de recursos).
- Descoberta de itens, poções ou tesouros (recuperação de vida ou bônus).
- Eventos neutros ou enigmas com ramificações diretas na progressão.

## Objetivos e Conceitos de POO Aplicados

A arquitetura do projeto foi pensada para demonstrar a aplicação prática dos quatro pilares da Programação Orientada a Objetos:

- **Abstração:** Modelagem das entidades principais do sistema, como jogador, portas e eventos.
- **Encapsulamento:** Controle de acesso aos atributos de estado (vida, inventário, histórico de decisões) via métodos específicos.
- **Herança e Polimorfismo:** Implementação de uma classe ou interface base para os eventos (`Evento`), permitindo que tipos específicos de consequências (`Combate`, `Recompensa`, `Armadilha`) sejam processados dinamicamente com comportamentos próprios a cada escolha.

## Funcionalidades Principais

- Navegação textual interativa via terminal.
- Sorteio determinístico/pseudoaleatório de consequências e distribuição de portas.
- Sistema de status do jogador (pontuação, inventário e vida).
- Fim de jogo por derrota (pontos de vida zerados) ou vitória após atingir a meta de rodadas.

## Como Executar

Clone o repositório:

git clone git@github.com:SEU_USUARIO/NOME_DO_REPOSITORIO.git
cd NOME_DO_REPOSITORIO

*(Adicionar aqui os comandos de compilação/execução de acordo com o ambiente do projeto)*

## Integrantes do Grupo


Integrantes do Grupo

    Vinícius de Mattos Guerra -- RA: 2601861
    Gabriel Tobias Mazzola Bega da Rocha -- RA: 2608315
    Enzo Sodré -- RA: 2607152
    Enzo Dias -- RA: 2611395
    Marcos Paulo Silva Zarpelon -- RA: 2604395
    Cauã -- RA:
    Guilherme Rubim -- RA: 2603698
    Gustavo -- RA:
