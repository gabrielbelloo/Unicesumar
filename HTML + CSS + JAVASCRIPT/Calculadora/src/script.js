function clearDisplay() {
    document.getElementById("display").value = "0";
}

function addValue(value) {
    if (document.getElementById("display").value.length >= "20"){
        document.getElementById("display").value = "ERROR";

        } else if (document.getElementById("display").value === "0" || document.getElementById("display").value === "ERROR") {
        document.getElementById("display").value = value;

            } else {
            document.getElementById("display").value += value;
            }
}

function calculate() {
    const display = document.getElementById("display");
    try {
        document.getElementById("display").value = evaluateExpression(document.getElementById("display").value);
    } catch (e) {
        document.getElementById("display").value = "ERROR";
    }
}

const add = (a, b) => a + b;
const subtract = (a, b) => a - b;
const multiply = (a, b) => a * b;
const divide = (a, b) => a / b;

function evaluateExpression(expression) {

const evaluate = (expr) => {
    let result = 0;
    let currentNumber = '';
    let currentOperator = '+';

    for (let i = 0; i < expr.length; i++) {
        const character = expr[i];

        if (/\d/.test(character) || character === '.') {
            currentNumber += character;
        }

        if (/[+\-*/]/.test(character) || i === expr.length - 1) {
            if (currentNumber) {
                const number = parseFloat(currentNumber);
                
                switch (currentOperator) {
                    case '+':
                        result = add(result, number);
                        break;
                    case '-':
                        result = subtract(result, number);
                        break;
                    case '*':
                        result = multiply(result, number);
                        break;
                    case '/':
                        result = divide(result, number);
                        break;
                }
                currentNumber = '';
            }
            currentOperator = character;
        }
    }

    return result;
};

return evaluate(expression);
}

window.onload = function() {
    clearDisplay();
};