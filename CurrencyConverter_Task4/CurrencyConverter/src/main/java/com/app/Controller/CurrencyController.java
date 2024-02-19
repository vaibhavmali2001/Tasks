package com.app.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@CrossOrigin
@RequestMapping("/currency")
public class CurrencyController {
	
	@GetMapping("/convert")
	public double convertCurrency(@RequestParam String from, @RequestParam String to, @RequestParam double amount) {
	    double cash = 0.0;

	    switch (from + "-" + to) {
	        case "INR-DOLLAR":
	            cash = amount / 83.02;
	            break;
	        case "INR-EURO":
	            cash = amount * 0.011;
	            break;
	        case "INR-POUND":
	            cash = amount * 0.0096;
	            break;
	        case "DOLLAR-INR":
	            cash = amount * 83.02;
	            break;
	        case "DOLLAR-EURO":
	            cash = amount * 0.93;
	            break;
	        case "DOLLAR-POUND":
	            cash = amount * 0.79;
	            break;
	        case "EURO-INR":
	            cash = amount * 89.44;
	            break;
	        case "EURO-DOLLAR":
	            cash = amount * 1.08;
	            break;
	        case "EURO-POUND":
	            cash = amount * 0.85;
	            break;
	        case "POUND-INR":
	            cash = amount * 104.67;
	            break;
	        case "POUND-DOLLAR":
	            cash = amount * 1.26;
	            break;
	        case "POUND-EURO":
	            cash = amount * 1.17;
	            break;
	        default:
	            cash = amount;
	            break;
	    }

	    return cash;
	}


}
