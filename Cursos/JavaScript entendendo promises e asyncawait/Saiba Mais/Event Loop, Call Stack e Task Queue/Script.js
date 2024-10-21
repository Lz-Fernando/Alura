//Call Stack: O Gerente de Tarefas

function primeiraFuncao() {
    segundaFuncao();
    console.log("Olá da primeira função!");
  }
  
  function segundaFuncao() {
    console.log("Olá da segunda função!");
  }
  
primeiraFuncao();

//Task Queue: A Fila de Espera

console.log("Início");

setTimeout(() => {
  console.log("Processado no timeout");
}, 2000);

console.log("Fim");

//Event Loop: O Maestro

console.log("Início");

setTimeout(() => {
  console.log("Timeout 1");
}, 3000);

setTimeout(() => {
  console.log("Timeout 2");
}, 2000);

console.log("Fim");