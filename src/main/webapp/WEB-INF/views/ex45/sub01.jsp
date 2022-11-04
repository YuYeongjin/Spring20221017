<%--
  Created by IntelliJ IDEA.
  User: 82104
  Date: 2022-11-03
  Time: 오후 3:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<button id="btn1"></button>
<script>
    const ctx = "${PageContext.request.ContextPath}";
document.querySelector("#btn1").addEventListener("click",function (){
    fetch(ctx+"/ex45/sub03")

})
</script>
</body>
</html>
