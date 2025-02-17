document.getElementById('imageUpload').addEventListener('change', function(event) {
    var file = event.target.files[0];
    // Agora temos o arquivo e podemos fazer mais validações

    if (!file.type.match('image/png') && !file.type.match('image/jpeg')) {
        alert('Por favor, selecione uma imagem PNG ou JPEG.');
        return;
    }

      // Vamos limitar o tamanho a 2MB
    if (file.size > 2 * 1024 * 1024) {
        alert('A imagem deve ter no máximo 2MB.');
        return;
    }
});