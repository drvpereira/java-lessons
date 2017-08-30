package br.farn.web3.escopo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;

public class SpringConfig {

	@Bean
	public CustomScopeConfigurer escoposPersonalizados() {
		CustomScopeConfigurer c = new CustomScopeConfigurer();
		
		Map<String, Object> escopos = new HashMap<String, Object>();
		escopos.put("view", new ViewScope());
		
		c.setScopes(escopos);
		
		return c;
	}
	
}
