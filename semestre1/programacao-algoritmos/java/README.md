# ☕ Exercicios em Java

Esta pasta reúne exercícios de lógica e programação desenvolvidos durante o primeiro semestre.

## 🛠️ Requisitos

- JDK instalado e configurado no `PATH`;
- uma IDE Java, como IntelliJ IDEA, Eclipse ou VS Code com o Extension Pack for Java.

Confira a instalação no terminal:

```bash
java -version
javac -version
```

## ▶️ Como executar pela IDE

1. Abra no editor a pasta do projeto desejado, por exemplo `lista03/prjLista03`.
2. Marque a pasta `src` como origem dos arquivos, se a IDE solicitar.
3. Abra a classe do exercício dentro de `src`.
4. Execute o método `main` pelo botão de execução da IDE.

Cada subpasta representa um conjunto de exercícios independente. Os programas normalmente ficam em pacotes como `pctEx01`, `ex01` ou `pctString`.

## 💻 Como executar pelo terminal

Entre na pasta do projeto e compile os arquivos Java para uma pasta temporária:

```powershell
cd .\lista03\prjLista03
New-Item -ItemType Directory -Force out
javac -d out (Get-ChildItem -Recurse -Filter *.java | ForEach-Object FullName)
```

Depois execute a classe principal, informando o pacote e o nome da classe. Por exemplo:

```powershell
java -cp out pctEx01.Ex01
```

O nome da classe pode ser conferido na declaração `package` e no nome do arquivo `.java`. Alguns projetos possuem mais de um exercício, então compile e execute somente a classe desejada.

## 📁 Pastas

- `exerciciosCase`: exercícios com estrutura `case`;
- `exerciciosEmJavaEmerson`: exercícios básicos de operações e cálculos;
- `exerciciosEstrutura`: exercícios de estruturas de decisão;
- `Lista-Aula10`: exercícios com strings;
- `lista03`, `lista04` e `lista05`: listas de exercícios em Java.