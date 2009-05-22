package com.codificando.jbehavei18n;

import org.jbehave.scenario.PropertyBasedConfiguration;
import org.jbehave.scenario.Scenario;
import org.jbehave.scenario.definition.KeyWords;
import org.jbehave.scenario.parser.ClasspathScenarioDefiner;
import org.jbehave.scenario.parser.PatternScenarioParser;
import org.jbehave.scenario.parser.ScenarioDefiner;
import org.jbehave.scenario.parser.UnderscoredCamelCaseResolver;

public class I18nScenario extends Scenario {
	public I18nScenario() {
		 super(new PropertyBasedConfiguration() {
			 	public ScenarioDefiner forDefiningScenarios() {
	                return new ClasspathScenarioDefiner(
	                    new UnderscoredCamelCaseResolver(".cenario"), 
	                    new PatternScenarioParser(this), Thread.currentThread().getContextClassLoader());
	            }
			 
	            public KeyWords keywords() {
	            	return new KeyWords(
	            			I18nKeywords.getInstance().getScenario(),
	            			I18nKeywords.getInstance().getGiven(),
	            			I18nKeywords.getInstance().getWhen(),
	            			I18nKeywords.getInstance().getThen(),
	            			I18nKeywords.getInstance().getAnd());
	            }
		 });
	}
}

