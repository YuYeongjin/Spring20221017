<%--
  Created by IntelliJ IDEA.
  User: 82104
  Date: 2022-11-02
  Time: 오전 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<button id="btn1">헤더추가</button>
<button id="btn2">헤더추가</button>
<button id="btn4">헤더변경</button>
<button id="btn5">헤더</button>
<form action=""id="form1"><input type="text"><input type="text"></form>

<script>
    const ctx = "${pageContext.request.contextPath}";
    document.querySelector("#btn5").addEventListener("click", function (){
        fetch(ctx+"/ex41/sub02?email=svvo2002@naver&age=29");
    });
    document.querySelector("#btn1").addEventListener("click", function (){
      fetch(ctx+"/ex41/sub01",{
        method : "get",
        headers : {MyHeader : "My Header Value"}
      });
    });

    document.querySelector("#btn2").addEventListener("click", function (){
        fetch(ctx+"/ex41/sub02",{
            method : "get",
            headers : {"MyHeader" : "My Header Value"}
        });
    });
    document.querySelector("#btn4").addEventListener("click", function (){
        fetch(ctx+"/ex41/sub04",{
            method : "get",
            headers : {
                "MyHeader" : "My Header Value"
                "Accept" :
            }
        });
    });


</script>
</body>
</html>
