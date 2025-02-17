#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define NUMERO_DE_TENTATIVAS 5

int main () {

	// imprime o cabeçalho do jogo
	printf("*****************************************\n");
	printf("* Bem vindo ao nosso jogo de adivinhação *\n");
	printf("*****************************************\n");

	int segundos = time(0);
	srand(segundos);
	int numeroGrande = rand();
	int numeroSecreto = numeroGrande % 100;

	int chute;
	int tentativas = 1;
	double pontos = 1000;

	int nivel;
	printf("Qual o nível de dificuldade?\n");
	printf("(1) Fácil / (2) Médio / (3) Difícil\n\n");
	printf("Escolha: ");
	scanf("%d", &nivel);

	int numeroTentativas;
	switch (nivel) {
		case 1:
			numeroTentativas = 20;
			break
		case 2:
			numeroTentativas = 10;
			break
		default:
			numeroTentativas = 5;
			break
	}

	/*if (nivel = 1) {
		numeroTentativas = 20;
	} else if (nivel = 2) {
		numeroTentativas = 10;
	} else {
		numeroTentativas = 5;
	}*/

	int acertou = 0;

	for (int i = 1; i <= numeroTentativas; i++) {
		printf("Tentativa %d", tentativas);
		printf("Chute um número: ");
		scanf("%d", &chute);
		printf("Seu chute foi %d!\n", chute);

		acertou = (chute == numeroSecreto);
		int maior = chute > numeroSecreto;

		if(chute < 0) {
			printf("Você não pode chutar números negativos!\n");
			continue;
		}
		
		if (acertou) {
			break;
		} else if (maior){
			printf("Seu chute é maior que o número secreto\n");
		} else {
			printf("Seu chute é menor que o número secreto\n");
		}

		tentativas++;
		double pontosPerdidos = abs(chute - numeroSecreto) / (double)2;
		pontos = pontos - pontosPerdidos;
	}

	if (acertou) {
		printf("Parabéns, você acertou!\n");
		printf("Você acertou em %d tentativas!\n", tentativas);
		printf("Total de pontos:%.1f \n", pontos);
	} else {
		printf("Você perdeu! Tente de novo\n");
	}

	printf("Fim de jogo!\n");

	return 0;
}