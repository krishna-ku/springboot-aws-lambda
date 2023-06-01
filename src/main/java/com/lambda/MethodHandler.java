package com.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.lambda.entity.User;

public class MethodHandler implements RequestHandler<User, User>{

	@Override
	public User handleRequest(User input, Context context) {
		context.getLogger().log("Input: "+input);
		return input;
	}
	
//	public String request(String input, Context context) {
//		context.getLogger().log("Input: "+input);
//		return "Hello World - "+input;
//	}

}
