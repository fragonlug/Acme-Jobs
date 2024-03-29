
package acme.features.sponsor.noncomercialbanner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.noncomercialbanner.Noncomercialbanner;
import acme.entities.roles.Sponsor;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;

@Controller
@RequestMapping("/sponsor/noncomercialbanner/")
public class SponsorNoncomercialbannerController extends AbstractController<Sponsor, Noncomercialbanner> {

	@Autowired
	private SponsorNoncomercialbannerListService	listService;

	@Autowired
	private SponsorNoncomercialbannerShowService	showService;


	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
	}
}
