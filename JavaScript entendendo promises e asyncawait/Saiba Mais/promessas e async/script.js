let promessaDePizza = new Promise(function(resolve, reject) {
    // Simulando a entrega da pizza
    let pizzaEntregue = true; // Tente mudar para false e veja o que acontece
    if (pizzaEntregue) {
      resolve('Pizza entregue com sucesso!');
    } else {
      reject('Entrega da pizza falhou.');
    }
});

async function buscarDados() {
    const resposta = await fetch('https://api.exemplo.com/dados');
    const dados = await resposta.json();
    console.log(dados);
}