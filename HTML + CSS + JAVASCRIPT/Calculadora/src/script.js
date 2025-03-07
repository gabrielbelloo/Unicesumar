function clear() {
    document.getElementById("display").value = "0";
}

function addValue(value) {
    document.getElementById("display").value += value;
}

function calculate() {
    try {
        document.getElementById("display").value = eval(document.getElementById("display").value);
    } catch (error) {
        alert("Expressão inválida!");
        limpar();
    }
}