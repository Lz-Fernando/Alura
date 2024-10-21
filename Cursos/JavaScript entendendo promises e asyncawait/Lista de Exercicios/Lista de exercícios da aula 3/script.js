const uploadBtn = document.getElementById("upload-btn");
const inputUpload = document.getElementById("image-upload")

uploadBtn.addEventListener("click", () => {
    inputUpload.click();
})

function lerConteudoDoArquivo(arquivo) {
    return new Promise((resolve, reject) => {
        const leitor = new FileReader();

        leitor.onload  = () => {
            resolve({
                resultado: leitor.result,
                nome: arquivo.name
            });
        };

        leitor.onerror = () => {

            reject(`Erro na leitura do arquivo: ${arquivo.name}`);
        };

        leitor.readAsDataURL(arquivo);
    });
}

const imagemPrincipal = document.querySelector('.main-image');
const nomeImagem = document.querySelector('.container-image-nome p');

inputUpload.addEventListener('change', async (evento) => {
    arquivo = evento.target.files[0];

    if(arquivo) {
        try {
            const conteudoArquivo = await lerConteudoDoArquivo(arquivo);
            imagemPrincipal.src = conteudoArquivo.resultado;
            nomeImagem.textContent = conteudoArquivo.nome;
        } catch (error) {
            console.error("Erro na leitura do arquivo");
        }
    }
});

const inputTags = document.getElementById('input-tag');
const listaTags = document.getElementById('lista-tags');

const tagsDisponiveis = ['gato', 'gato laranja', 'gato preto', 'cachorro',  'cachorro branco', 'cachorro preto'];

async function verificaTagsDisponiveis(textoTag) {
    return new Promise((resolve) => {
        setTimeout(() => {
            resolve(tagsDisponiveis.includes(textoTag));
        }, 100)
    })
}

inputTags.addEventListener('keypress', async (evento) => {
    if (evento.key === 'Enter') {
        evento.preventDefault();
        const textoTag = inputTags.value.trim("").toLowerCase();
        const tagExiste = await verificaTagsDisponiveis(textoTag);
        if (tagExiste) {
            const novaTag = document.createElement('li');
            novaTag.innerHTML = `<p>${textoTag}</p> <img src="./img/close.svg" class='remove-tag'>`
            listaTags.appendChild(novaTag);
            inputTags.value = '';
        }
    }
})

listaTags.addEventListener('click', evento => {
    if (evento.target.classList.contains('remove-tag')) {
        const tagWantRemove = evento.target.parentElement;
        listaTags.removeChild(tagWantRemove);
    }
})













//Exercício 2) Validação de formulário de cadastro com JavaScript

const form = document.getElementById('cadastro-form');
const nome = document.getElementById('nome');
const email = document.getElementById('email');
const senha = document.getElementById('senha');
const erroNome = document.getElementById('erro-nome');
const erroEmail = document.getElementById('erro-email');
const erroSenha = document.getElementById('erro-senha');

form.addEventListener('submit', function(event) {
    event.preventDefault();
    if (nome.value.trim() === '') {
        erroNome.textContent = 'O nome é obrigatório.';
        return; // Encerrar a função se houver erro
    } else {
        erroNome.textContent = '';
    }

    const regexEmail = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (email.value.trim() === '') {
        erroEmail.textContent = 'O e-mail é obrigatório.';
        return; // Encerrar a função se houver erro
    } else if (!regexEmail.test(email.value.trim())) {
        erroEmail.textContent = 'O e-mail não é válido.';
        return; // Encerrar a função se houver erro
    } else {
        erroEmail.textContent = '';
    }

    if (senha.value.trim() === '') {
        erroSenha.textContent = 'A senha é obrigatória.';
        return; // Encerrar a função se houver erro
    } else {
        erroSenha.textContent = '';
    }
})