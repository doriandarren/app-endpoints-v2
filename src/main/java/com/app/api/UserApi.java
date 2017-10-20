package com.app.api;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import model.Message;


@Api(name = "user", 
		version = "v1", 
		namespace = 
			@ApiNamespace(
					ownerDomain = "servlet.app.com", 
					ownerName = "servlet.app.com", 
					packagePath = ""
			)
)
public class UserApi {
	
    @ApiMethod(name="printecho", path="printecho", httpMethod = ApiMethod.HttpMethod.GET)
    public Message printEcho() {
    	Message message = new Message();
		message.setMessage("Holaaaa de nuevo---");
		return doEcho(message);
    }
	
    
    
	private Message doEcho(Message message) {
		return message;
	}	
}
