<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%
	String nomeEmpresa = (String)request.getAttribute("empresa");
	System.out.println(nomeEmpresa);
%>

</head><body>
	Empresa <%= nomeEmpresa %> cadastrada com sucesso!
</body></html>