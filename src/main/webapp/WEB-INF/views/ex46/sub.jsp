<%--
  Created by IntelliJ IDEA.
  User: 82104
  Date: 2022-11-04
  Time: 오전 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>응답</h1>
  <button id="btn1">ex46/sub01</button>

  <script>
    const ctx = "${pageContext.request.contextPath}";
    document.querySelector("#btn1").addEventListener("click",function (){
     console.log("페치와 상관없는 코드");
        fetch(ctx+"/ex46/sub01").then(function (){
            console.log("페치와 있는코드");
        });

        console.log("페치와 상관없는 코드");
    });
  </script>

</body>
</html>
