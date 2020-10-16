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
 
 <h1>"Tipo de seguros de la base de datos"</h1>
 
 <form>
 Busqueda por tipo de Seguros: <input type="submit" name="drpNombre" value="Filtrar"></input>
 </form>
 
 
 <table border="1">
	<tr><th>ID Seguro</th> <th>Descripcion seguro</th> <th>Descripcion tipo seguro</th> <th>Costo Contratacion</th>  <th>Costo máximo asegurado</th></tr>
</table>
</body>
</html>