package com.example.demo;





import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.data.mongodb.core.MongoTemplate;
import com.eventmgr.controller.*;
import com.eventmgr.model.*;
import com.eventmgr.repositaries.*;
import com.google.gson.Gson;

@RestController
@Controller
public class EventController {
	
    //private MongoTemplate mongoTemplate;
	
	@RequestMapping("/index")
	public String home() {
		
		return "index.html";
	}
	
	@RequestMapping("/eventProfile")
	public String home147() {
		
		return "eventProfile.html";
	}
	
	@RequestMapping("/addEvent")
	public RedirectView addevent(Event events) {
		
		
		System.out.println("Hiii");
		System.out.println(events.getEname());
		System.out.println(events.getElocation());
		System.out.println(events.getEphoneNo());
		System.out.println(events.getEtime());
		System.out.println(events.getEtype());
		System.out.println(events.getEdate());
		EveeentController ev= new EveeentController();
		ev.createEvent(events);
		
		
		return new RedirectView("/getIndex");
		
	}
	
	@RequestMapping("/addCustomer")
	public RedirectView addcustomer(Customer customer) {
		
		System.out.println("Hiii");
		System.out.println(customer.getfName());
		
		CustomerController ev= new CustomerController();
		ev.createCustomer(customer);
		return new RedirectView("/getIndex");
	}
	
	
	
//	@RequestMapping("/validateCustomer")
//	public RedirectView validateCustomer(Customer customer) {
//		
//		System.out.println("Hiii");
//		System.out.println(customer.getfName());
//		
//		CustomerController ev= new CustomerController();
//		ev.validateCustomer(customer);
//		return new RedirectView("/getIndex");
//	}
//	
	@RequestMapping("eventManagement")
	public String dashhboard() {
		
		return "eventManagement.html";
	}
	
	@RequestMapping("/selectAllEvents")
	public RedirectView selctEvent() {
		
		System.out.println("Hiii");
		
		EveeentController ev= new EveeentController();
		ev.getAllEvent();
		
		return new RedirectView("/eventManagements");
		
	}
	
	@GetMapping("/selectRequestEvents")
	public List<Event> selctRequestEvent(HttpServletRequest request) {
		EveeentController ev= new EveeentController();
		List<Event> evlst = new ArrayList<Event>();
		evlst=ev.getRequestedEvent();
		return evlst;
	}
	
	@GetMapping("/selectCustomer")
	public List<Customer> selctCustomer(HttpServletRequest request) {
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
		CustomerController ev= new CustomerController();
		List<Customer> evlst = new ArrayList<Customer>();
		evlst=ev.getAllCustomer();
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
		return evlst;
	}

	@GetMapping("/selectPendingEvent")
	public List<Event> getPendingEvent() {
		System.out.println("ppppp");
		EveeentController ev= new EveeentController();
		List<Event> evlst = new ArrayList<Event>();
		evlst=ev.getPendingEvent();
		return evlst;
		
	}
	
	@RequestMapping("/selectConfirmedEvent")
	public List<Event> getConfirmedEvent() {
		
		EveeentController ev= new EveeentController();
		List<Event> evlst = new ArrayList<Event>();
		evlst=ev.getConfirmedEvent();
		return evlst;
		
	}
	
	@RequestMapping("/addSupplier")
	public RedirectView addSupplier(Supplier supplier) {
		
		System.out.println("Hiii");
		System.out.println(supplier.getCompanyName());
		
		SupplierController ev= new SupplierController();
		ev.createSupplier(supplier);
		return new RedirectView("/getIndex");
	}
	
	@GetMapping("/retrieveSuppliers")
	public List<Supplier> selectSupplier(HttpServletRequest request) {
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
		SupplierController sc= new SupplierController();
		List<Supplier> sclst = new ArrayList<Supplier>();
		sclst=sc.getAllSupplier();
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
		return sclst;
	}
	
