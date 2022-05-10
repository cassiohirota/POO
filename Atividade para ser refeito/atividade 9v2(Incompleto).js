
var itens = [""];
var num1 = parseInt(document.getElementById('valor1').value);
var num2 = parseInt(document.getElementById('valor2').value);
var num3 = parseInt(document.getElementById('valor3').value);

    function maiorNum (num1, num2, num3){
        var maior;

        maior = num1;        
        if(num2 > maior)
            maior = num2;
        if(num3 > maior)
            maior = num3;
    
        alert("Maior valor: " + maior.value);
    }



function ordenar(){
    itens.push(num1);
    itens.push(num2);
    itens.push(num3);
    itens.sort(function(a, b){return a-b})
    alert(itens);
}

