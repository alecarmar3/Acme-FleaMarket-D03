<%--
- form.jsp
-
- Copyright (c) 2019 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="authenticated.figment.label.title" path="title"/>
	<acme:form-textbox code="authenticated.figment.label.inventor-name" path="inventorName"/>
	<acme:form-textbox code="administrator.figment.label.text-piece" path="textPiece"/>
	<acme:form-integer code="authenticated.figment.label.price-min" path="priceMin"/>
	<acme:form-integer code="authenticated.figment.label.price-max" path="priceMax"/>
	
  	<acme:form-return code="authenticated.figment.button.return"/>
  	
	
</acme:form>
