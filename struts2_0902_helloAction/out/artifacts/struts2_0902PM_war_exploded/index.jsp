<%--
  Created by IntelliJ IDEA.
  User: linqiliang
  Date: 2018/9/2
  Time: 下午1:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Struts的入门</title>
</head>
<body>
  <%-- in struts2, filter will filt .aciton requsts ,other ,if --%>
  <a href = "${pageContext.request.contextPath}/action1">action1</a>
  <br>
  <a href = "${pageContext.request.contextPath}/action2">action2</a>
  <br>
  <a href = "${pageContext.request.contextPath}/action3">action3</a>
  <br>
  <a href = "${pageContext.request.contextPath}/captchaaction">captchaaction</a>
</body>
</html>
