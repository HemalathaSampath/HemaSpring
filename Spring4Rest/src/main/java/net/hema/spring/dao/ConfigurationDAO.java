package net.hema.spring.dao;

import java.util.ArrayList;
import java.util.List;

import net.hema.spring.model.Configuration;

public class ConfigurationDAO {


	// Dummy database. Initialize with some dummy values.
	private static List<Configuration> config;
	{
		config = new ArrayList<Configuration>();
		config.add(new Configuration( "jdbc:oracle:thin:@localhost:1521:xe", "Hema", "password","oracle.jdbc.driver.OracleDriver"));
		
	}

	/**
	 * Returns list of customers from dummy database.
	 * 
	 * @return list of customers
	 */
	public List<Configuration> list() {
		return config;
	}

	

}
