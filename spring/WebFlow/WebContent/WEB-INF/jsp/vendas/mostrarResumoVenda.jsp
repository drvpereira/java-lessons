
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>

<div id="content">
	<h2>Resumo da Venda</h2>
	<hr>
	<table>
	<tr>
		<td>Preço:</td><td>${venda.preco}</td>
	</tr>
	<tr>
		<td>Número de Itens:</td><td>${venda.numeroItens}</td>
	</tr>
	<tr>
		<td>Categoria:</td><td>${venda.categoria}</td>
	</tr>
	<tr>
		<td>Entrega:</td>
		<c:choose>
			<c:when test="${venda.entrega}">
				<td>${venda.tipoEntrega}</td>
			</c:when>
			<c:otherwise>
				<td>Entrega desnecessária: o cliente irá buscar os produtos</td>
			</c:otherwise>
		</c:choose>
	</tr>
	<tr>
		<td colspan="2"></td>
	</tr>
	<tr>
		<td>Valor Total:</td><td>${venda.valorTotal}</td>
	</tr>
	<tr>
		<td>Custo da Entrega:</td><td>${venda.custoEntrega}</td>
	</tr>
	<tr>
		<td>Descontos:</td><td>${venda.descontos} (Taxa de desconto: ${venda.taxaDesconto})</td>
	</tr>
	<tr>
		<td colspan="2"><hr></td>
	</tr>
	<tr>
		<td><b>Custo total</b>:</td><td>${venda.custoTotal}</td>
	</tr>
	<tr>
		<td colspan="2">
			<form action="<c:url value="/index.jsp"/>">
				<input type="submit" value="Início">
			</form>
		</td>
	</tr>
	</table>
</div>

</body>
</html>