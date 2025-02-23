numero1 = int(input("Digite um número:"))
numero2 = int(input("Digite um número:"))
numero3 = int(input("Digite um número:"))

soma = numero1 + numero2 + numero3
subtracao = numero1 - numero2
multiplicacao = numero1 * numero2
divisao = numero1 / numero2
potencia = numero1 ** numero2
divisaoInteira = numero1 // numero2
resto = numero1 % numero2

print(f"A soma do {numero1} + {numero2} + {numero3} é {soma}\n")
print(f"A subtração do {numero1} - {numero2} é {subtracao}\n")
print(f"A multiplicação do {numero1} * {numero2} é {multiplicacao}\n")
print(f"A divisão do {numero1} / {numero2} é {divisao}\n")
print(f"A potência do {numero1} ^ {numero2} é {potencia}\n")
print(f"A divisão imteira do {numero1} / {numero2} é {divisaoInteira}\n")
print(f"O resto da divisão do {numero1} / {numero2} é {resto}\n")

nota1 = float(input("Digite a primeira nota do aluno:"))
nota2 = float(input("Digite a segunda nota do aluno:"))
nota3 = float(input("DIgite a terceira nota do aluno:"))

media = (nota1 + nota2 + nota3) / 3
media_Ponderada = (5*1 + 12*2 + 20*3 + 15*4) / (1+2+3+4)

print(f"A média do aluno foi {media:.2f}")
print(f"Média poderada {media_Ponderada}.")