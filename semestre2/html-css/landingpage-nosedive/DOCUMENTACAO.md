# Documentacao do projeto Nosedive

## 1. Identificacao do projeto

**Nome:** Nosedive - Numa busca por validação social
**Autor:** Thomas Alves
**Unidades curriculares:** Linguagem de Marcacao e Projetos de Software  
**Tecnologias:** HTML5 e CSS3  
**Tipo de produto:** Landing Page responsiva de carater informativo e reflexivo

## 2. Objetivo do projeto

Este projeto nasceu após a experiência de assistir o episódio **Nosedive**, da terceira temporada de *Black Mirror*, e perceber o quanto aquela realidade se aproxima de algumas situacoes que ja vivemos. A proposta foi criar uma Landing Page que nao apenas resumisse o episódio, mas que ajudasse o leitor a pensar sobre a necessidade de ser aprovado o tempo todo e sobre o peso que uma reputacao digital pode ter.

Para isso, a pagina foi organizada de forma simples e direta. O leitor conhece primeiro a personagem e o contexto da historia e, depois, acompanha as respostas para as principais questoes da atividade. A identidade visual escura foi escolhida para combinar com o clima de desconforto e critica social presente no episódio.

## 3. Publico-alvo

A pagina foi pensada principalmente para estudantes e professores das unidades curriculares envolvidas, mas o assunto tambem pode interessar a qualquer pessoa que use redes sociais e ja tenha refletido sobre a propria imagem na internet.

O conteudo nao parte do pressuposto de que o leitor conhece o episódio. Por isso, a apresentacao de Lacie e do sistema de notas aparece antes das reflexoes. Dessa forma, mesmo quem nunca assistiu a *Nosedive* consegue entender o problema discutido.

## 4. Escopo da Landing Page

O escopo foi definido para manter o projeto viavel dentro da proposta da atividade. A pagina tem funcao informativa e reflexiva; ela nao pretende simular uma rede social real.

### O que a pagina apresenta

- Apresentacao do tema e da personagem Lacie Pound;
- Explicacao do funcionamento do sistema de notas;
- Analise da influencia da nota sobre o comportamento;
- Reflexao sobre comportamentos artificiais e busca por perfeicao;
- Relacao entre a distopia do episódio e as redes sociais atuais;
- Navegacao interna por secoes;
- Uso de imagens relacionadas ao episódio.

## 5. Analise critica do episódio

O episódio mostra uma sociedade em que quase toda interacao pode virar uma avaliacao. O que mais chama a atencao nao e apenas a existencia das estrelas, mas o fato de elas passarem a definir o valor social de cada pessoa. A historia de Lacie mostra como essa busca por uma nota melhor pode ocupar espaco demais na vida de alguem.

### Como funciona o sistema de notas?

No universo de *Nosedive*, as pessoas avaliam umas as outras por meio de seus dispositivos digitais. As notas vao de 1 a 5 estrelas e ficam visiveis para todos. O problema e que essa pontuacao nao fica apenas no ambiente virtual: ela influencia moradias, transportes, servicos, oportunidades de trabalho e relacionamentos. Uma simples avaliacao, portanto, deixa de ser uma opiniao isolada e passa a funcionar como uma forma de controle social.

### Um comportamento pode mudar de acordo com a nota?

Sim. O medo de perder pontos faz com que as pessoas pensem duas vezes antes de falar ou demonstrar o que realmente sentem. Lacie tenta ser gentil, sorrir e agir de acordo com o comportamento esperado porque acredita que isso vai melhorar sua pontuacao e sua posicao social. Quando sua nota cai, o tratamento que recebe muda rapidamente. Isso deixa claro que o sistema influencia tanto as escolhas da propria pessoa quanto a forma como ela e vista pelos outros.

### O sistema gera comportamentos falsos ou artificiais?

Sim. A necessidade de manter uma nota alta incentiva sorrisos ensaiados, elogios exagerados e relacionamentos que muitas vezes existem por interesse. As pessoas escondem sentimentos reais para apresentar uma versao mais aceitavel de si mesmas. O episódio mostra que, quando a aparencia vale mais do que a autenticidade, conviver deixa de ser algo espontaneo e se transforma em uma performance constante.

### Essa realidade possui relacao com o mundo atual e com as redes sociais?

Essa realidade tem relacao com o presente porque as redes sociais tambem estimulam a exposicao da vida, a comparacao e a busca por aprovacao em curtidas, comentarios e seguidores. As plataformas atuais nao controlam moradia ou transporte exatamente como no episódio, mas uma postagem, uma opiniao ou uma imagem podem afetar relacionamentos, oportunidades de trabalho e a forma como alguem e julgado. A aproximacao mais forte esta na pressao para parecer feliz, bem-sucedido e interessante o tempo inteiro, mesmo quando essa imagem nao corresponde ao que a pessoa realmente esta vivendo.

## 6. Requisitos do sistema

### Requisitos funcionais

| ID | Requisito | Situacao na versao atual |
|---|---|---|
| RF01 | Exibir o titulo e o tema da pagina | Atendido |
| RF02 | Permitir navegacao para Inicio, Sobre, Distopia e Contatos | Atendido por links internos |
| RF03 | Apresentar imagens com texto alternativo | Atendido nas imagens existentes |
| RF04 | Apresentar as quatro questoes obrigatorias da analise | Atendido |
| RF05 | Organizar o conteudo em secoes legiveis | Atendido |

### Requisitos nao funcionais

