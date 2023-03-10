<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<%--@elvariable id="idealWeight" type="java"--%>
<html>
<head>
    <title>Peso-Ideal</title>
</head>
<body>
<h1>Peso Ideal</h1>
<form name="personDataForm" action="calculo" method="POST">
    <table>
        <tr>
            <td><p>Seu sexo:</p></td>
            <td>
                <input type="radio" name="gender" id="female" value="F"/>
                <label for="female">Feminino:</label>
                <input type="radio" name="gender" id="male" value="M"/>
                <label for="male">Masculino</label>
            </td>
        </tr>
        <tr>
            <td><label for="height">Sua altura (m) :</label></td>
            <td><input type="text" name="height" id="height"/></td>
        </tr>
        <tr>
            <th><input type="submit" value="Enviar" name="find"/></th>
            <th><input type="reset" value="Limpar" name="reset"/></th>
        </tr>
    </table>
    <%--    <h2>${idealWeight}</h2>--%>
    <h2>Peso Ideal: ${idealWeight}</h2>
</form>
</body>
</html>