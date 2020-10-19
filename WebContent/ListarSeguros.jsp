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
 
 <h1>"Tipo de seguros de la base de datos"</h1>
 
 <form>
 Busqueda por tipo de Seguros: <input type="submit" name="drpNombre" value="Filtrar"></input>
 </form>
 
 
 <table border="1">
	<tr><th>ID Seguro</th> <th>Descripcion seguro</th> <th>Descripcion tipo seguro</th> <th>Costo Contratacion</th>  <th>Costo máximo asegurado</th></tr>
	<% 
	if(listaSeguros!=null)
	for(Seguro seguro : listaSeguros)
	{
	%>
	<tr> <td><%=seguro.getIdSeguro()%></td> <td><%=seguro.getDescripcion()%></td> <td><%=seguro.getIdTipo() %></td> <td><%=seguro.getCostoContratacion()%></td> <td><%=seguro.getCostoMaximoAsegurado() %></td></tr>
	<% } %>
</table>


</body>
</html>