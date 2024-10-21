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

//Exercício 4) Implementando Preview de Arquivo de Texto com Promises e Async/Await

const upload = document.querySelector('#upload');
const conteudoArquivo = document.querySelector('#conteudoArquivo');

upload.addEventListener('change', async (event) => {
    const arquivo = event.target.files[0];
    if (arquivo) {
        try {
            const conteudo = await lerConteudoDoArquivo(arquivo);
            conteudoArquivo.textContent = conteudo.texto;
        } catch (erro) {
            console.error('Erro na leitura do arquivo', erro);
        }
    }
});

function lerConteudoDoArquivo(arquivo) {
    return new Promise((resolve, reject) => {
        const leitor = new FileReader();
        leitor.onload = () => resolve({ texto: leitor.result });
        leitor.onerror = () => reject(leitor.error);
        leitor.readAsText(arquivo);
    });
}

//Exercício 5) Lendo e Exibindo Dados de um Arquivo JSON

document.addEventListener('DOMContentLoaded', () => {
    const upload = document.querySelector('#upload');
    const listaDados = document.querySelector('#listaDados');

    upload.addEventListener('change', async (event) => {
        const arquivo = event.target.files[0];
        if (arquivo) {
            try {
                const conteudo = await lerConteudoDoArquivo(arquivo);
                const dados = JSON.parse(conteudo.texto);
                listaDados.innerHTML = '';
                dados.forEach(dado => {
                    const li = document.createElement('li');
                    li.textContent = JSON.stringify(dado);
                    listaDados.appendChild(li);
                });
            } catch (erro) {
                console.error('Erro na leitura do arquivo', erro);
            }
        }
    });
});

function lerConteudoDoArquivo(arquivo) {
    return new Promise((resolve, reject) => {
        const leitor = new FileReader();
        leitor.onload = () => resolve({ texto: leitor.result });
        leitor.onerror = () => reject(leitor.error);
        leitor.readAsText(arquivo);
    });
}