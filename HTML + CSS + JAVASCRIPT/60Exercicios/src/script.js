function enviarNomeEmail() {
    document.getElementById('nome').value = "";
    document.getElementById('email').value = "";
    document.getElementById('mensagem').value = "";
    alert('Formulário enviado com sucesso!');
}

function olaMundoAlert() {
    alert('Olá Mundo!');
}

function primeiroScriptConsole() {
    console.log('Meu primeiro script em JavaScript');
}

function calculate(){
    let num1 = 10;
    let num2 = 20;
    let resultado = num1 + num2;
    console.log(num1 + ' + ' + num2 + ' = ' + resultado);
}