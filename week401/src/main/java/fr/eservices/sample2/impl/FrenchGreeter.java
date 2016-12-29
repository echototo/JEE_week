package fr.eservices.sample2.impl;

import fr.eservices.sample2.api.Greeter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
@Qualifier("french")
public class FrenchGreeter implements Greeter {

	@Override
	public String hello(String name) {
		if ( name == null || name.isEmpty() ) name = " tout le monde !";
		return "Bonjour " + name;
	}

}
