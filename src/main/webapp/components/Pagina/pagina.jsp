<h1>Contato cadastrado com sucesso</h1>
<section>
<p>Nome: <strong><%= request.getAttribute("nome")%></strong></p>
<p>Sobrenome: <strong><%= request.getAttribute("sobrenome")%></strong></p>
<p>Telefone: <strong><%= request.getAttribute("telephone")%></strong></p>

<input type="button" value="retornar" onclick="history.back()">
</section>



