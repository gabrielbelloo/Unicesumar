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

function exibirNome() {
    let nome = document.getElementById('name').value;
    alert('Olá ' + nome);
    console.log('Olá ' + nome);
    document.getElementById('name').value = "";
}

function converterInteiro(){
    let numeroChar = document.getElementById("numero").value;
    let numeroInt = parseInt(numeroChar);
    console.log(numeroInt);
    document.getElementById("numero").value = "";
}

function exibirBoolean() {
    let numero = document.getElementById('numero').value;
    let numeroInt = parseInt(numero);
    let resultado = Boolean(numeroInt);
    console.log(resultado);
    document.getElementById('numero').value = "";
}

function verificarTipoVariavel() {
    let variavel = document.getElementById('variavel').value;
    let tipoVariavel = typeof variavel;
    console.log(tipoVariavel);
    document.getElementById('variavel').value = "";
}

function soma() {
    let num1 = parseInt(document.getElementById('num1').value);
    let num2 = parseInt(document.getElementById('num2').value);
    let soma = num1 + num2;
    console.log(soma);
    document.getElementById('num1').value = "";
    document.getElementById('num2').value = "";
}

function modificarValor() {
    let valor = 43;
    let tmp = valor;
    valor = document.getElementById('num3').value;
    console.log(tmp + ' -> ' + valor);
}

function verificarParImpar() {
    let num = parseInt(document.getElementById('num4').value);
    let resultado;
    if (num % 2 == 0) {
        resultado = num + " é par.";
    } else {
        resultado = num + " é ímpar.";
    }
    console.log(resultado);
}

function reatribuirConst() {
    const valor = 10;
    console.log(valor);
    valor = 20;
    console.log(valor);
}

function calcularMedia() {
    let num5 = parseInt(document.getElementById('num5').value);
    let num6 = parseInt(document.getElementById('num6').value);
    let num7 = parseInt(document.getElementById('num7').value);
    num5 = (num5 + num6 + num7) / 3;
    console.log(num5);
    document.getElementById('num5').value = "";
    document.getElementById('num6').value = "";
    document.getElementById('num7').value = "";
}

function dobrar(){
    let num8 = parseInt(document.getElementById('num8').value);
    num8 = num8 * 2;
    console.log(num8);
    document.getElementById('num8').value = "";
}

function converterCelsiusParaFahrenheit() {
    let celsius = parseFloat(document.getElementById('celsius').value);
    let fahrenheit = (celsius * 9/5) + 32;
    console.log(fahrenheit);
    document.getElementById('celsius').value = "";
}

function calcularMaioridade(){
    let idade = parseInt(document.getElementById('idade').value);
    if(idade<18){
        console.log("Menor de idade");
    }else{
        console.log("Maior de idade");
    }}

    function calcularMaior() {
        let num9 = parseInt(document.getElementById('num9').value);
        let num10 = parseInt(document.getElementById('num10').value);
        let num11 = parseInt(document.getElementById('num11').value);
        if (num9 > num10 && num9 > num11) {
            console.log(num9 + " é o maior número.");
        } else if (num10 > num9 && num10 > num11) {
            console.log(num10 + " é o maior número.");
        } else if (num11 > num9 && num11 > num10) {
            console.log(num11 + " é o maior número.");
        } else {
            console.log("Os números são iguais ou não há um maior.");
        }
        document.getElementById('num9').value = "";
        document.getElementById('num10').value = "";
        document.getElementById('num11').value = "";
    }

function exibir1a10(){
    for(let i=0; i<11; i++){
        console.log(i);
    }
}

function exibir10a1(){
    let i=10;
    while(i>0){
        console.log(i);
        i--;
    }
}

function verificarMaior10() {
    let i=document.getElementById('num12').value;
        if(i<10){
            alert('Número menor que 10');
    }else{
        alert('Número maior que 10');
    }
}

function tabuada7(){
    for(let i=1; i<11; i++){
        let resultado = 7 * i;
        console.log('7 x ' + i + ' = ' + resultado);
    }
}

function soma1a100(){
    let resultado = 0;
    for(let i=1; resultado<101; i++){
        let tmp = resultado;
        resultado += i;
        console.log(tmp + ' + ' + i + ' = ' + resultado);
    }
}

function exibePar() {
    for(let i=0; i<51; i++){
        if(i%2==0){
            console.log(i);
        }
    }
}

let arrayNum = [1, 2, 3, 4, 5];

function adicionarNum(){
    let novoNum = parseInt(document.getElementById('num13').value, 10);
    if (!isNaN(novoNum)) {
        arrayNum.push(novoNum);
        exibeArray();
    }else{
        console.log('Valor inválido!');
    }
}

function exibeArray(){
    for (let i = 0; i < arrayNum.length; i++) {
        console.log(arrayNum[i]);
    }
    console.log('Primeiro = ' + arrayNum[0]);
    console.log('Último = ' + arrayNum[arrayNum.length - 1]);
}

function somarParametros() {
    let z = Number(document.getElementById('num14').value);
    let y = Number(document.getElementById('num15').value);
    let resultado = z + y;
    console.log(resultado);
}