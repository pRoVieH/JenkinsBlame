package de.fhb.sq;

import java.io.IOException;
import java.net.*;

import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
//DataObjectCaller
public class JenkinsDataCaller {
	
	private String ziel = null;
	
	public JenkinsDataCaller(String ziel){
		this.ziel = ziel;
	}
	public void getXml(){
		try {
			Document doc = new SAXBuilder().build(ziel);
			XMLOutputter out = new XMLOutputter();
			out.output( doc, System.out );
			
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getJson(){
		
	}
}
