package de.fhb.sq;

public class JenkinsBlame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Blame");
		//Holt XML-Daten vom Build-Nr. >>12<< aus Projekt >>Auto-B-Day<<
		JenkinsDataCaller jdc = new JenkinsDataCaller("http://jenkins.rambow.it:8080/job/Auto-B-Day/12/api/xml/");
		jdc.getXml();
			
	}

}
