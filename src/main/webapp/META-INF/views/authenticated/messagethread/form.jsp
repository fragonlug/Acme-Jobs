<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textarea code="authenticated.messagethread.form.label.title" path="title"/>
	<acme:form-moment code="authenticated.messagethread.form.label.moment" path="moment"/>
		<jstl:forEach items="${users}" var="item">
		<td>${item}
		<td>
	</jstl:forEach>
	<jstl:forEach items="${messages}" var="item">
		<td>${item}
		<td>
	</jstl:forEach>

	<acme:form-return code="authenticated.messagethread.form.label.button.return"/>
</acme:form>