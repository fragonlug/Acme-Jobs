
package acme.entities.jobs;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.entities.roles.Auditor;
import acme.entities.roles.Employer;
import acme.framework.datatypes.Money;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Job extends DomainEntity {

	// Serialisation Identifier -------------------------------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Atributes ----------------------------------------------------------------------------------

	@Column(unique = true)
	@NotBlank
	@Length(min = 5, max = 10)
	//@Pattern(regexp = "^[a-zA-Z]{4}[-][a-zA-Z]{4}$")
	private String				reference;

	@NotBlank
	private String				title;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date				deadline;

	@NotNull
	@Valid
	private Money				salary;

	@URL
	private String				moreInfo;

	private boolean				finalMode;

	/*
	 * @Transient
	 * public String getDescriptorDescription() {
	 * return this.descriptor.getDescription();
	 * }
	 * 
	 * @Transient
	 * public String getDescriptorId() {
	 * return String.valueOf(this.descriptor.getId());
	 * }
	 */

	//	Relationships -------------------------------------------------------------------------

	@NotNull
	@Valid
	@ManyToOne(optional = false)

	private Employer			employer;


	@Valid
	@ManyToOne(optional = false)
	private Auditor		auditor;

	/*
	 * @NotNull
	 * 
	 * @OneToOne(optional = false)
	 * private Descriptor descriptor;
	 */

}
