armazenaValor();
async function armazenaValor() {
    var estoqueProduto = document.querySelector('#estoqueProduto tbody');
    var produtos = await carregaProduto();
    var jsonProdutos = JSON.parse(produtos);
    html = '';
    for (var elemento of jsonProdutos) {
        html += `<tr>`;
        html += `<td>${elemento.idProduto}</td>`;
        html += `<td>${elemento.nomeProduto}</td>`;
        html += `<td>R$ ${((elemento.precoProduto).toFixed(2)).toString().replace('.', ',')}</td>`;
        html += `<td>${elemento.quantidadeProduto}</td>`;
        html += `</tr>`
    }

    estoqueProduto.innerHTML = html;
}

async function carregaProduto() {
    try {
        var host = window.location.host;
        var protocol = window.location.protocol;
        var url = '';

        if (host[host.length - 1] == "/") {
            url = protocol + "//" + host + "xNexus-java-sports/EstoqueProdutoServlet";

        } else {
            url = protocol + "//" + host + "/xNexus-java-sports/EstoqueProdutoServlet";
        }

        var listaProdutos = await fetch(url);
        return listaProdutos.text();

    } catch (error) {
        console.log('Houve um erro');
    }

}


