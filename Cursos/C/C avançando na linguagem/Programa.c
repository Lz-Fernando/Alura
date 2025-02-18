#include <stdio.h>
#include <string.h>

int main()
{
	char palavraSecreta[20];

	sprintf(palavraSecreta, "MELANCIA");

	int acertou, enforcou = 0;

	do {
		char chute;
		scanf("%c", &chute);

		for (int i = 0; i < strlen(palavraSecreta); i++) {
			if (palavraSecreta[i] == chute) {
				printf("A posição %d tem essa letra!\n", i);
			}
		}

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