# ⚙️ Backend 1

Reúne os exercícios de Java desenvolvidos no segundo semestre, com foco em revisão de programação e Programação Orientada a Objetos.

## 🛠️ Requisitos

- JDK instalado e configurado no `PATH`;
- IntelliJ IDEA, Eclipse ou VS Code com suporte a Java.

Verifique o ambiente:

```bash
java -version
javac -version
```

## ▶️ Como executar

1. Abra no editor a pasta do projeto desejado:
   - `POO-SENAI`: projetos de orientação a objetos;
   - `revisaoBackEnd/prjRevisaoBackend`: exercícios de estruturas de repetição e controle.
2. Aguarde a IDE reconhecer a pasta `src` como origem do código.
3. Abra uma classe que contenha `public static void main(String[] args)`.
4. Execute a classe pelo botão de execução da IDE.

### 🧩 POO-SENAI

Os projetos são independentes. Entre em uma pasta, como `prjPokemon`, `prjNinja`, `prjNaruto`, `prjBanco`, `prjEmpresa` ou uma pasta de `lista02-poo`, e execute sua classe principal. No projeto bancário, a classe principal é `Agencia.MenuApp`.

### 💻 RevisaoBackEnd pelo terminal

Na pasta `revisaoBackEnd/prjRevisaoBackend`, compile e execute a classe escolhida:

```powershell
cd .\revisaoBackEnd\prjRevisaoBackend
New-Item -ItemType Directory -Force out
javac -d out (Get-ChildItem -Recurse -Filter *.java | ForEach-Object FullName)
java -cp out pctEx01.Ex01
```

Troque `pctEx01.Ex01` pelo pacote e pela classe que deseja executar, como `pctFor01.For01` ou `pctWhile01.While01`.