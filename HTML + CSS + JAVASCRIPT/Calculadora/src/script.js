function clearDisplay() {
    document.getElementById("display").value = "";
}

function addValue(value) {
    document.getElementById("display").value += value;
}

function calculate() {
        document.getElementById("display").value = eval(document.getElementById("display").value);
}