<%--
  Created by IntelliJ IDEA.
  User: 82104
  Date: 2022-11-04
  Time: 오전 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        #messageDiv {
            padding : 15px;
            position: fixed;
            top: 0px;
            left: 0px;
            background-color: yellow;
            border: 5px solid black;
            font-weight: bold;
        }
    </style>
</head>
<body>
<h1>응답처리</h1>
<div id="messageDiv"></div>
<button id="btn1">버튼1</button>
<button id="btn2">버튼2</button>
<button id="btn3">버튼3</button>
<button id="btn4">버튼4</button>


<form action="" method="post" >
    <input type="text" name="idCustomer">
    <button id="btn5">버튼5</button>
</form>


<script>
    const ctx = "${pageContext.request.contextPath}"

    document.querySelector("#btn5").addEventListener("click", function () {
        const id =document.querySelector("idCustomer").value;
        fetch(ctx + "/ex47/sub05/"+id,{
            method: "delete"
        })
            .then((res) => res.json())
            .then((data) => {
                document.querySelector("#messageDiv").innerText = data.message;
            });
    });
    document.querySelector("#btn4").addEventListener("click", function () {
        fetch(ctx + "/ex47/sub04")
            .then((res) => res.json())
            .then((cus) => {
                console.log("id",cus.id());
                console.log("name",cus.name());
            });
    });
    document.querySelector("#btn3").addEventListener("click", function () {
        fetch(ctx + "/ex47/sub02")
            .then((res) => res.json())
            .then((data) => {
                console.log(data.color[0]);
                console.log(data.color[1]);
                console.log(data.name);
            });
    });
    document.querySelector("#btn2").addEventListener("click", function () {
        fetch(ctx + "/ex47/sub01")
            .then(res => res.json())
            .then((data) => {
                console.log(data.name);
                console.log(data.address);
            });
    });
    document.querySelector("#btn1").addEventListener("click", function () {
        fetch(ctx + "/ex47/sub01")
            .then(res => res.json())
            .then(data => console.log(data));
    });
</script>
</body>
</html>
