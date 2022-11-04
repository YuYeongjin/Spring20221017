<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>fetch 요청 방식 변경</h1>
  <button id="btn1">/ex40/sub01 get 방식 요청</button>
  <br>
    <button id="btn2">/ex40/sub02 get방식 요청 + 옵션</button>
</body>
<script>
  const ctx ="${pageContext.request.contextPath}";
  document.querySelector("#btn2").addEventListener("click",function (){
        // fetch의 2번째 파라미터는 option(object)
      fetch(ctx+"/ex40/sub02",{method:"post"});
  });


  document.querySelector("#btn1").addEventListener("click",function (){
    // 아무 옵션도 주지 않으면 get방식
    fetch(ctx+"/ex40/sub02");
  })
</script>
</html>
