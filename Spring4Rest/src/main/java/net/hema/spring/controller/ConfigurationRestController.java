package net.hema.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import net.hema.spring.dao.ConfigurationDAO;
import net.hema.spring.model.Configuration;



public class ConfigurationRestController {

	@Autowired
	ConfigurationDAO configurationDAO;
	
	@GetMapping("/api/getconfigdetails")
	public List<Configuration> getCustomers() {
		return configurationDAO.list();
	}
}
