package ca.uhn.fhir.jpa.starter.ips;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class IpsConfigCondition implements Condition {

	@Override
	public boolean matches(ConditionContext theConditionContext, AnnotatedTypeMetadata theAnnotatedTypeMetadata) {
		System.out.println("\n\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		String property = theConditionContext.getEnvironment().getProperty("hapi.fhir.ips_enabled");
		Boolean result = Boolean.parseBoolean(property);
		
		if(result) {
			System.out.println("IpsConfigCondition.matches: true");
		} else {
			System.out.println("IpsConfigCondition.matches: false");
		}
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n\n");
		return result;
	}
}
