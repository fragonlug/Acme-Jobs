<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textarea code="authenticated.messagethread.form.label.title" path="title"/>
	<acme:form-moment code="authenticated.messagethread.form.label.moment" path="moment"/>
	<acme:form-textarea code="authenticated.messagethread.form.label.usernames" path="usernames"/>
	<acme:form-textarea code="authenticated.messagethread.form.label.message" path="message"/>
	<jstl:set var="id" value="${id}"/>
	<acme:menu-suboption code="authenticated.messagethread.form.label.listMessage" action="/authenticated/message/list_mine?id=${id}"/>

	<acme:form-return code="authenticated.messagethread.form.label.button.return"/>
	
		
</acme:form>