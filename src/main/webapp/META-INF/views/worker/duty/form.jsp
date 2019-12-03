<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textarea code="worker.duty.form.label.jobTitle" path="jobTitle"/>
	<acme:form-integer code="worker.duty.form.label.jobId" path="jobId"/>
	
	<acme:form-textarea code="worker.duty.form.label.title" path="title"/>
	<acme:form-textbox code="worker.duty.form.label.percentage" path="percentage"/>
	<acme:form-textarea code="worker.duty.form.label.description" path="description"/>
	


	<acme:form-return code="worker.job.form.label.button.return"/>
</acme:form>