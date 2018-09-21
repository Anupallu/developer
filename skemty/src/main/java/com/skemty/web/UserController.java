package com.skemty.web;

import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skemty.Service.UserManager;
import com.skemty.entity.AdminDetail;
import com.skemty.entity.Student;
import com.skemty.entity.StudentDetail;
import com.skemty.entity.WrkDetail;
import com.skemty.util.MailManager;

/**
 * @author s6
 *
 */
/**
 * @author s6
 *
 */
@Controller
public class UserController {
	private Logger LOG = Logger.getLogger(UserManager.class);
	@Autowired
	UserManager userManager;
	@Autowired
	AjaxController ajaxController;

	@Autowired
	MailManager mailManager;

	@Autowired
	AdminController adminController;

	@Autowired(required = false)
	AuthenticationManager authManager;

	@Autowired
	private HttpSession session;

/*	@RequestMapping(value = "homePage.mm",method={RequestMethod.POST,RequestMethod.GET})
	public void doHomePage() {

	}
	@RequestMapping(value = "logincredentials.mm",method={RequestMethod.POST,RequestMethod.GET})
	public void dologincredentials() {

	}*/
	@RequestMapping(value = "/homePage.mm", method = { RequestMethod.GET, RequestMethod.POST })
	public void doHomePage(ModelMap model, HttpServletRequest request,
			@RequestParam(value = "loc", required = false) String loc, HttpSession session)
			throws UnknownHostException, ParseException, SocketException {
		
	}
	@RequestMapping(value = "/logincredentials.mm", method = { RequestMethod.GET, RequestMethod.POST })
	public void dologincredentials(ModelMap model, HttpServletRequest request,
			@RequestParam(value = "name", required = false) String username, 
			@RequestParam(value = "email", required = false) String useremail, 
			HttpSession session)
			throws UnknownHostException, ParseException, SocketException {
		System.out.println("hi");
	}
}
