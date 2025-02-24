FILE* f;
f = fopen("teste.txt", "r");
if(f == 0) {
    printf("erro abrindo arquivo");
    exit(1);
}