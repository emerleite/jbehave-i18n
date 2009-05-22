package com.codificando.jbehavei18n;

import org.jbehave.scenario.steps.CandidateSteps;
import org.jbehave.scenario.steps.Steps;

public class I18nSteps extends Steps implements CandidateSteps {
	public I18nSteps() {
		super(I18nKeywords.getInstance().getGiven(),
    			I18nKeywords.getInstance().getWhen(),
    			I18nKeywords.getInstance().getThen(),
    			I18nKeywords.getInstance().getAnd());
	}
}
