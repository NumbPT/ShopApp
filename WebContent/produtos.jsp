<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, model.Produto"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Gestao de produtos</title>
</head>
<body>

<h1>Adicionar Produto</h1>

<form action="HProduto" method="post">
	<label>Nome : <input type="text" name="nome"></label><br>
	<label>Quantidade : <input type="number" name="qtd"></label><br>
	<label>Preco : <input type="number" name="preco">€</label><br><br> 
	
	
	<input type="submit" value="Enviar"/><br><br>
</form>


<h1>Lista de Produtos</h1>
<table border=1>
	<tr>
		<th>Nome de Produto </th>
		<th>Quantidade </th>
		<th>Pre&ccedil;o(€) </th>
	</tr>
	<%
	double total=0;
		//Buscar o ArrayList
		ArrayList<Produto> prods = (ArrayList) request.getAttribute("listaProdutos");
	if(prods != null) {
		
			for(Produto p : prods) {
				total += p.getQuantidade() * p.getPreco();
				out.append("<tr><td>"+ p.getNome() +
						   "</td><td>" +  p.getQuantidade() + "</td><td>" +
						p.getPreco() +
						"</td></tr>");
			}
	}
		//Ciclo for, mostra cada produto
		
	
	%>
	
	<p> Total : <% out.append(String.valueOf(total)); %></p>
	
</table>

</body>
</html>