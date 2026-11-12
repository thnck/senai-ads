// 1
{
    const personagem = {
        nome: "Thomas",
        classe: "Guerreiro",
        nivel: 20,
        vida: 40,
        forca: 100
    };

    console.log(`Nome: ${personagem.nome}`);
    console.log(`Classe: ${personagem.classe}`);
    console.log(`Nível: ${personagem.nivel}`);
    console.log(`Vida: ${personagem.vida}`);
    console.log(`Força: ${personagem.forca}`);
}

// 2
{
    const carro = {
        marca: "Chevrolet",
        modelo: "Vectra",
        ano: 1997,
        cor: "Preto",
        preco: 15000
    };

    console.log(
        `O veículo ${carro.marca} ${carro.modelo}, ano ${carro.ano}, custa R$ ${carro.preco}.`
    );
}

// 3
{
    const produto = {
        nome: "Teclado",
        preco: 120,
        estoque: 15
    };

    produto.preco = 100;
    produto.estoque = 20;
    console.log(produto);
}

// 4
{
    const filme = {
        titulo: "Interestelar",
        ano: 2014
    };

    filme.diretor = "Christopher Nolan";
    filme.genero = "Ficção Científica";
    filme.nota = 8.7;

    console.log(`Título: ${filme.titulo}`);
    console.log(`Ano: ${filme.ano}`);
    console.log(`Diretor: ${filme.diretor}`);
    console.log(`Gênero: ${filme.genero}`);
    console.log(`Nota: ${filme.nota}`);
}

// 5
{
    const animal = {
        nome: "Totó",
        especie: "Golden Retriever",
        idade: 3,
        peso: 35,
        vacinado: true
    };

    if (animal.vacinado) {
        console.log(`${animal.nome} está vacinado.`);
    } else {
        console.log(`${animal.nome} não está vacinado.`);
    }
}

// 6
{
    const aluno = {
        nome: "Mariana",
        nota1: 8,
        nota2: 6
    };
    const media = (aluno.nota1 + aluno.nota2) / 2;

    console.log(`Média de ${aluno.nome}: ${media}`);
    if (media >= 7) {
        console.log(`${aluno.nome} foi aprovada.`);
    } else {
        console.log(`${aluno.nome} foi reprovada.`);
    }
}

// 7
{
    const produto = {
        nome: "Monitor",
        preco: 900,
        desconto: 15
    };
    const valorDesconto = produto.preco * (produto.desconto / 100);
    const precoFinal = produto.preco - valorDesconto;

    console.log(`Valor do desconto: R$ ${valorDesconto.toFixed(2)}`);
    console.log(`Preço final: R$ ${precoFinal.toFixed(2)}`);
}

// 8
{
    const personagem = {
        nome: "Guerreiro",
        vida: 100,
        ataque: 25,
        defesa: 10
    };
    const danoRecebido = 30;
    const danoEfetivo = Math.max(0, danoRecebido - personagem.defesa);

    personagem.vida -= danoEfetivo;
    console.log(`${personagem.nome} ficou com ${personagem.vida} pontos de vida.`);
}

// 9
{
    const conta = {
        titular: "Ana",
        saldo: 1500,
        valorSaque: 200
    };

    if (conta.saldo >= conta.valorSaque) {
        conta.saldo -= conta.valorSaque;
        console.log(`Saque realizado. Saldo restante: R$ ${conta.saldo.toFixed(2)}`);
    } else {
        console.log("Saldo insuficiente para realizar o saque.");
    }
}

// 10
{
    const atleta = {
        nome: "Carlos",
        idade: 19,
        altura: 1.85,
        pontos: 120
    };
    let classificacao;

    if (atleta.pontos < 50) {
        classificacao = "Iniciante";
    } else if (atleta.pontos <= 99) {
        classificacao = "Intermediário";
    } else {
        classificacao = "Avançado";
    }

    console.log(`${atleta.nome} é um atleta ${classificacao}.`);
}

// 11
{
    const alunos = [
        { nome: "Ana", idade: 17 },
        { nome: "Bruno", idade: 18 },
        { nome: "Carlos", idade: 16 },
        { nome: "Daniela", idade: 19 }
    ];

    for (let i = 0; i < alunos.length; i++) {
        console.log(`${alunos[i].nome}, ${alunos[i].idade} anos`);
    }
}

// 12
{
    const alunos = [
        { nome: "Ana", nota: 8 },
        { nome: "Bruno", nota: 5 },
        { nome: "Carlos", nota: 9 },
        { nome: "Daniela", nota: 7 },
        { nome: "Eduardo", nota: 4 }
    ];
    let aprovados = 0;

    for (let i = 0; i < alunos.length; i++) {
        if (alunos[i].nota >= 7) {
            aprovados++;
        }
    }

    console.log(`Quantidade de alunos aprovados: ${aprovados}`);
}

// 13
{
    const produtos = [
        { nome: "Mouse", preco: 50, quantidade: 10 },
        { nome: "Teclado", preco: 120, quantidade: 5 },
        { nome: "Monitor", preco: 900, quantidade: 3 }
    ];
    let valorTotal = 0;

    for (let i = 0; i < produtos.length; i++) {
        valorTotal += produtos[i].preco * produtos[i].quantidade;
    }

    console.log(`Valor total do estoque: R$ ${valorTotal.toFixed(2)}`);
}

// 14
{
    const jogadores = [
        { nome: "Lucas", pontos: 150 },
        { nome: "Mariana", pontos: 230 },
        { nome: "Carlos", pontos: 180 },
        { nome: "Ana", pontos: 310 }
    ];
    let maiorPontuacao = jogadores[0];

    for (let i = 1; i < jogadores.length; i++) {
        if (jogadores[i].pontos > maiorPontuacao.pontos) {
            maiorPontuacao = jogadores[i];
        }
    }

    console.log(
        `O jogador com maior pontuação é ${maiorPontuacao.nome}, com ${maiorPontuacao.pontos} pontos.`
    );
}
