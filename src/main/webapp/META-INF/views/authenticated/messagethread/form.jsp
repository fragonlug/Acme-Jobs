<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textarea code="authenticated.messagethread.form.label.title" path="title"/>
	<acme:form-moment code="authenticated.messagethread.form.label.moment" path="moment"/>
	<acme:form-textarea code="authenticated.messagethread.form.label.usernames" path="usernames"/>
	<acme:form-textarea code="authenticated.messagethread.form.label.message" path="message"/>


	<acme:form-return code="authenticated.messagethread.form.label.button.return"/>
    <acme:form-submit code="authenticated.messagethread.form.button.message" action="/authenticated/messagethread/message/list_mine"/>
	
</acme:form>