#include <stdio.h>

int main () {

	// imprime o cabeçalho do jogo
	printf("*****************************************\n");
	printf("* Bem vindo ao nosso jogo de adivinhação *\n");
	printf("*****************************************\n");

	int numeroSecreto = 42;
	int chute;

	printf("Chute um número: ");
	scanf("%d", &chute);
	printf("Seu chute foi %d!\n", chute);

	if (chute == numeroSecreto) {
		printf("Parabéns, você acertou!\n");
	} else {
		printf("Você errou!\n");
		if (chute > numeroSecreto)
		{
			printf("Seu chute é maior que o número secreto");
		}

		if (chute < numeroSecreto)
		{
			printf("Seu chute é menor que o número secreto");
		}
	}
	
	printf("O número %d é o secreto!\n", numeroSecreto);	
	
	return 0;
}