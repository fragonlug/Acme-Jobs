
package acme.features.authenticated.messagethread;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.messagethreads.Messagethread;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.entities.Principal;
import acme.framework.entities.UserAccount;
import acme.framework.services.AbstractShowService;

@Service
public class AuthenticatedMessagethreadShowService implements AbstractShowService<Authenticated, Messagethread> {

	@Autowired
	AuthenticatedMessagethreadRepository repository;


	@Override
	public boolean authorise(final Request<Messagethread> request) {
		assert request != null;

		boolean result = false;
		int messagethreadId;
		Messagethread messagethread;
		UserAccount user;
		Principal principal;

		messagethreadId = request.getModel().getInteger("id");
		messagethread = this.repository.findOneMessagethreadById(messagethreadId);
		for (UserAccount ua : messagethread.getUsers()) {
			user = ua;
			principal = request.getPrincipal();
			if (user.getId() == principal.getAccountId()) {
				result = true;
			}

		}
		return result;
	}

	@Override
	public void unbind(final Request<Messagethread> request, final Messagethread entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "moment", "users", "messages");
	}

	@Override
	public Messagethread findOne(final Request<Messagethread> request) {
		assert request != null;

		Messagethread result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneMessagethreadById(id);
		return result;
	}

}
