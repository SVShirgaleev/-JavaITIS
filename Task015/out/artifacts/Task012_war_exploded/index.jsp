<%--
  Created by IntelliJ IDEA.
  User: salavatshirgaleev
  Date: 31.03.16
  Time: 23:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method='post' action='/process'>
    <label>
        <textarea rows='5' cols='50' name='text'></textarea>
    </label>

    <br/>

    <div align='left'>
        <label>
            <select name='action'>
                <option value='symbols'> Number of symbols</option>
                <option value='word'> Number of words</option>
                <option value='sentence'> Number of sentences</option>
                <option value='paragraph'> Number of paragraphs</option>
            </select>
        </label>
        <input type='submit' value='Process'/>
    </div>
</form>


  </body>
</html>
