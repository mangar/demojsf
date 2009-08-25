<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-tiles"
	prefix="tiles"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Title (template.jsp)</title>
</head>
<body>
<f:view>
	<f:loadBundle basename="br.com.neb.resource.MessageResources" var="msg"/>	
	<tiles:insert attribute="header" flush="false" />
	<br />
	<tiles:insert attribute="content" flush="false" />
	<br />
	<tiles:insert attribute="footer" flush="false" />
</f:view>
</body>
</html>