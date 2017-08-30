
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>

<div id="content">

	<h2>Informe o pre�o e o n�mero de Itens</h2>
	<hr/>
	
	<form method="post">
		<table>
			<tr>
				<td>Pre�o:</td>
				<td>
					<form:input path="venda.preco"/>
				</td>
			</tr>
			<tr>
				<td>N�mero de Itens:</td>
				<td>
					<form:input path="venda.numeroItens"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" name="_eventId_submit" value="Pr�ximo Passo"/>
				</td>
			</tr>
		</table>
	</form>
</div>

</body>
</html>