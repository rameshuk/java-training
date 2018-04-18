package com.rest.api;
 
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import com.fasterxml.jackson.databind.ObjectMapper;
import static com.rest.api.JsonMapper.convertJsonString;

@Path("/hello")
public class HelloWorldService {
 
	@GET
	@Path("/{param}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;

		User s = new User(1, "Ramesh");
 
		return Response.status(200).entity(convertJsonString(s)).build();
 
	}
 
}


class User implements Serializable {
	 private int id;
	private String name;

	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}

class JsonMapper {


	public static String convertJsonString(Object obj) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = "";

		/**
		 * Write object to file
		 */
		try {
			jsonInString = mapper.writeValueAsString(obj);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonInString;
	}
}