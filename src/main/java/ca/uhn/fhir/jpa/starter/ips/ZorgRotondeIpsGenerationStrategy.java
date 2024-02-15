/*
 * Custom implementation of the default International Patient Summary (IPS) 
 * generation strategy defined by HAPI FHIR.
 */

package ca.uhn.fhir.jpa.starter.ips;

import ca.uhn.fhir.jpa.ips.strategy.DefaultIpsGenerationStrategy;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.hl7.fhir.r4.model.*;

public class ZorgRotondeIpsGenerationStrategy extends DefaultIpsGenerationStrategy {

    @Override
    public IBaseResource createAuthor(){
        Organization organization = new Organization();
		organization
				.setName("ZorgRotonde - Info Support")
				.addAddress(new Address()
						.addLine("Kruisboog 42")
						.setCity("Veenendaal")
						.setPostalCode("3905 TG")
						.setCountry("NL"))
				.setId(IdType.newRandomUuid());
		return organization;
    }

}
 

