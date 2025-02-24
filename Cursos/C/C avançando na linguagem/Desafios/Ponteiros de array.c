int soma(int* inteiros) {
	int somaTotal;

	for(int i = 0; i <= strlen(inteiros); i++) {
		somaTotal += inteiros[i];
	}

	return somaTotal;
}