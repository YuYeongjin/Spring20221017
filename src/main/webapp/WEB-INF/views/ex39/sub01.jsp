<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1> ajax / fecth/ xhr 요청</h1>

  <button id="btn1">버튼1</button>
  <br>
  <button id="btn2">버튼2</button>

  <script>
      const ctx="${pageContext.request.contextPath}";
      document.querySelector("#btn1").addEventListener("click",function (){
          console.log("버튼1번 클릭");
      });
      document.querySelector("#btn2").addEventListener("click",function (){
          console.log("버튼2번 클릭");
          // 첫번째 파라미터 : 요청경로
          fetch(ctx+"/ex39/sub02");
      });

  </script>

</body>
</html>
