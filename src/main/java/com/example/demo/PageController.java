package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;
import org.springframework.web.servlet.view.RedirectView;

import com.eventmgr.controller.CustomerController;
import com.eventmgr.controller.EveeentController;
import com.eventmgr.controller.EventInquiry;
import com.eventmgr.model.Customer;
import com.eventmgr.model.Event;
import com.eventmgr.model.Inquiries;


@Controller
public class PageController {

	@RequestMapping("/getIndex")
	public String home111() {
		System.out.println("Home Called");
		
		return "index.jsp";
	}
	
	
	
	@RequestMapping("/indexlogout")
	public String indexlogout() {
		System.out.println("Home Called");
		
		return "index.jsp";
	}
	
	
	@RequestMapping("/eventManagements")
	public String dashhboar1d() {
		
		return "eventManagement.html";
	}
	
	@RequestMapping("/customerManagements")
	public String dashhboar2d() {
		
		return "customerManagement.html";
	}
	
	
	@RequestMapping("/adminEventDtls")
	public String adminEventDtls( HttpServletRequest request,Model model,ModelAndView testModel) {
		System.out.println("test");
        String emailId1 = (String)model.asMap().get("customerEmail");
        EveeentController ev= new EveeentController();
        Event evlst=new Event();
        //name=(ename.replaceAll("\\p{P}",""));
        evlst=ev.geteventDetails(emailId1.replaceAll("\\p{P}",""));		
	
		
		//evlst.setEname("aaaaaaaaaaaaa");
		//evlst.setElocation("eeee");
		//edirectAttributes.addFlashAttribute("message", evlst);
       // Map<String, ?> flashMap = RequestContextUtils.getInputFlashMap(request);
       // String emailId2 =  (String) flashMap.get("customerEmail");
       // model2.put("message",emailId2 );
        model.addAttribute("event", evlst);
        //Map<String, Object> modeil = new HashMap<String, Object>();
		
        //modeil.put("numberOfMovies", "1234");

        System.out.println("testmeeeeeeeeee"+emailId1);
        
		return "Admin Event Details.jsp";
	}
	
	@RequestMapping("/adminCustomerDetails")
	public String adminCustomerDetailsPage( HttpServletRequest request,Model model,ModelAndView testModel) {
		System.out.println("test");
        String NIC = (String)model.asMap().get("nic");
        CustomerController ev= new CustomerController();
        Customer evlst=new Customer();
        //name=(ename.replaceAll("\\p{P}",""));
        evlst=ev.getCustomerDetails(NIC.replaceAll("\\p{P}",""));		
	
		
		//evlst.setEname("aaaaaaaaaaaaa");
		//evlst.setElocation("eeee");
		//edirectAttributes.addFlashAttribute("message", evlst);
       // Map<String, ?> flashMap = RequestContextUtils.getInputFlashMap(request);
       // String emailId2 =  (String) flashMap.get("customerEmail");
       // model2.put("message",emailId2 );
        model.addAttribute("cust", evlst);
        //Map<String, Object> modeil = new HashMap<String, Object>();
		
        //modeil.put("numberOfMovies", "1234");

        System.out.println("Customer Nic"+NIC);
        
		return "Customer Details.jsp";
	}
	
	
	
	@RequestMapping("/IndexCustomer")
	public String IndexCustomer( HttpServletRequest request,Model model,ModelAndView testModel) {
		System.out.println("test");
        String NIC = (String)model.asMap().get("nic");
        CustomerController ev= new CustomerController();
        Customer evlst=new Customer();
        //name=(ename.replaceAll("\\p{P}",""));
        evlst=ev.getCustomerDetails(NIC.replaceAll("\\p{P}",""));	
        
        
        
        String username= evlst.getUsername();
        request.getSession().setAttribute("username", username);
        
        
		//evlst.setEname("aaaaaaaaaaaaa");
		//evlst.setElocation("eeee");
		//edirectAttributes.addFlashAttribute("message", evlst);
       // Map<String, ?> flashMap = RequestContextUtils.getInputFlashMap(request);
       // String emailId2 =  (String) flashMap.get("customerEmail");
       // model2.put("message",emailId2 );
        model.addAttribute("cust", evlst);
        //Map<String, Object> modeil = new HashMap<String, Object>();
		
        //modeil.put("numberOfMovies", "1234");

        System.out.println("Customer Nic"+NIC);
        
   
        
		return "index.jsp";
	}
	
	@RequestMapping("//paymentDashboard")
	public String home22() {
		System.out.println("Home Called");
		
		return "PaymentDashboard.html";
	}
	
	@RequestMapping("/login")
	public String login() {
		
		return "login.html";
	}
	
	@RequestMapping("/CustomerDetailsProfile")
	public String CustomerDetailsProfile( HttpServletRequest request,Model model,ModelAndView testModel) {
		System.out.println("test");
        String NIC = (String)model.asMap().get("nic");
        CustomerController ev= new CustomerController();
        Customer evlst=new Customer();
        //name=(ename.replaceAll("\\p{P}",""));
        evlst=ev.getCustomerDetails(NIC.replaceAll("\\p{P}",""));		
	
		
		//evlst.setEname("aaaaaaaaaaaaa");
		//evlst.setElocation("eeee");
		//edirectAttributes.addFlashAttribute("message", evlst);
       // Map<String, ?> flashMap = RequestContextUtils.getInputFlashMap(request);
       // String emailId2 =  (String) flashMap.get("customerEmail");
       // model2.put("message",emailId2 );
        model.addAttribute("cust", evlst);
        //Map<String, Object> modeil = new HashMap<String, Object>();
		
        //modeil.put("numberOfMovies", "1234");

        System.out.println("Customer Nic"+ NIC);
        
   
        
		return "Customer Profile.jsp";
	}
	
	@RequestMapping("/EventDtls")
	public String EventDtls( HttpServletRequest request,Model model,ModelAndView testModel) {
		System.out.println("test");
        String emailId1 = (String)model.asMap().get("customerEmail");
        EveeentController ev= new EveeentController();
        Event evlst=new Event();
        //name=(ename.replaceAll("\\p{P}",""));
        evlst=ev.geteventDetails(emailId1.replaceAll("\\p{P}",""));		
	
		
		//evlst.setEname("aaaaaaaaaaaaa");
		//evlst.setElocation("eeee");
		//edirectAttributes.addFlashAttribute("message", evlst);
       // Map<String, ?> flashMap = RequestContextUtils.getInputFlashMap(request);
       // String emailId2 =  (String) flashMap.get("customerEmail");
       // model2.put("message",emailId2 );
        model.addAttribute("event", evlst);
        //Map<String, Object> modeil = new HashMap<String, Object>();
		
        //modeil.put("numberOfMovies", "1234");

        System.out.println("testmeeeeeeeeee"+emailId1);
        
		return "eventProfile.jsp";
	}
	
	@RequestMapping("/addEventInquiry")
	public String addeventInquiry(Inquiries inq) {
		EventInquiry evq=new EventInquiry();
		
		System.out.println("Hiii");
		
		evq.createInquiry(inq);
		return "index.jsp";
		
	}
	
}
