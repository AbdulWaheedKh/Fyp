package com.javabrains.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RequestMapping("/Ceo")
	public class CeoController {

			@RequestMapping("/Ceo")
			public String index() {
				return "ceo/ceo";
			}
		
		    
		    
					@RequestMapping("Ceo/AssignTarget")
					public String AssignTarget() {	
						return "ceo/AssignTarget";
					}
				
			
			
			
			@RequestMapping("Ceo/ViewSale")
			public String ViewSales() {	
				return "ceo/ViewSale";
			}
		
		
			@RequestMapping("Ceo/RegionalSale")
			public String RegionalSales() {	
				return "ceo/RegionalSale";
			}
		
			@RequestMapping("Ceo/AreaSale")
			public String AreaSale() {	
				return "ceo/AreaSale";
			}
		
		    
		    
			@RequestMapping("Ceo/IssueWarning")
			public String IssueWarning() {	
				return "ceo/IssueWarning";
			}
		
			@RequestMapping("Ceo/AddFeedback")
			public String AddFeedback() {	
				return "ceo/addFeedback";
			}

	

}
	
	
	
	
	
