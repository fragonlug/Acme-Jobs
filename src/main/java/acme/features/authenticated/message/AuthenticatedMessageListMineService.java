
package acme.features.authenticated.message;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.messages.Message;
import acme.entities.messagethreads.Messagethread;
import acme.features.authenticated.messagethread.AuthenticatedMessagethreadRepository;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.entities.Principal;
import acme.framework.services.AbstractListService;

@Service
public class AuthenticatedMessageListMineService implements AbstractListService<Authenticated, Message> {

	@Autowired
	AuthenticatedMessageRepository			repository;

	@Autowired
	AuthenticatedMessagethreadRepository	repository2;


	@Override
	public boolean authorise(final Request<Message> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<Message> request, final Message entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "moment");

	}

	@Override
	public Collection<Message> findMany(final Request<Message> request) {
		assert request != null;

		Collection<Message> result = null;

		Principal principal;

		principal = request.getPrincipal();

		Collection<Messagethread> Messagethread = this.repository2.findManybyUser(principal.getAccountId());
		for (Messagethread mt : Messagethread) {
			if (request.getModel().getInteger("id") == mt.getId()) {
				result = this.repository.findMessagebyMessagethread(mt.getId());
			}
		}

		return result;
	}

}
