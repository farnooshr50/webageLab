package com.mtcc.customerevent.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerResource {
	
		@GetMapping("/customer/farnoosh")
		public CustomerResponse getName() {
//				return new customerResponse();
			CustomerResponse custRes = new CustomerResponse();
			custRes.setEmail("farnoosh@telus.com");
			custRes.setName("farnoosh");
			custRes.setId("1");
			return custRes;
		}
		@GetMapping("/customer/guario")
		public CustomerResponse getId() {
//				return new customerResponse();
			CustomerResponse custRes = new CustomerResponse();
			custRes.setEmail("guario@telus.com");
			custRes.setName("guario");
			custRes.setId("2");
			return custRes;
		}

}
