<%--
  Created by IntelliJ IDEA.
  User: linqiliang
  Date: 2018/9/2
  Time: 下午2:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
 <form action="" method="post">
     用户名：<input type="text" name="username"/><br/>
     密码：<input type="text" name="password"/><br/>
     验证码：<input type="text" name="validatecode"/>
     <img src="${pageContext.request.contextPath}/captchaaction"/>
     <input type="submit" value="登录"/>
 </form>
</body>
</html>
