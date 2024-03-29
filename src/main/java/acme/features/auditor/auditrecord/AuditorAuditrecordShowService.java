
package acme.features.auditor.auditrecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.auditrecord.Auditrecord;
import acme.entities.roles.Auditor;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Principal;
import acme.framework.services.AbstractShowService;

@Service
public class AuditorAuditrecordShowService implements AbstractShowService<Auditor, Auditrecord> {

	@Autowired
	AuditorAuditrecordRepository repository;


	@Override
	public boolean authorise(final Request<Auditrecord> request) {
		assert request != null;

		boolean result;
		int AuditrecordId;
		Auditrecord Auditrecord;
		Auditor auditor;
		Principal principal;

		AuditrecordId = request.getModel().getInteger("id");
		Auditrecord = this.repository.findOneAuditrecordById(AuditrecordId);
		auditor = Auditrecord.getJob().getAuditor();
		principal = request.getPrincipal();
		result = Auditrecord.getJob().isFinalMode() || !Auditrecord.getJob().isFinalMode() && auditor.getId() == principal.getActiveRoleId();
		return result;
	}

	@Override
	public void unbind(final Request<Auditrecord> request, final Auditrecord entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "status", "moment", "body");
	}

	@Override
	public Auditrecord findOne(final Request<Auditrecord> request) {
		assert request != null;

		Auditrecord result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneAuditrecordById(id);
		return result;
	}

}