	@RequestMapping("/deleteEvent/{ename}")
	public RedirectView  deleteEvent(@PathVariable String ename) {
		
		EveeentController ev= new EveeentController();
		System.out.println(ename);
		
		ename=(ename.replaceAll("\\p{P}",""));
		ev.deleteEvent(ename);
		return new RedirectView("/eventManagements");
		
	}
	
	@GetMapping("/validateCustomer")
	public RedirectView  validateCustomer(@RequestParam String nic, @RequestParam String password,RedirectAttributes redirectAttributes, HttpServletRequest request) {
		
		CustomerController ev= new CustomerController();
		System.out.println(nic);
		System.out.println(password);
		nic=(nic.replaceAll("\\p{P}",""));
		password=(password.replaceAll("\\p{P}",""));
		
		 redirectAttributes.addFlashAttribute("nic", nic);
		
		
		if(ev.validate(nic,password)) {
			
			request.getSession().setAttribute("nic", nic);
			
			
			return new RedirectView("/indexlogged") ;
			
		
		}
		else {
		return new RedirectView("/login");}
		
	}
	
	
	@GetMapping("/logout")
	public RedirectView  logout(RedirectAttributes redirectAttributes, HttpServletRequest request) {
		
		
			
			request.getSession().setAttribute("nic", null);
			request.getSession().setAttribute("username", null);
			
			
			return new RedirectView("/indexlogout") ;
			

		
	}
	
	
	@RequestMapping("/indexlogged")
	public  RedirectView indexlogged(@Valid Customer customer, BindingResult result,Model model,RedirectAttributes redirectAttributes, HttpServletRequest request) {
        model.addAttribute("customer",customer);
        //Do the Registration logic and then redirect to home page without using action for home page
      
        String NIC = (String)model.asMap().get("nic");
        
       redirectAttributes.addFlashAttribute("nic", NIC);
       
       String username = customer.getUsername();
       
       
       
       System.out.println("Methanta enwa");
       System.out.println(NIC);
		
		System.out.println("Hiii admin");
		
		
		CustomerController ev= new CustomerController();
		List<Event> evlst = new ArrayList<Event>();
		
	//name=(ename.replaceAll("\\p{P}",""));
	//vlst=ev.geteventDetails(ename);		
		//odel.put("message", evlst);
		//edirectAttributes.addFlashAttribute("message", evlst);
		return new RedirectView("/IndexCustomer");
		//return evlst;
		
		
	}
	

	
	
	@GetMapping("/selcteventDetails/{ename}")
	/*public List<Event> selcteventDetails(@PathVariable String ename) {
		EveeentController ev= new EveeentController();
		List<Event> evlst = new ArrayList<Event>();
		ename=(ename.replaceAll("\\p{P}",""));
		evlst=ev.geteventDetails(ename);
		return evlst;
	}*/
	
	@RequestMapping("/confirmEvent/{ename}")
	public RedirectView  confirmEvent(@PathVariable String ename) {
		System.out.println("Divvvvv");
		EveeentController ev= new EveeentController();
		System.out.println(ename);
		
		ename=(ename.replaceAll("\\p{P}",""));
		ev.confirmEvent(ename);
		return new RedirectView("/eventManagements");
		
	}
	@RequestMapping("/updateEvent/{ename}")
	public RedirectView updateEvents(Event event,@PathVariable String ename) {
		
		System.out.println("Hiii Update");
		System.out.println(event.getEname());
		
		EveeentController ev= new EveeentController();
		System.out.println(ename);
		ev.updateEvent(event,ename);
		return new RedirectView("/eventManagements");
	}
	
	@RequestMapping("/updateCustomer/{nic}")
	public RedirectView updateCustomer(Customer cust, @RequestParam String hidden,@PathVariable String nic) {
		
		System.out.println("Hiii Update");
		System.out.println(cust.getNic());
		
		CustomerController ev= new CustomerController();
		System.out.println(nic);
		ev.updateCustomer(cust,nic);
		
		if(hidden.equals("admin")) {
		return new RedirectView("/customerManagements");}
		
		else if(hidden.equals("user")){
			
			return new RedirectView("/login");}
			
		else return null;
	}
	
	
	
