
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String Path=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";   %>
<html>
<head>
    <base href="<%=Path%>">
    <title>欢迎页面</title>

</head>
<body>

      <form action="student/commit.do" method="post">
          <table>
              名字<input type="text" name="name"><br>
              id<input type="text" name="id"><br>
              email<input type="text" name="email"><br>
              age<input type="text" name="age"><br>
              <input type="submit" value="提交">
          </table>
      </form>




</body>
</html>
