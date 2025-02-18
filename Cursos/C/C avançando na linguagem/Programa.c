#include <stdio.h>
#include <string.h>

int main()
{
	char palavraSecreta[20];

	sprintf(palavraSecreta, "MELANCIA");

	int acertou, enforcou, tentativas = 0;
	char chutes[26];

	do {
		for (int i = 0; i < strlen(palavraSecreta); i++) {
			int achou = 0;

			for (int j = 0; j < tentativas; i++) {
				if (chutes[j] == palavraSecreta[i]) {
					achou = 1;
					break;
				}
			}

			if (achou) {
				printf("%c ", palavraSecreta[i]);
			} else {
				printf("_");	
			}
		}
		printf("\n");

		char chute;
		scanf(" %c", &chute);

		chutes[tentativas] = chute;
		tentativas++;

	} while (!acertou && !enforcou);

	printf("%s", palavraSecreta);

	/*palavraSecreta[0] = "M";
	palavraSecreta[1] = "E";
	palavraSecreta[2] = "L";
	palavraSecreta[3] = "A";
	palavraSecreta[4] = "N";
	palavraSecreta[5] = "C";
	palavraSecreta[6] = "I";
	palavraSecreta[7] = "A";
	palavraSecreta[8] = "\0";

	printf("%c%c%c%c%c%c%c%c\n", palavraSecreta[0],
		palavraSecreta[1], palavraSecreta[2], palavraSecreta[3],
		palavraSecreta[4], palavraSecreta[5], palavraSecreta[6],
		palavraSecreta[7] );*/

	return 0;
}