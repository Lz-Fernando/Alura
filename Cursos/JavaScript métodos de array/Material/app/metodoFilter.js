const btnFiltrarLivrosDeFront = document.getElementById('btnFiltrarLivrosFront');

btnFiltrarLivrosDeFront.addEventListener('click', filtrarLivrosDeFront);

function filtrarLivrosDeFront() {
    let livrosFiltrados = livros.filter(livro => livro.categoria == 'front-end')
    console.table(livrosFiltrados)
}