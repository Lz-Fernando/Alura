//Exercício 1) Validação de E-mail em Formulário de Cadastro

async function verificaEmailDisponivel(email) {
    return new Promise((resolve) => {
        setTimeout(() => {
            const emailsCadastrados = ['user1@example.com', 'user2@example.com', 'user3@example.com'];
            resolve(!emailsCadastrados.includes(email));
        }, 1000);
    });
}

document.getElementById('email-input').addEventListener('blur', async function (event) {
    const email = event.target.value;

    if (email.trim() !== "") {
        try {
            const emailDisponivel = await verificaEmailDisponivel(email);
            exibirFeedback(emailDisponivel, email);
        } catch (error) {
            console.error('Erro ao verificar a disponibilidade do e-mail:', error);
            exibirFeedbackErro();
        }
    }
});

function exibirFeedback(disponivel, email) {
    const feedbackElemento = document.getElementById('email-feedback');
    if (disponivel) {
        feedbackElemento.textContent = `O e-mail ${email} está disponível.`;
        feedbackElemento.style.color = "green";
    } else {
        feedbackElemento.textContent = `O e-mail ${email} já está cadastrado.`;
        feedbackElemento.style.color = "red";
    }
}

function exibirFeedbackErro() {
    const feedbackElemento = document.getElementById('email-feedback');
    feedbackElemento.textContent = "Erro ao verificar a disponibilidade do e-mail. Verifique o console.";
    feedbackElemento.style.color = "red";
}

//Exercício 2) Validação de Nome de Usuário em Plataforma de Jogos

async function verificaNomeUsuarioDisponivel(username) {
    return new Promise((resolve) => {
        setTimeout(() => {
            const usuariosRegistrados = ['player1', 'gamer2024', 'champion'];
            resolve(!usuariosRegistrados.includes(username));
        }, 1000);
    });
}

document.getElementById('username-input').addEventListener('blur', async function (event) {
    const username = event.target.value;

    if (username.trim() !== "") {
        try {
            const usernameDisponivel = await verificaNomeUsuarioDisponivel(username);
            exibirFeedback(usernameDisponivel, username);
        } catch (error) {
            console.error('Erro ao verificar a disponibilidade do nome de usuário:', error);
            exibirFeedbackErro();
        }
    }
});

function exibirFeedback(disponivel, username) {
    const feedbackElemento = document.getElementById('username-feedback');
    if (disponivel) {
        feedbackElemento.textContent = `O nome de usuário ${username} está disponível.`;
        feedbackElemento.style.color = "green";
    } else {
        feedbackElemento.textContent = `O nome de usuário ${username} já está registrado.`;
        feedbackElemento.style.color = "red";
    }
}

function exibirFeedbackErro() {
    const feedbackElemento = document.getElementById('username-feedback');
    feedbackElemento.textContent = "Erro ao verificar a disponibilidade do nome de usuário. Verifique o console.";
    feedbackElemento.style.color = "red";
}

//Exercício 3) Capturando dados do formulário e simulando envio para o banco de dados

publicarBtn.addEventListener('click', capturarEEnviarDados);

async function enviarDadosParaBanco(dados) {
    return new Promise((resolve) => {
        setTimeout(() => {
            console.log('Dados enviados para o banco de dados:', dados);
            resolve('Sucesso');
        }, 1000);
    });
}

async function capturarEEnviarDados() {
    const nomeProjeto = document.getElementById('nome-projeto').value.trim();
    const descricaoProjeto = document.getElementById('descricao-projeto').value.trim();

    if (!nomeProjeto || !descricaoProjeto) {
        feedback.textContent = "Nome do projeto e descrição são obrigatórios.";
        feedback.style.color = "red";
        return;
    }

    const dados = {
        nome: nomeProjeto,
        descricao: descricaoProjeto,
        tags: tags
    };

    try {
        const resultado = await enviarDadosParaBanco(dados);
        feedback.textContent = `Dados enviados com sucesso: ${resultado}`;
        feedback.style.color = "green";
    } catch (error) {
        feedback.textContent = "Erro ao enviar os dados.";
        feedback.style.color = "red";
    }
}

//Exercício 4)  Enviando feedback do usuário via formulário

enviarBtn.addEventListener('click', capturarEEnviarDados);

async function enviarDadosParaServidor(dados) {
    return new Promise((resolve) => {
        setTimeout(() => {
            console.log('Dados enviados para o servidor:', dados);
            resolve('Sucesso');
        }, 1000);
    });
}

async function capturarEEnviarDados() {
    const nome = document.getElementById('nome').value.trim();
    const email = document.getElementById('email').value.trim();
    const mensagem = document.getElementById('mensagem').value.trim();

    if (!nome || !email || !mensagem) {
        feedback.textContent = "Por favor, preencha todos os campos.";
        feedback.style.color = "red";
        return;
    }

    const dados = {
        nome: nome,
        email: email,
        mensagem: mensagem
    };

    try {
        const resultado = await enviarDadosParaServidor(dados);
        feedback.textContent = `Mensagem enviada com sucesso: ${resultado}`;
        feedback.style.color = "green";
        // Limpar formulário após envio bem-sucedido (opcional)
        form.reset();
    } catch (error) {
        feedback.textContent = "Erro ao enviar a mensagem.";
        feedback.style.color = "red";
    }
}

//Exercício 5) Simulando envio de formulário para um backend

async function publicarProjeto(nomeProjeto, descricaoProjeto, tagsProjeto) {
    return new Promise((resolve, reject) => {
        // Simulação de tempo de resposta de 2 segundos
        setTimeout(() => {
            // Simulação de sucesso ou falha aleatória (50% de chance de sucesso)
            if (Math.random() < 0.5) {
                resolve(`Projeto '${nomeProjeto}' publicado com sucesso!`);
            } else {
                reject(new Error(`Falha ao publicar o projeto '${nomeProjeto}'. Tente novamente.`));
            }
        }, 2000); // Tempo de espera de 2 segundos
    });
}

// Exemplo de uso da função publicarProjeto
const nome = "Meu Projeto";
const descricao = "Descrição do meu projeto...";
const tags = ["frontend", "web", "javascript"];

await publicarProjeto(nome, descricao, tags)