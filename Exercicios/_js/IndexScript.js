function adicao(primeiroNumero, segundoNumero){
    let resultado;
    primeiroNumero = parseInt(primeiroNumero);
    segundoNumero = parseInt(segundoNumero);

    if(isNaN(primeiroNumero)||isNaN(segundoNumero)){
        alert('Por favor, insira números válidos')
        return;
    }else{
        resultado = primeiroNumero + segundoNumero;
        document.getElementById("resultado").innerText = "Resultado:" + resultado;
    }
}
function subtracao(primeiroNumero, segundoNumero){
    let resultado;
    primeiroNumero = parseInt(primeiroNumero);
    segundoNumero = parseInt(segundoNumero);

    if(isNaN(primeiroNumero)||isNaN(segundoNumero)){
        alert('Por favor, insira números válidos')
        return;
    }else{
        resultado = primeiroNumero - segundoNumero;
        document.getElementById("resultado").innerText = "Resultado:" + resultado;
    }
}
function multiplicacao(primeiroNumero, segundoNumero){
    let resultado;
    primeiroNumero = parseInt(primeiroNumero);
    segundoNumero = parseInt(segundoNumero);

    if(isNaN(primeiroNumero)||isNaN(segundoNumero)){
        alert('Por favor, insira números válidos')
        return;
    }else{
        resultado = primeiroNumero * segundoNumero;
        document.getElementById("resultado").innerText = "Resultado:" + resultado;
    }
}
function divisao(primeiroNumero, segundoNumero){
    let resultado;
    primeiroNumero = parseInt(primeiroNumero);
    segundoNumero = parseInt(segundoNumero);

    if(isNaN(primeiroNumero)||isNaN(segundoNumero)){
        alert('Por favor, insira números válidos')
        return;
    }else{
        resultado = primeiroNumero / segundoNumero;
        document.getElementById("resultado").innerText = "Resultado:" + resultado;
    }
}



function clicar () {
    let operacao = document.getElementById("selecioneOperacao").value;
    console.log(operacao);
    let primeiroNumero = document.getElementById("primeiroNumero").value;
    let segundoNumero = document.getElementById("segundoNumero").value;
    if (operacao == "ADCAO") {
        adicao(primeiroNumero, segundoNumero);
    }else if (operacao == "SUB") {
        subtracao(primeiroNumero, segundoNumero);
    }else if (operacao == "MUL"){
        multiplicacao(primeiroNumero, segundoNumero);
    }else if(operacao == "DIV"){
        divisao(primeiroNumero, segundoNumero);
    }
}