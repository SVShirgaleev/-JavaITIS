<%--
  Created by IntelliJ IDEA.
  User: salavatshirgaleev
  Date: 01.04.16
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<%if (request.getParameter("action").equals("symbols")) {%>
Number of symbols:  ${symbols}
<%}%>

<%if (request.getParameter("action").equals("word")) {%>
Number of words ${word}
<%}%>

<%if (request.getParameter("action").equals("sentence")) {%>
Number of sentences ${sentence}
<%}%>

<%if (request.getParameter("action").equals("paragraph")) {%>
Number of paragraphs ${paragrph}
<%}%>
</body>
</html>
