package com.skemty.web;

import java.util.logging.Logger;

import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Service;

import com.skemty.Service.UserManager;
import com.skemty.util.MailManager;

/**
 * This class is a controller to handle the Ajax requests from the Admin UI. It
 * leverages Direct Web Remoting (DWR) to simplify the Ajax coding.
 * 
 * @param <shoppingCartItems>
 */

@Service
@RemoteProxy(name = "AjaxController")
public class AjaxController<shoppingCartItems> {
	private static final Logger logger = Logger.getLogger(UserController.class.getName());
	
	@Autowired
	private UserManager userManager;



	@Autowired
	private MailManager mailManager;
	@Autowired(required = false)
	AuthenticationManager authManager;


}
