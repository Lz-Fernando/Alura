document.getElementById('meuBotao').addEventListener('click', function() {
    alert('Olá, mundo!');
});

//******************************************************************

document.getElementById('minhaLista').addEventListener('click', function(e) {
    // Verifica se o clique veio de um <li>
    if(e.target.tagName === 'LI') {
      alert(e.target.textContent);
    }
});