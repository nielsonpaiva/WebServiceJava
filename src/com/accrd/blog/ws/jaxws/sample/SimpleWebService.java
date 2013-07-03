package com.accrd.blog.ws.jaxws.sample;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService(name="SimpleWebService")
public class SimpleWebService {

	public String sayHello (String name){
        return "Hello, "+ name + "!" ;
    }
 
    public static void main (String args[]){
        Endpoint.publish("http://localhost:8080/SimpleWebService", new SimpleWebService ()); ;
    }

}
