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
 
<form action="" method="">
Descripcion:			<input type="text" name="txtDescripcion"> <br>
Tipo de Seguro:			<input type="text" name="txtTipoSeguro"> <br>
Costo contratación:		<input type="text" name="txtCostoContratacion"> <br>
Costo máximo asegurado:	<input type="text" name="txtCostoMaxAsegurado"> <br>
<input type="submit" value="Aceptar" name="btnAceptar">
</form>


</body>
</html>