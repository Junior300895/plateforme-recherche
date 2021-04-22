package sn.codeart.msa.util;

import java.util.HashMap;

import sn.codeart.msa.model.Production;

public class PostDTO {
	private Production production;
	private HashMap<String, Integer> emailsRangs;
	
	public PostDTO() {
		super();
	}
	
	public Production getProduction() {
		return production;
	}
	public void setProduction(Production production) {
		this.production = production;
	}
	public HashMap<String, Integer> getEmailsRangs() {
		return emailsRangs;
	}
	public void setEmailsRangs(HashMap<String, Integer> emailsRangs) {
		this.emailsRangs = emailsRangs;
	}
	
	
}
