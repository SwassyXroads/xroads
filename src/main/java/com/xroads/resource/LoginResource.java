package com.xroads.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.codehaus.jettison.json.JSONObject;

import com.xroads.exception.XroadsDataValidationException;

@Path("/login")
public class LoginResource {
	
	@Path("/register")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response register(JSONObject jsonEntity){
		return Response.status(Status.OK).build();
		
	}
	
	@Path("/register/otp_verify")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response registerOtpVerify(JSONObject jsonEntity){
		return Response.status(Status.OK).build();
		
	}
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response login(JSONObject jsonEntity) throws Exception{
		if(jsonEntity==null)
		{
			throw new XroadsDataValidationException("No request sent during login");
		}
		Integer mobNo=jsonEntity.getInt("mobileNo");
		
		
		return Response.status(Status.OK).build();
		
	}
	
	@POST
	@Path("/forgot_password")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response loginForgotPassword(JSONObject jsonEntity){
		return Response.status(Status.OK).build();
		
	}

}
