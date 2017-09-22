package com.techm.main;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = Client.create();
		WebResource webResource = client.resource("http://10.14.129.6:8080/api/json");
		System.out.println("changes made");
		System.out.println("blah!");
		System.out.println("blah! blah!");
	}

}
