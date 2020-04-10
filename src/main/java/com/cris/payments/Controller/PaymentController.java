package com.cris.payments.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class PaymentController {
	
	@PostMapping("/postRequest")
	public String getPayment(){		
		return "Respuesta ok";
	}
	
	@GetMapping("/getRequest")
	public String getWord() {
		return "Ejemplo 2";
	}

}
