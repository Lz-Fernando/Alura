#include <stdio.h>

#define NUMERO_DE_TENTATIVAS 5

int main () {

	// imprime o cabeçalho do jogo
	printf("*****************************************\n");
	printf("* Bem vindo ao nosso jogo de adivinhação *\n");
	printf("*****************************************\n");

	int numeroSecreto = 42;
	int chute;
	int tentativas = 1;

	while(1) {
	//for (int i = 1; i <= NUMERO_DE_TENTATIVAS; i++) {
		printf("Tentativa %d de %d\n", tentativas);
		printf("Chute um número: ");
		scanf("%d", &chute);
		printf("Seu chute foi %d!\n", chute);

		int acertou = (chute == numeroSecreto);
		int maior = chute > numeroSecreto;

		if(chute < 0) {
			printf("Você não pode chutar números negativos!\n");
			continue;
		}
		
		if (acertou) {
			printf("Parabéns, você acertou!\n");
			break;
		} else if (maior){
			printf("Seu chute é maior que o número secreto\n");
		} else {
			printf("Seu chute é menor que o número secreto\n");
		}

		tentativas++;
	}

	printf("Fim de jogo!\n");
	printf("Você acertou em %d tentativas!", tentativas);

	return 0;
}