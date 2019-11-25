# SimpleCalc - Compilador para uma simples gramática aritmética
Exemplo desenvolvido por @renanalencar.<br/>
Tome este projeto como base para desenvolver o projeto final da disciplina de Compiladores.
Para o desenvolvimento do projeto do compilador para Mini Pascal basta criar o arquivo **MiniPascal.g4** e modificar alguns arquivos dentro deste projeto.

## Pre-requisitos:
- [Java Developement Toolkit (JDK)](https://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)
- [Visual Studio Code](https://code.visualstudio.com/download)
- Extensão "Java Extension Pack" (`CTRL + Shift + X` dentro do VSCode)
- Extensão "AntLR" (`CTRL + Shift + X` dentro do VSCode)

## Preparação do ambiente de desenvolvimento:
1. [Instale o Visual Code Studio](https://www.devmedia.com.br/introducao-ao-visual-studio-code/34418)
2. [Instale a extensão "Java Extension Packet"](https://translate.google.com/translate?source=osdd&sl=auto&tl=pt&u=https%3A%2F%2Fcode.visualstudio.com%2Fdocs%2Fjava%2Fjava-tutorial)
3. [Configure o JDK no Visual Code Studio](https://translate.googleusercontent.com/translate_c?depth=1&rurl=translate.google.com&sl=auto&source=osdd&sp=nmt4&tl=pt-BR&u=https://code.visualstudio.com/docs/getstarted/settings&xid=17259,15700021,15700186,15700191,15700256,15700259,15700262,15700265,15700271,15700283&usg=ALkJrhgY32DQiSPUrAbbeW6gXFbg6R1zQg)
4. Instale a extensão "AntLR"
5. Baixe este projeto e descompacte no seu computador.
6. Abra o projeto descompactado no VSCode

### Observação:
Você pode pular as etapas acima (de 1 ao 4) seguindo este vídeo - [Visual Studio Code: Instalador para Java](https://www.youtube.com/watch?v=vim1bTa-Bkc)

## Estrutura do Projeto:
```
.
+-- .classpath
+-- .project
+-- input.txt
+-- README.MD
+-- .settings
|   +-- org.eclipse.jdt.core.prefs
+-- .vscode
|   +-- launch.json
|   +-- settings.json
|   +-- tasks.json
+-- bin
+-- lib
|   +-- antlr-4.6-complete.jar
+-- src
|   +-- .antlr
|   +-- SimpleCalc.g4
|   +-- app
|   |   +-- App.java
|   +-- grammar
|   |   +-- imports
|   |   +-- SimpleCalc.tokens
|   |   +-- SimpleCalcBaseVisitor.java
|   |   +-- SimpleCalcLexer.java
|   |   +-- SimpleCalcLexer.tokens
|   |   +-- SimpleCalcParser.java
|   |   +-- SimpleCalcVisitor.java
```

## Arquivos a serem modificados:
1. ".classpath"
2. "launch.json"
3. "settings.json"
4. "SimpleCalc.g4"
5. "App.java"

## Como executar o compilador para a gramática SimpleCalc
1. Abra o arquivo "App.java"
2. Clique no menu superior "Debug" e, logo em seguida, clique em "Start Debugging"
3. Aparecerá uma caixa informando que há alguns erros na compilação. Ignore esta informação clicando em "Proceed"
4. Por fim, aparecerá uma janela com a árvore sintática desenhada e outra apresentada no terminal.

## Outros links para consulta e leitura:
- [ANTLR 4 Documentation](https://github.com/antlr/antlr4/blob/master/doc/index.md)
- [Download ANTLR](https://www.antlr.org/download/antlr-4.7.2-complete.jar)
- [E-Book **The Definitive ANTLR 4 Reference** - PDF File](https://drive.google.com/file/d/145AAhm0LTNU1cvQEA3faeIUfWKlNW4Oa/view?usp=sharing)
- [**Source Code** for The Definitive ANTLR 4 Reference](http://media.pragprog.com/titles/tpantlr2/code/tpantlr2-code.zip)

