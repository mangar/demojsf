<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-tiles"
	prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<f:view>

	<table>
		<tr>
			<td>
			<f:subview id="header">
				<tiles:insert attribute="header" flush="false" />
			</f:subview>
			</td>
		</tr>
		<tr>
			<td>
			<f:subview id="content">
				<tiles:insert attribute="content" flush="false" />
			</f:subview>			
			</td>
		</tr>
		<tr>
			<td>
			<f:subview id="footer">
				<tiles:insert attribute="footer" flush="false" />
			</f:subview>			
			</td>
		</tr>
	</table>


</f:view>

</body>
</html>