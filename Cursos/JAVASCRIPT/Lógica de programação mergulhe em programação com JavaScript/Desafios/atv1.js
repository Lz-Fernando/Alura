alert('Boas vindas ao nosso site!');

let nome = 'lua';
let idade = 25;
let numeroDeVendas = 50;
let saldoDisponivel = 100;
let mensagemDeErro = 'Erro! Preencha todos os campos';

alert(mensagemDeErro);

nome= prompt('Qual seu nome?');
idade = prompt('Digite a sua idade');

if (idade > 18) {
  alert('Pode tirar a habilitação!');
}