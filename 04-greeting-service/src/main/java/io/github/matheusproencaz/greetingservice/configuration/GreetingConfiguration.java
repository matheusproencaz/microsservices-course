package io.github.matheusproencaz.greetingservice.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope //Utilizando o Actuator é possível acessar o endpoint /refresh e alterar as modificações sem derrubar o servidor da aplicação.
@ConfigurationProperties("greeting-service")
public class GreetingConfiguration {

	private String greeting;
	private String defaultValue;

	public GreetingConfiguration() {
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
}
