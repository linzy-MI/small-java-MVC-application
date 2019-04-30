<%@page import="java.util.*" %>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<h1 align="center"> fruit selection recommendations JSP</h1>
<%
    List<String> choices=(List<String>)request.getAttribute("styles");
	Iterator it=choices.iterator();
	out.println("<br>there are many choices:");
	while(it.hasNext())
	{
		out.println("<br>"+it.next());
	}
%>
</body>
</html>