| ID | Requisito | Situacao na versao atual |
|---|---|---|
| RNF01 | Utilizar HTML5 semantico | Parcialmente atendido; usa `nav`, `header`, `main`, `section` e `footer` |
| RNF02 | Manter o CSS em arquivo externo | Atendido em `style.css` |
| RNF03 | Usar Flexbox e Box Model | Atendido no menu, no corpo e nos cards |
| RNF04 | Usar CSS Grid | Ainda nao utilizado; recomendado para a organizacao de cards |
| RNF05 | Possuir legibilidade e identidade visual coerente | Atendido parcialmente |
| RNF06 | Funcionar em telas menores | Necessita media queries e novos testes responsivos |
| RNF07 | Manter organizacao de arquivos | Atendido para a estrutura atual |

## 7. Estrutura atual de arquivos

```text
landingpage-nosedive/
|-- index.html          # Estrutura e conteudo da Landing Page
|-- style.css           # Regras de apresentacao visual
|-- src/
    |-- eyes.png        # Imagem do olhar utilizada no cabecalho
    |-- lacie.jpg       # Imagem da personagem
```

A pagina tambem utiliza uma imagem hospedada externamente em uma URL do WordPress. Para reduzir o risco de a imagem deixar de carregar, recomenda-se baixar uma versao autorizada para `src/` e referenciar o arquivo localmente.

## 8. Estrutura das secoes da pagina

1. **Navegacao:** links internos para as principais partes da pagina.
2. **Cabecalho/hero:** titulo, subtitulo e imagem de abertura.
3. **Sobre:** apresentacao de Lacie Pound e do contexto do episódio.
4. **Sistema de notas:** explicacao da escala de avaliacao e de seus efeitos.
5. **Mudanca de comportamento:** analise da influencia da pontuacao nas atitudes.
6. **Comportamentos artificiais:** reflexao sobre aparencia, performance e falsidade.
7. **Distopia e atualidade:** comparacao entre o episódio e as redes sociais.
8. **Contatos:** identificacao do autor no rodape.

## 9. Planejamento de desenvolvimento

O desenvolvimento foi pensado em etapas para que o conteudo viesse antes da parte visual. Primeiro foi necessario compreender o episódio e selecionar as reflexoes principais. Depois, a estrutura da pagina foi organizada e, somente entao, foram definidos os estilos e as imagens. Essa ordem ajudou a evitar uma pagina visualmente chamativa, mas sem uma mensagem clara.

| Etapa | Atividade | Resultado esperado |
|---|---|---|
| 1 | Interpretacao do episódio e levantamento das questoes | Conteudo critico autoral |
| 2 | Definicao do publico, escopo e estrutura | Planejamento do projeto |
| 3 | Criacao da estrutura HTML5 | Pagina semanticamente organizada |
| 4 | Criacao da identidade visual em CSS | Layout escuro, legivel e coerente |
| 5 | Insercao de imagens e navegacao interna | Experiencia de navegacao funcional |
| 6 | Revisao de requisitos e responsividade | Correcao de problemas de estrutura e visual |
| 7 | Documentacao e apresentacao | Entrega tecnica final |

## 10. Recursos de software utilizados

- Visual Studio Code para edicao dos arquivos;
- HTML5 para estrutura semantica e conteudo;
- CSS3 para cores, tipografia, espacamento, Box Model e Flexbox;
- Navegador web para testes visuais e de navegacao;
- Imagens armazenadas na pasta `src/` e uma imagem referenciada por URL externa.

## 11. Documentacao tecnica resumida

O arquivo `index.html` define a estrutura principal da aplicacao. O documento possui `doctype`, idioma configurado para portugues, meta charset, meta viewport e referencia ao arquivo externo `style.css`.

A navegacao utiliza links com ancora, como `#inicio`, `#sobre`, `#distopia` e `#contatos`. O conteudo principal e separado em secoes, e as imagens possuem atributo `alt`, contribuindo para acessibilidade basica.

O arquivo `style.css` aplica o Box Model global com `box-sizing: border-box`, organiza o menu com Flexbox, centraliza o conteudo principal e cria cards com `display: flex` e `flex-direction: column`. A paleta utiliza preto, cinza e branco para reforcar a atmosfera distopica.

Para concluir a adequacao tecnica ao enunciado, a proxima revisao deve incluir:

- uma secao com lista ou tabela sobre os impactos do sistema;
- um formulario com `label`, `input`, `textarea`, `required` e tipos adequados;
- um link externo confiavel relacionado ao episódio ou a reputacao digital;
- media queries para telas pequenas;
- uso de CSS Grid em uma area de cards ou impactos;
- revisao de semantica, contraste, tamanho das imagens e carregamento da imagem externa.

## 12. Validacao e revisao

A revisao da versao atual deve verificar:

- se todos os links do menu levam a secoes existentes;
- se as imagens carregam e possuem textos alternativos coerentes;
- se o texto continua legivel em diferentes larguras de tela;
- se nao existem elementos estourando horizontalmente;
- se a estrutura HTML passa por um validador HTML;
- se o CSS permanece separado e organizado;
- se os requisitos pendentes desta documentacao foram implementados antes da entrega final.

## 13. Conclusao

Desenvolver esta pagina foi uma forma de relacionar um episódio de ficcao com uma questao bastante presente no cotidiano. Ao transformar a historia de Lacie em conteudo para a web, foi possivel perceber que a critica de *Nosedive* nao esta apenas na tecnologia, mas na maneira como as pessoas passam a agir quando acreditam que estao sendo observadas e avaliadas o tempo todo.

Na parte tecnica, o projeto permitiu praticar HTML5, CSS3, navegacao por ancora, imagens, tipografia, Flexbox e Box Model. A pagina ja apresenta a estrutura principal e o conteudo critico, mas ainda precisa receber alguns aprimoramentos para atender completamente a atividade: formulario, lista ou tabela, link externo, CSS Grid e ajustes de responsividade. Essas melhorias fazem parte da etapa final de revisao e representam a continuidade natural do desenvolvimento.
