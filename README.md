# Jogo da Forca

O **Jogo da Forca** é uma aplicação simples em Java onde o jogador tenta adivinhar uma palavra secreta, letra por letra. Este jogo clássico é ideal para treinar lógica e praticar programação com strings e loops.

## Como Funciona

1. O programa escolhe uma palavra secreta (fixa ou aleatória de uma lista).
2. O jogador tenta adivinhar a palavra fornecendo uma letra por vez.
3. Após cada tentativa:
   - Se a letra estiver na palavra, ela é revelada.
   - Se a letra não estiver, o jogador perde uma vida.
4. O jogo termina quando:
   - O jogador adivinha a palavra inteira.
   - O jogador perde todas as vidas disponíveis.

## Funcionalidades

- Escolha aleatória da palavra secreta.
- Interface baseada em terminal.
- Controle de vidas para limitar o número de erros.
- Exibição do progresso da palavra e letras já tentadas.

## Pré-requisitos

Para executar o jogo, você precisa de:

- [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) (versão 8 ou superior).
- Um editor ou IDE, como:
  - [IntelliJ IDEA](https://www.jetbrains.com/idea/)
  - [Eclipse](https://www.eclipse.org/downloads/)
  - [VS Code](https://code.visualstudio.com/).

## Como Jogar

1. **Clone o repositório ou copie o código fonte:**

   ```bash
   git clone https://github.com/seu-usuario/jogo-da-forca.git
   cd jogo-da-forca
