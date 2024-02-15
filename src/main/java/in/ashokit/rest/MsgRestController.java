package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	/*
	 * public MsgRestController() {
	 * System.out.println("MsgRestController::Constructor"); }
	 * 
	 */	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg(){
		String msg="Welcome to Ashok IT";
		
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	@GetMapping("/greet")
	public String getGreetmsg() {
		String msg = "Good Evining vikas ...";
		return msg ;
	}

}