	@RequestMapping("/AdminEventDetails/{ename}")
	public  RedirectView AdminEventDetails(@PathVariable String ename,@Valid Event customer, BindingResult result,Model model,RedirectAttributes redirectAttributes) {
        model.addAttribute("customer",customer);
        //Do the Registration logic and then redirect to home page without using action for home page
       
       redirectAttributes.addFlashAttribute("customerEmail", customer.getEname());
		
		System.out.println("Hiii admin");
		
		String name=ename;
		EveeentController ev= new EveeentController();
		List<Event> evlst = new ArrayList<Event>();
		
	//name=(ename.replaceAll("\\p{P}",""));
	//vlst=ev.geteventDetails(ename);		
		//odel.put("message", evlst);
		//edirectAttributes.addFlashAttribute("message", evlst);
		return new RedirectView("/adminEventDtls");
		//return evlst;
		
		
	}
	
//	@RequestMapping("/AdminCustomerDetails1/{ename}")
//	public  RedirectView AdminEventDetails1(@PathVariable String ename,@Valid Event customer, BindingResult result,Model model,RedirectAttributes redirectAttributes) {
//        model.addAttribute("customer",customer);
//        //Do the Registration logic and then redirect to home page without using action for home page
//       
//       redirectAttributes.addFlashAttribute("customerEmail", customer.getEname());
//		
//		System.out.println("Hiii admin");
//		
//		String name=ename;
//		EveeentController ev= new EveeentController();
//		List<Event> evlst = new ArrayList<Event>();
//		
//	//name=(ename.replaceAll("\\p{P}",""));
//	//vlst=ev.geteventDetails(ename);		
//		//odel.put("message", evlst);
//		//edirectAttributes.addFlashAttribute("message", evlst);
//		return new RedirectView("/adminEventDtls");
//		//return evlst;
//		
//		
//	}
	

	
	
	@RequestMapping("/AdminCustomerDetails/{nic}")
	public  RedirectView AdminCustomerDetails(@PathVariable String nic,@Valid Customer customer, BindingResult result,Model model,RedirectAttributes redirectAttributes) {
        model.addAttribute("customer",customer);
        //Do the Registration logic and then redirect to home page without using action for home page
       
       redirectAttributes.addFlashAttribute("nic", customer.getNic());
		
		System.out.println("Hiii admin");
		
		String NIC=nic;
		CustomerController ev= new CustomerController();
		List<Event> evlst = new ArrayList<Event>();
		
	//name=(ename.replaceAll("\\p{P}",""));
	//vlst=ev.geteventDetails(ename);		
		//odel.put("message", evlst);
		//edirectAttributes.addFlashAttribute("message", evlst);
		return new RedirectView("/adminCustomerDetails");
		//return evlst;
		
		
	}
	@RequestMapping("/addSuplierPayment")
	public String createSupplierPayment(SupplierPayment supplierPay) {
		
		
		SupplierPaymentController ev= new SupplierPaymentController();
		ev.createSupplierPayment(supplierPay);
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAPPPPPPPPPPPPPPPPPPPPPPPPPP");
		return "index.html";
		
	}
	
	@RequestMapping("customerManagement")
	public String dashhboard2() {
		
		return "customerManagement.html";
	}
	
	
	@RequestMapping("/addCustomerPayment")
	public String createCustomerPayment(CustomerPayment customerPay) {
		
		
		CustomerPaymentController ev= new CustomerPaymentController();
		ev.createCustomerPayment(customerPay);
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAPPPPPPPPPPPPPPPPPPPPPPPPPP");
		return "index.html";
		
	}
	
	@RequestMapping("/selectCustomerPayment")
	public List<CustomerPayment> getAllCustomerPayments() {
		System.out.println("Calll");
		CustomerPaymentController ev= new CustomerPaymentController();
		List<CustomerPayment> evlst = new ArrayList<CustomerPayment>();
		evlst=ev.getAllCustomerPayments();
		System.out.println("Calll11111111111111111111");
		return evlst;
		
	}
	
