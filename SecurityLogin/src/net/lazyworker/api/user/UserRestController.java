package net.lazyworker.api.user;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v0")
public class UserRestController {
	
	@PostConstruct
	void init() {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.DEBUG);
	}	
	
	public static Logger logger = Logger.getLogger(UserRestController.class);
	
	@RequestMapping("/{resources}")
//	@CrossOrigin(origins="http://alan.biz.tm")
	public String user(@PathVariable String resources, HttpServletResponse resp) {
//		resp.setHeader("orgin", "http://alan.biz.tm");
//		resp.setHeader("Access-Control-Allow-Credentials", "true");
//		resp.setHeader("Access-Control-Allow-Origin'", "true");
		
		logger.info("resources: "+resources);
		return "{ \"success\" : true }";  
	}
}
