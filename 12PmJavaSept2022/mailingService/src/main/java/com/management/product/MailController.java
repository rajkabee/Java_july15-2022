package com.management.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.management.product.util.EmailUtil;
import com.management.product.util.PDFGenerator;

@Controller
public class MailController {
	@Autowired
	PDFGenerator pdfGenerator;
	@Autowired
	EmailUtil emailUtil;
	
	@GetMapping("/sendMail")
	public String sendMail() {
		

       
        String filePath = "E:/java/practice/final/flightreservation/reservation" + "Pravin" + ".pdf";
        pdfGenerator.generateItinerary(filePath);
        emailUtil.sendItinerary("khaling.pravin@gmail.com",filePath);
		
		
		return "hello";
	}
}
