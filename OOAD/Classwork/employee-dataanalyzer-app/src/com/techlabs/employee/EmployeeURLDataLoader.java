package com.techlabs.employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;

public class EmployeeURLDataLoader {
	HashSet<Employee> empSet=new HashSet<Employee>();
	BufferedReader br=null;

	public HashSet<Employee> loadEmployeesURL(String urlString) {
		try {
			URL  url=new URL(urlString);
			HttpURLConnection connection=(HttpURLConnection) url.openConnection();
			InputStream inputStream=connection.getInputStream();
			br=new BufferedReader(new InputStreamReader(inputStream));
			parse();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return empSet;
	}
	
	public void parse() throws IOException {
		String line="";
		while((line=br.readLine())!=null) {
			String values[] = line.split(",");
			empSet.add(Employee.parseEmp(values));
		}
	}
}
