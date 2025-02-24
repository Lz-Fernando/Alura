#include <stdio.h>
#include <string.h>
#include <time.h>
#include <stdlib.h>
#include "forca.h"

//variáveis globais
char palavraSecreta[TAMANHO_PALAVRA];
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
    printf("Qual letra? ");
    scanf(" %c", &chute);

    if(letraexiste(chute)) {
        printf("Você acertou: a palavra tem a letra %c\n\n", 
            chute);
    } else {
        printf("\nVocê errou: a palavra NÃO tem a letra %c\n\n", 
            chute);
    }

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

int letraexiste(char letra) {

    for(int j = 0; j < strlen(palavraSecreta); j++) {
        if(letra == palavraSecreta[j]) {
            return 1;
        }
    }

    return 0;
}

int chuteserrados() {
    int erros = 0;

    for(int i = 0; i < chutesDados; i++) {

        if(!letraexiste(chutes[i])) {
            erros++;
        }
    }

    return erros;
}

void desenhaForca() {
	printf("Forca:");

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

void adicionaPalavra() {
	char quer;

	printf("Você deseja adicionar uma palavra no jogo? (S/N)");
	scanf("%c", &quer);

	if(quer == "S") {
		char novaPalavra[20];
		printf("Qual a nova palavra? ");
		scanf("%s", novaPalavra);
	
		FILE* f;
		
		f = fopen("palavras.txt", "r+");
		if(f == 0) {
			printf("Desculpe, banco de dados não disponível\n\n");
			exit(1);
		}
	
		int qtd;
		fscanf(f, "%d", &qtd);
		qtd++;
	
		fseek(f, 0, SEEK_SET);
		fprintf(f, "%d", qtd);

		fseek(f, 0, SEEK_END);
		fprintf(f, "\n%s", novaPalavra);

		fclose(f);
	}
}

void escolhePalavra() {
	FILE* f;

	fopen("palavras.txt", "r");
	if(f == 0) {
		printf("Desculpe, banco de dados não disponível\n\n");
		exit(1);
	}

	int quantidadePalavras;
	fscanf(f, "%d", &quantidadePalavras);

	srand(time(0));
	int randomico = rand() % quantidadePalavras;

	for(int i = 0; i <= randomico; i++) {
		fscanf(f, "%s", palavraSecreta);
	}

	fclose(f);
}

int acertou() {
	for(int i = 0; i < strlen(palavraSecreta); i++) {
		if(!jaChutou(palavraSecreta[i])) {
			return 0;
		}
	}

	return 1;
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
	return chuteserrados() >= 5;
}


//Main
int main() {
	escolhePalavra();
    abertura();

	do {
		desenhaForca();
		chuta();

	} while (!acertou() && !enforcou());

	adicionaPalavra();

	if(acertou()) {
		printf("parabéns!");
	} else {
		printf("Você perdeu!");
	}

	return 0;
}