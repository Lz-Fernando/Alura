//Uso de try...catch

try {
    // Código que pode gerar erro
    console.log(minhaFuncao());
} catch (erro) {
    // O que fazer se um erro ocorrer
    console.log("Um erro ocorreu: ", erro.message);
}

//Error Objects

throw new Error("Algo deu errado!");