function clearDisplay() {
    document.getElementById("display").value = "0";
}

function addValue(value) {
    if (document.getElementById("display").value >= "99999999999999999998"){
        document.getElementById("display").value = "ERROR";

        } else if (document.getElementById("display").value === "0") {
        document.getElementById("display").value = value;

            } else {
            document.getElementById("display").value += value;
            }
}

function calculate() {
        document.getElementById("display").value = eval(document.getElementById("display").value);
}

window.onload = function() {
    clearDisplay();
};