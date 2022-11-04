<%--
  Created by IntelliJ IDEA.
  User: 82104
  Date: 2022-11-03
  Time: 오후 3:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<button id="btn1"></button>
<button id="btn5">5</button>
<button id="btn6">6</button>
<button id="btn8">8</button>
<button id="btn9">9</button>
<button id="btn10">10</button>
<button id="btn14">14</button>
<script>
    const ctx = "${PageContext.request.ContextPath}";
    document.querySelector("#btn14").addEventListener("click",function (){
        fetch(ctx+"/ex45/sub14");
    });
    document.querySelector("#btn1").addEventListener("click",function (){
        fetch(ctx+"/ex45/sub03");
    });
    document.querySelector("#btn5").addEventListener("click",function (){
        fetch(ctx+"/ex45/sub05");
    });
    document.querySelector("#btn6").addEventListener("click",function (){
        fetch(ctx+"/ex45/sub06");
    });
    document.querySelector("#btn8").addEventListener("click",function (){
        fetch(ctx+"/ex45/sub08");
    });
    document.querySelector("#btn9").addEventListener("click",function (){
        fetch(ctx+"/ex45/sub09");
    });
    document.querySelector("#btn10").addEventListener("click",function (){
        fetch(ctx+"/ex45/sub10");
    });
</script>
</body>
</html>
