
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>

<div id="content">

	<h2>Selecione uma categoria</h2>

	<form method="post">
		<table>
			<tr>
				<td>Preço:</td><td>${venda.preco}</td>
			</tr>
			<tr>
				<td>Número de Itens:</td><td>${venda.numeroItens}</td>
			</tr>
			<tr>
				<td>Categoria:</td>
				<td>
					<form:select path="venda.categoria">
						<form:option value="">Nenhuma (2% de desconto)</form:option>
						<form:option value="A">Cat. A (10% de desconto quando for mais que 100 itens)</form:option>
						<form:option value="B">Cat. B (20% de desconto quando for mais que 200 itens)</form:option>
					</form:select>
				</td>
			</tr>
			<tr>
				<td>Necessita entrega?:</td>
				<td>
					<form:checkbox path="venda.entrega"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Próximo Passo" name="_eventId_submit"/>
				</td>
			</tr>
		</table>
	</form>
</div>

</body>
</html>