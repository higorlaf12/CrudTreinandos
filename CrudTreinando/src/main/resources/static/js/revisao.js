
function exibeNome (){
    var elNome = document.getElementById("txtNome");
    var strNome = elNome.value;
    var elDisplay = document.getElementById("display");
    elDisplay.innerText =strNome;

    //console.log(strNome);

}

function novoContato() {
    var elListaContatos = document.getElementById("listaContatos");
    var inputContato = document.createElement("input");
    inputContato.setAttribute("name","txtContato");

    var labelContato = document.createElement("label");
    labelContato.innerText="Contato:";
    
    var labelQuebra = document.createElement("br");

    var btnExc = document.createElement("input");
    btnExc.setAttribute("type","button");
    btnExc.setAttribute("value","-");
    btnExc.onclick= function () {
        // window.alert("clicou no excluir");
        // elListaContatos.removeChild(labelContato);
        //elListaContatos.removeChild(inputContato);
        //elListaContatos.removeChild(labelQuebra);
        elListaContatos.removeChild(divLinha);


    };


    var divLinha = document.createElement("div");

    divLinha.appendChild(labelContato);
    divLinha.appendChild(inputContato);
    divLinha.appendChild(btnExc);
    divLinha.appendChild(labelQuebra);

    elListaContatos.appendChild(divLinha);
}
function  imprimirDados() {
       var arryContatos = document.fromContato.txtContato;

       var saidaContatos = document.getElementById("saidaContatos");
       var saida="";
       for(i = 0; i <arryContatos.length;i++){
           saida += arryContatos[i].value +"<br>";
       }
       saidaContatos.innerHTML = saida;
}