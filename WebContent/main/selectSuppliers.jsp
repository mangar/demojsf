<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Select a Supplier</title>
</head>
<body>

<center>
<h1>Select the Supplier....</h1>
</center>

<f:view>
	<h:form>
		<h:selectOneMenu id="suppliers">
			<f:selectItems value="#{loginHandler.suppliers}" />
		</h:selectOneMenu>
		<h:commandButton value="Select" action="#{loginHandler.doSupplierSelected}" />
	</h:form>

	<hr />

	<h:dataTable border="1" value="#{loginHandler.suppliersVO}" var="supplier">
		<h:column>
			<f:facet name="header">
				<h:outputText value="ID" />
			</f:facet>
			<h:outputText value="#{supplier.id}" />
		</h:column>

		<h:column>
			<f:facet name="header">
				<h:outputText value="Name" />
			</f:facet>
			<h:outputText value="#{supplier.name}" />
		</h:column>

		<h:column>
			<f:facet name="header">
				<h:outputText value="City" />
			</f:facet>
			<h:outputText value="#{supplier.city}" />
		</h:column>

		<h:column>
			<f:facet name="header">
				<h:outputText value="State" />
			</f:facet>
			<h:outputText value="#{supplier.state}" />
		</h:column>

		<h:column>
			<f:facet name="header">
				<h:outputText value="Action" />
			</f:facet>
			<a4j:form reRender="out">
				<a4j:commandButton value="Select..." reRender="out2">
					<a4j:actionparam name="supplier_id" value="#{supplier.id}" assignTo="#{loginHandler.user.supplier.id}" />
					<a4j:actionparam name="supplier_name" value="#{supplier.name}" assignTo="#{loginHandler.user.supplier.name}" />
				</a4j:commandButton>
			</a4j:form>
		</h:column>
	</h:dataTable>


	Ordem de execucao: 
	<a4j:form>
		<a4j:commandButton value="DeSelect Supplier..." reRender="out2">
			<a4j:actionparam  value="" assignTo="#{loginHandler.user.supplier.id}" />
		</a4j:commandButton>
	</a4j:form>


	<hr />

	<h:form>
	<a4j:outputPanel id="out2">
		<h:outputText rendered="#{not empty loginHandler.user.supplier.id}" value="Approved Text: #{loginHandler.user.supplier.id}" />
		<h:commandButton rendered="#{not empty loginHandler.user.supplier.id}" value="Confirm" action="#{loginHandler.doSupplierSelected}" />
	</a4j:outputPanel>
	</h:form>


</f:view>


</body>
</html>