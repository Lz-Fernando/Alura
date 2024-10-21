//Exercício 1) Implementando tratamento de dados

document.querySelector('.botao-publicar').addEventListener('click', async (event) => {
    event.preventDefault(); // Previne o envio padrão do formulário

    const nomeProjeto = document.getElementById('nome').value;
    const descricaoProjeto = document.getElementById('descricao').value;

    const tagsList = document.getElementById('tagsList');
    const tagsProjeto = Array.from(tagsList.querySelectorAll('p')).map(tag => tag.textContent);

    function validarFormulario(nome, descricao, tags) {
        if (!nome || !descricao) {
            throw new Error('Por favor, preencha todos os campos obrigatórios (nome e descrição).');
        }
        if (tags.length === 0) {
            throw new Error('Adicione pelo menos uma tag ao projeto.');
        }
    }

    try {
        validarFormulario(nomeProjeto, descricaoProjeto, tagsProjeto);
    
        const result = await publicarProjeto(nomeProjeto, descricaoProjeto, tagsProjeto);
        console.log(result);
        alert('Projeto publicado com sucesso!');
    } catch (error) {
        console.error('Erro ao publicar projeto:', error);
        alert('Erro ao publicar projeto: ' + error.message);
    }
});

//Exercício 2) Formulário de busca

const busca = event.target.value.trim().toLowerCase();
const projetos = document.querySelectorAll('.projeto');

try {
    projetos.forEach(projeto => {
        // Iteração pelos projetos e suas tags
        const tags = projeto.querySelectorAll('.tag');
        let mostrar = false;

        tags.forEach(tag => {
            if (tag.textContent.trim().toLowerCase().includes(busca)) {
                mostrar = true; // Define mostrar como true se a tag contém a busca
            }
        });

        // Define a exibição do projeto com base na variável mostrar
        if (mostrar) {
            projeto.style.display = 'block'; // Exibe o projeto
        } else {
            projeto.style.display = 'none'; // Oculta o projeto
        }
    });
} catch (error) {
    console.error('Erro ao filtrar projetos:', error); // Registra o erro no console
    alert('Ocorreu um erro ao filtrar os projetos. Verifique o console para mais detalhes.'); // Exibe uma mensagem de erro ao usuário
}

//Exercício 3) Limpando formulário

const form = document.querySelector('form');
form.reset(); // Limpa todos os campos do formulário

const mainImage = document.getElementById('imagem');
mainImage.src = './img/imagem1.png'; // Define o caminho da imagem padrão

const imageName = document.getElementById('nome-imagem');
imageName.textContent = 'image_projeto.png'; // Define o nome padrão da imagem

const tagsList = document.getElementById('tags-list');
tagsList.innerHTML = ''; // Remove todas as tags da lista

try {
    // Código de limpeza e restauração aqui
} catch (error) {
    console.error('Erro ao limpar o formulário:', error); // Registra o erro no console
    alert('Ocorreu um erro ao limpar o formulário. Verifique o console para mais detalhes.'); // Exibe uma mensagem de erro ao usuário
}

//Exercício 4) Exibindo detalhes de um pedido

// Função que simula a exibição de detalhes de um pedido
function exibirDetalhesPedido(pedido) {
    try {
        // Simula o acesso a propriedades do objeto pedido
        const id = pedido.id;
        const produto = pedido.produto;
        const quantidade = pedido.quantidade;

        // Verifica se todas as propriedades necessárias estão presentes
        if (!id || !produto || !quantidade) {
            throw new Error('Pedido incompleto. Verifique os dados fornecidos.');
        }

        // Exibe os detalhes do pedido
        console.log(`Detalhes do Pedido - ID: ${id}, Produto: ${produto}, Quantidade: ${quantidade}`);
    } catch (error) {
        // Captura e trata o erro
        console.error('Erro ao exibir detalhes do pedido:', error.message);
        // Poderia exibir uma mensagem para o usuário ou realizar outra ação apropriada
    }
}

// Objeto pedido com dados simulados
const pedido1 = {
    id: '123',
    produto: 'Camiseta',
    quantidade: 2
};

// Chamada da função e tratamento de erros
exibirDetalhesPedido(pedido1);

//Exercício 5) Tratamento de Erros com try...catch

// Função que simula a leitura de dados de uma biblioteca a partir de um objeto JavaScript
function lerDadosBiblioteca() {
    try {
        // Simulação de acesso aos dados da biblioteca (pode ser substituído por dados reais)
        const biblioteca = {
            livros: [
                { id: 1, titulo: "Dom Quixote", autor: "Miguel de Cervantes", ano: 1605 },
                { id: 2, titulo: "A Metamorfose", autor: "Franz Kafka", ano: 1915 },
                { id: 3, titulo: "1984", autor: "George Orwell", ano: 1949 }
            ]
        };

        // Verifica se os dados são válidos
        if (!biblioteca || !biblioteca.livros || biblioteca.livros.length === 0) {
            throw new Error('Dados da biblioteca inválidos. Verifique os dados fornecidos.');
        }

        // Exibe os dados dos livros
        console.log('Dados da Biblioteca:');
        biblioteca.livros.forEach(livro => {
            console.log(`ID: ${livro.id}, Título: ${livro.titulo}, Autor: ${livro.autor}, Ano: ${livro.ano}`);
        });

    } catch (error) {
        // Captura e trata o erro
        console.error('Erro ao ler dados da biblioteca:', error.message);
        // Poderia exibir uma mensagem para o usuário ou realizar outra ação apropriada
    }
}

// Chamada da função e tratamento de erros
lerDadosBiblioteca();