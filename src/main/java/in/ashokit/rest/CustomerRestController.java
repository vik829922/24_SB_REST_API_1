package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Customer;

@RestController
public class CustomerRestController {
	@GetMapping("/customer")
	public Customer getCustomer() {
		Customer c = new Customer();
		c.setName("jhon");
		c.setEmail("jhon@gmail.com");
		c.setGender("male");
		return c;
	}
	     @PostMapping(
	    		 value="/customer",
	    		 consumes= {"application/Xml","application/Json"},
	    		 produces= {"text/plain"}
	    		 
	    		 )
        public ResponseEntity<String>  addCustomer(@RequestBody Customer custmer) {
        	System.out.println(custmer);
        	//logic to insert custmer in db
        	return new ResponseEntity<>("Customer Saved",HttpStatus.CREATED);
        			
        }
}
