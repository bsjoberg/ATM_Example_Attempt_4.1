package nicebank;

import static java.util.Locale.ENGLISH;

import java.util.Locale;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.cucumberexpressions.ParameterType;
import io.cucumber.cucumberexpressions.Transformer;

public class TypeRegistryConfiguration implements TypeRegistryConfigurer {
	
    public Locale locale() {
        return ENGLISH;
    }

	public void configureTypeRegistry(TypeRegistry typeRegistry) {
		typeRegistry.defineParameterType(new ParameterType<Money>(
	            "digit",
	            "[0-9]",
	            Money.class,
	            (Transformer<Money>) (String s) -> Money.transform(s))
	        );
	}

	
	
}
