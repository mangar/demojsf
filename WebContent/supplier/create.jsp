<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:view>
	<h1>Create a Supplier...</h1>


	<h:form>


		<h:messages id="userMessages" showDetail="true" layout="table" />
		<rich:spacer height="20" />
		<br />
		<hr />

		<h:outputLabel value="Name: " />
		<h:inputText value="#{supplierHandler.supplier.name}" id="_form_name" />
		<rich:spacer height="20" />
		<br />

		<!-- required + validator on handler -->
		<h:outputLabel value="* Email: " />
		<h:inputText required="true"
			validator="#{supplierHandler.validateEmail}"
			value="#{supplierHandler.supplier.email}" id="_form_email">
		</h:inputText>
		<h:message for="_form_email" style="color: darked" />
		<rich:spacer height="20" />
		<br />

		<!-- required on a validator class -->
		<h:outputLabel value="* Email (2): " />
		<h:inputText required="true"
			value="#{supplierHandler.supplier.email2}" id="_form_email2">
			<f:validator validatorId="neb.EmailValidator" />
		</h:inputText>
		<h:message for="_form_email2" style="color: darked" />
		<rich:spacer height="20" />
		<br />

		<h:outputLabel value="City: " />
		<h:inputText value="#{supplierHandler.supplier.city}" id="_form_city" />
		<rich:spacer height="20" />
		<br />

		<h:outputLabel value="* Credit Card: " />
		<h:inputText required="true"
			value="#{supplierHandler.supplier.cc.number}" id="_form_creditcard"
			requiredMessage="Valor Obrigatório (requiredMessage)"
			converterMessage="Erro de conversao (converterMessage)"
			validatorMessage="Valor Invalido (validatorMessage)">
			<f:validateLength minimum="16" maximum="16" />
		</h:inputText>
		<h:message for="_form_creditcard" style="color: darked" />
		<rich:spacer height="20" />
		<br />


		<!-- converter usage... -->
		<h:outputLabel value="Age: " />
		<h:inputText value="#{supplierHandler.supplier.age}"
			id="_form_age" maxlength="10">
			<f:converter converterId="javax.faces.Short" />
		</h:inputText>
		<h:message for="_form_age" />
		<rich:spacer height="20" />
		<br />




		<h:outputLabel value="Zip Code: " />
		<h:inputText value="#{supplierHandler.supplier.zipCode}"
			id="_form_zipcode" maxlength="10">
		</h:inputText>
		<h:message for="_form_zipcode" />
		<rich:spacer height="20" />
		<br />

		<!-- converter for number (money) -->
		<h:outputLabel value="Salary: " />
		<h:inputText value="#{supplierHandler.supplier.salary}"
			id="_form_salary" maxlength="10">
			<f:convertNumber maxFractionDigits="2" groupingUsed="true"
				 currencySymbol="" maxIntegerDigits="7" type="currency"  />
		</h:inputText>
		<h:message for="_form_salary" />
		<rich:spacer height="20" />
		<br />

		<!-- converter for datetime field.. -->
		<h:outputLabel value="Date Start: " />
		<h:inputText value="#{supplierHandler.supplier.dateStart}"
			id="_form_date_start" maxlength="10">
			<f:converter converterId="neb.DateConverter"/>
		</h:inputText>
		<h:message for="_form_date_start" />
		<rich:spacer height="20" />
		<br />


		<h:outputLabel value="Phone: " />
		<h:inputText value="#{supplierHandler.supplier.phone}"
			id="_form_phone">
			<f:converter converterId="neb.PhoneNumberConverter"/>
		</h:inputText>
		<h:message for="_form_phone" />
		<rich:spacer height="20" />
		<br />



		<h:commandButton value="Create" action="#{supplierHandler.doSave}" />
	</h:form>

	<hr />

	<div>
		<h:outputLabel value="#{supplierHandler.message}" />
	</div>
	<jsp:include page="list.jsp" />

</f:view>
</body>
</html>