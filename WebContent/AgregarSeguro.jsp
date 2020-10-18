<%@ page import="dominio.SeguroDao" %>
<%@ page import="dominio.Seguro" %>
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

SeguroDao sdao = new SeguroDao();

ArrayList<TipoSeguro> listaTipoSeguros = null;

ArrayList<Seguro> listaSeguros = null;

listaTipoSeguros = tsdao.listarTodosLosSeguros();

listaSeguros = sdao.obtenerTodosLosSeguros();

%>

<%
int IdSeguro = 0;
if(listaSeguros!=null)
for(Seguro seguro : listaSeguros)
{
	if(seguro.getIdSeguro()!=0)
	{
		 IdSeguro = seguro.getIdSeguro();
	}
	else
	{
		IdSeguro = 1;
	}
}

IdSeguro = IdSeguro + 1;
%>



<form action="servletSeguro" method="get">
	
Id Seguro: <%=IdSeguro%> <input type="hidden" name="txtIdSeguro" value=<%=IdSeguro%>> <br>
Descripcion:			<input type="text" name="txtDescripcion"> <br>
Tipo de Seguro:			

	<select name="lblTipoSeguro" id="idTipoSeguro">
	<% 
	if(listaTipoSeguros!=null)
	for(TipoSeguro tiposeguro : listaTipoSeguros)
	{
	%>
	
	<option value=<%=tiposeguro.getId()%>><%=tiposeguro.getTipoSeguro()%></option>
	
	<% } %>
	</select> <br>
Costo contratación:		<input type="text" name="txtCostoContratacion"> <br>
Costo máximo asegurado:	<input type="text" name="txtCostoMaxAsegurado"> <br>
<input type="submit" value="Aceptar" name="btnAceptar">
</form>

</body>
</html>