	@RequestMapping("/deleteCustomer/{nic}")
	public RedirectView  deleteCustomer(@PathVariable String nic) {
		
		CustomerController cus= new CustomerController();
		System.out.println(nic);
		
		nic=(nic.replaceAll("\\p{P}",""));
		cus.deleteCustomer(nic);
		return new RedirectView("/customerManagements");
		
	}
	

	
	@GetMapping("/selectAllCustomer")
	public float selctAllCustomer(HttpServletRequest request) {
		CustomerController c=new CustomerController();
		float res1=c.countAllCustomer();
		System.out.println("Count is"+res1);
		return res1;
	
	}

	@GetMapping("/selectCountRequestEvents")
	public float selctCountRequestEvent(HttpServletRequest request) {
		EveeentController e=new EveeentController();
		float res=e.countReqEvent();
		System.out.println("Count is"+res);
		return res;
	}
	
	
	
	@GetMapping("/countPendCusEvent")
	public float countPendCusEvent(HttpServletRequest request) {
		CustomerController e=new CustomerController();
		float res=e.countPendCusEvent(request);
		System.out.println("Count is"+res);
		return res;
	}
	
	

	@GetMapping("/countTotCusEvent")
	public float countTotCusEvent(HttpServletRequest request) {
		CustomerController e=new CustomerController();
		float res=e.countTotCusEvent(request);
		System.out.println("Count is"+res);
		return res;
	}
	@GetMapping("/countConCusEvent")
	public float countConCusEvent(HttpServletRequest request) {
		CustomerController e=new CustomerController();
		float res=e.countConCusEvent(request);
		System.out.println("Count is"+res);
		return res;
	}
	
	@GetMapping("/selectPendRequestEvents")
	public float selctPendRequestEvent(HttpServletRequest request) {
		EveeentController e=new EveeentController();
		float res1=e.countPendEvent();
		System.out.println("Count is"+res1);
		return res1;
	}
	@GetMapping("/selectConfirmRequestEvents")
	public float selctConfirmRequestEvent(HttpServletRequest request) {
		EveeentController e=new EveeentController();
		float res1=e.countConfirmedEvent();
		System.out.println("Count is"+res1);
		return res1;
	}
	@GetMapping("/selectAllRequestEvents")
	public float selctAllRequestEvent(HttpServletRequest request) {
		EveeentController e=new EveeentController();
		float res1=e.countAllEvent();
		System.out.println("Count is"+res1);
		return res1;
	}
	
	@RequestMapping("/selectComingEvent")
	public List<Event> getComingEvent() {
		System.out.println("hi");
		EveeentController ev= new EveeentController();
		List<Event> evlst = new ArrayList<Event>();
		evlst=ev.getUpcomingEvent();
		return evlst;
	}	
	@RequestMapping("/selectCustomerPendingPayment")
	public List<CustomerPayment> getPendingCustomerPayments() {
		System.out.println("Calll");
		CustomerPaymentController ev= new CustomerPaymentController();
		List<CustomerPayment> evlst = new ArrayList<CustomerPayment>();
		evlst=ev.getPendingCustomerPayment();
		System.out.println("Calll11111111111111111111");
		return evlst;
		
	}
	
	

	@RequestMapping("/selectSupplierPendingPayment")
	public List<SupplierPayment> getPendingSupplierPayments() {
		System.out.println("Calll");
		SupplierPaymentController ev= new SupplierPaymentController();
		List<SupplierPayment> evlst = new ArrayList<SupplierPayment>();
		evlst=ev.getPendingSupplierPayment();
		System.out.println("Call222222222222222222222222222221");

		return evlst;
		
	}
	

