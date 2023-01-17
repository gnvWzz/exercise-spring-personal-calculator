<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/calculate" method="post">
    <h1>Calculator</h1>
    <label>
        <input type="number" name="firstNum" placeholder="Enter first number">
        <input type="number" name="secondNum" placeholder="Enter second number">
    </label>
    <br>
    <br>
    <label>
        <input type="submit" name="operator" value="Addition(+)">
        <input type="submit" name="operator" value="Subtraction(-)">
        <input type="submit" name="operator" value="Multiplication(X)">
        <input type="submit" name="operator" value="Division(/)">
    </label>
</form>
<br>
<br>
<p>Result: ${result}</p>
</body>
</html>