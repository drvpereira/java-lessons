<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>

<form action="${pageContext.request.contextPath}/app/mensagens/enviar">

Mensagem: <input name="mensagem"/> <br/>
Canais:
<c:forEach var="canal" items="${ canais }">
	<input type="checkbox" name="${ canal.nome }"/> ${ canal.nome }
</c:forEach> <br/>
<input type="submit" value="Enviar"/>
</form>

<script type="text/javascript">
$('input[type="checkbox"]').change(function() {
	$.get('${pageContext.request.contextPath}/app/mensagens/selecionar', { 
		nome: $(this).attr('name'),
		ativo: $(this).attr('checked') 
	});
})
</script>