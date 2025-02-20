#include <stdio.h>
#include <string.h>

void abertura() {
	printf("/****************/\n");
    printf("/ Jogo de Forca */\n");
    printf("/****************/\n\n");
}

void chuta(char chutes[26], int* tentativas) {
	char chute;
	scanf(" %c", &chute);

	chutes[(*tentativas)] = chute;
	(*tentativas)++;
}

int jaChutou(char letra, char chutes[26], tentativas) {
	int achou = 0;

	for (int j = 0; j < tentativas; j++) {
		if (chutes[j] == palavraSecreta[i]) {
			achou = 1;
			break;
		}
	}

	return achou;
}

int main() {
	char palavraSecreta[20];

	sprintf(palavraSecreta, "MELANCIA");

	int acertou, enforcou, tentativas = 0;
	char chutes[26];

    abertura();

	do {

		// imprime a palavra secreta
		for (int i = 0; i < strlen(palavraSecreta); i++) {

			// a letra já foi chutada?
			int achou = jaChutou(palavraSecreta[i], chutes, tentativas);

			if (achou) {
				printf("%c ", palavraSecreta[i]);
			} else {
				printf("_");	
			}
		}
		printf("\n");

		chuta(chutes, &tentativas);

	} while (!acertou && !enforcou);

	printf("%s", palavraSecreta);

	return 0;
}