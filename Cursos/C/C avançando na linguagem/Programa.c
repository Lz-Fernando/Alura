#include <stdio.h>
#include <string.h>
#include <time.h>
#include <stdlib.h>
#include "forca.h"

//variáveis globais
char palavraSecreta[20];
char chutes[26];
int chutesDados = 0;

//Funções
void abertura() {
	printf("/****************/\n");
    printf("/ Jogo de Forca */\n");
    printf("/****************/\n\n");
}

void chuta() {
	char chute;
	scanf(" %c", &chute);

	chutes[chutesDados] = chute;
	chutesDados++;
}

int jaChutou(char letra) {
	int achou = 0;

	for (int j = 0; j < chutesDados; j++) {
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

int acertou() {
	for(int i = 0; i < strlen(palavraSecreta); i++) {
		if(!jaChutou(palavraSecreta[i])) {
			return 0;
		}
	}

	return 1;
}

void escolhePalavra() {
	FILE* f;

	fopen("palavras.txt", "r");

	int quantidadePalavras;
	fscanf(f, "%d", &quantidadePalavras);

	srand(time(0));
	int randomico = rand() % quantidadePalavras;

	for(int i = 0; i <= randomico; i++) {
		fscanf(f, "%s", palavraSecreta);
	}

	fclose(f);
}

int enforcou() {
	int erros = 0;

	for(int i = 0; i < chutesDados; i++) {
		int existe = 0;

		for(int j = 0; j < strlen(palavraSecreta); j++) {
			if(chutes[i] == palavraSecreta[j]) {
				existe = 1;
				break;
			}
		}

		if(!existe) erros++;
	}
	return erros >= 5;
}


//Main
int main() {
	escolhePalavra();
    abertura();

	do {
		desenhaForca();
		chuta();

	} while (!acertou() && !enforcou());

	return 0;
}