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
	
	printf("O número %d é o secreto!\n", numeroSecreto);	
	
	return 0;
}