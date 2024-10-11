const input = document.getElementById("input");
const button = document.getElementById("button");
let contador = 0;

button.addEventListener("click",  function(evento) {
    evento.preventDefault();

    const nomeItem = input.value;
    const novoItem = document.createElement("li");
    novoItem.textContent = nomeItem;

    const removeButton = document.createElement("button");
    removeButton.textContent = "Remover";
    removeButton.addEventListener("click", function(evento) {
        evento.preventDefault();
        novoItem.remove()
    })

    const editButton = document.createElement('button');
    editButton.textContent = "Editar";
    editButton.addEventListener('click', function(evento) {
        evento.preventDefault();
        const novoInput = prompt('Editar item:', novoInput.textContent);
        if (novoInput) novoItem.textContent = novoInput;
    })

    const containerCheckbox  = document.createElement('div');
    containerCheckbox.classList.add('container', 'checkbox');

    const checkboxInput = document.createElement('input');
    checkboxInput.type = 'checkbox';
    checkboxInput.classList.add('input', 'fintcheckbox');
    checkboxInput.id = `checkbox_${contador++}`;

    const checkboxLabel = document.createElement('label');
    checkboxLabel.appendChild(checkboxInput);
    containerCheckbox.appendChild(checkboxLabel);

    document.querySelector('#mainListContainer').appendChild(containerCheckbox);

    novoItem.appendChild(editButton);
    novoItem.appendChild(removeButton)
    document.getElementById('lista-de-tarefas').appendChild(novoItem);

    input.value = '';
});