<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>

<div id="content">

	<h2>Informe os dados da entrega</h2>
	<hr/>
	
	<form method="post">
		<table>
			<tr>
				<td>Preço:</td><td>${venda.preco}</td>
			</tr>
			<tr>
				<td>Número de Itens:</td><td>${venda.numeroItens}</td>
			</tr>
			<tr>
				<td>Categoria:</td><td>${venda.categoria}</td>
			<tr>
				<td>Entrega:</td><td>${venda.entrega}</td>
			</tr>
			<tr>
				<td>Tipo Entrega:</td>
				<td>
					<form:select path="venda.tipoEntrega">
						<form:option value="S">Simples (custo extra: 10)</form:option>
						<form:option value="E">Expressa (custo extra: 20)</form:option>
					</form:select>
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