	@RequestMapping("/selectEventInquiries/{ename}")
	public List<Inquiries>  selectEventInquiries(@PathVariable String ename) {
		
		EveeentController ev= new EveeentController();
		System.out.println(ename);
		List<Inquiries> evlst = new ArrayList<Inquiries>();
		ename=(ename.replaceAll("\\p{P}",""));
		evlst=ev.getEventInquiries(ename);
		return evlst;
		
	}
	
	

	@RequestMapping("/deleteCustomerPayment/{ename}")
	public RedirectView  deleteCustomerPayment(@PathVariable String ename) {
		
		CustomerPaymentController ev= new CustomerPaymentController();
		System.out.println(ename);
		
		System.out.println("yyyyyyyyyyyyyyyyyyioit");
		ename=(ename.replaceAll("\\p{P}",""));
		ev.deleteCustomerPayment(ename);
		return new RedirectView("/paymentDashboard");
		
	}

	
	@RequestMapping("/updateCustomerPayment/{ename}")
	public RedirectView updateCustomerPayment(CustomerPayment cs,@PathVariable String ename) {
		
		System.out.println("Hiii Update");
		System.out.println(cs.getEventName());
		
		CustomerPaymentController ev= new CustomerPaymentController();
		System.out.println(ename);
		ev.updateCustomerPayment(cs,ename);
		return new RedirectView("/PaymentDashboard");
	}
	
	@GetMapping("customerProfile/{nic}")
	public RedirectView  validateCustomer(@PathVariable String nic,RedirectAttributes redirectAttributes) {
		
		CustomerController ev= new CustomerController();
		System.out.println("Customer profile entry nic "+nic);
		
		
		
		 redirectAttributes.addFlashAttribute("nic", nic);
		
		
		return new RedirectView("/GetCustomerProfileRe") ;
		
		
	}
	
	@RequestMapping("/GetCustomerProfileRe")
	public  RedirectView customerProfile(@Valid Customer customer, BindingResult result,Model model,RedirectAttributes redirectAttributes) {
        model.addAttribute("customer",customer);
        //Do the Registration logic and then redirect to home page without using action for home page
      
        String NIC = (String)model.asMap().get("nic");
        
       redirectAttributes.addFlashAttribute("nic", NIC);
       
       System.out.println("Methanta enwa  Profile");
       System.out.println(NIC);
		
		System.out.println("Hiii admin");
		
		
		CustomerController ev= new CustomerController();
		List<Event> evlst = new ArrayList<Event>();
		
	//name=(ename.replaceAll("\\p{P}",""));
	//vlst=ev.geteventDetails(ename);		
		//odel.put("message", evlst);
		//edirectAttributes.addFlashAttribute("message", evlst);
		return new RedirectView("/CustomerDetailsProfile");
		//return evlst;
		
		
	}

	@RequestMapping("/selectEventCus/{nic}")
	public List<Event> selectEventCus(@PathVariable String nic) {
	System.out.println("Divvvvvyaaaniiiii");
	EveeentController ev= new EveeentController();
	List<Event> evlst = new ArrayList<Event>();
	//System.out.println(nic);
	
	//ename=(ename.replaceAll("\\p{P}",""));
	evlst=ev.getCusEvent(nic);
	return evlst;
	
	}
	@RequestMapping("/EventDetails/{ename}")
	public  RedirectView EventDetails(@PathVariable String ename,@Valid Event customer, BindingResult result,Model model,RedirectAttributes redirectAttributes) {
        model.addAttribute("customer",customer);
        //Do the Registration logic and then redirect to home page without using action for home page
       
       redirectAttributes.addFlashAttribute("customerEmail", customer.getEname());
		
		System.out.println("Hiii admin");
		
		String name=ename;
		EveeentController ev= new EveeentController();
		List<Event> evlst = new ArrayList<Event>();
		
	//name=(ename.replaceAll("\\p{P}",""));
	//vlst=ev.geteventDetails(ename);		
		//odel.put("message", evlst);
		//edirectAttributes.addFlashAttribute("message", evlst);
		return new RedirectView("/EventDtls");
		//return evlst;
		
		
	}
	
	
}
