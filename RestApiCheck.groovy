
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.web.client.RestTemplate;

try{
	final String uri ="https://localhost:8080/datahub-webapp/v1/status";
	final RestTemplate restTemplate = new RestTemplate();
	restTemplate.getInterceptors().add(new BasicAuthorizationInterceptor("admin","nimda"));
	final String result = restTemplate.getForObject(uri.String.class);
	println(result);
}catch(Exception ex){
	println("Error Occurred..."+ex.toString());
}
