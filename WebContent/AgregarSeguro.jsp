<%@ page import="dominio.SeguroDao" %>
<%@ page import="dominio.TipoSeguro" %>
<%@ page import="dominio.TipoSeguroDao" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <a href="Inicio.jsp">Inicio </a>
 <a href="AgregarSeguro.jsp"> Agregar Seguro</a>
 <a href="ListarSeguros.jsp"> Listar Seguros</a>

<% 

TipoSeguroDao tsdao = new TipoSeguroDao();

ArrayList<TipoSeguro> listaTipoSeguros = null;

listaTipoSeguros = tsdao.listarTodosLosSeguros();

%>

 
<form action="" method="">

Tipo de Seguro:			

	<select name="Tipo de Seguro" id="idTipoSeguro">
	<% 
	if(listaTipoSeguros!=null)
	for(TipoSeguro tiposeguro : listaTipoSeguros)
	{
	%>
	
	<option value=<%=tiposeguro.getId()%>><%=tiposeguro.getTipoSeguro()%></option>
	
	<% } %>
	</select> <br>
	

Descripcion:			<input type="text" name="txtDescripcion"> <br>
Tipo de Seguro:			<input type="text" name="txtTipoSeguro"> <br>
Costo contratación:		<input type="text" name="txtCostoContratacion"> <br>
Costo máximo asegurado:	<input type="text" name="txtCostoMaxAsegurado"> <br>
<input type="submit" value="Aceptar" name="btnAceptar">
</form>

</body>
</html>