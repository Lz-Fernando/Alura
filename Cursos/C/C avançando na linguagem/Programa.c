#include <stdio.h>
#include <string.h>

//variáveis globais
char palavraSecreta[20];
char chutes[26];
int tentativas = 0;

void abertura() {
	printf("/****************/\n");
    printf("/ Jogo de Forca */\n");
    printf("/****************/\n\n");
}

void chuta() {
	char chute;
	scanf(" %c", &chute);

	chutes[tentativas] = chute;
	tentativas++;
}

int jaChutou(char letra) {
	int achou = 0;

	for (int j = 0; j < tentativas; j++) {
		if (chutes[j] == palavraSecreta[i]) {
			achou = 1;
			break;
		}
	}

	return achou;
}

void desenhaForca() {
	for (int i = 0; i < strlen(palavraSecreta); i++) {

		// a letra já foi chutada?
		int achou = jaChutou(palavraSecreta[i]);

		if (achou) {
			printf("%c ", palavraSecreta[i]);
		} else {
			printf("_");	
		}
	}
	printf("\n");
}

void escolhePalavra() {
	sprintf(palavraSecreta, "MELANCIA");
}

int main() {
	int acertou, enforcou = 0;

	escolhePalavra();
    abertura();

	do {
		desenhaForca();
		chuta();

	} while (!acertou && !enforcou);

	return 0;
}