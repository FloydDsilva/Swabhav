package com.techlabs.organization.loaders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;

import com.techlabs.organization.employee.Employee;

public class EmployeeURLDataLoader implements ILoadable<Employee>{
	HashSet<Employee> empSet=new HashSet<Employee>();
	BufferedReader br=null;
	private final String path;
	
	public EmployeeURLDataLoader(String path) {
		this.path=path;
	}

	public void parse() throws IOException {
		String line="";
		while((line=br.readLine())!=null) {
			String values[] = line.split(",");
			empSet.add(Employee.parseEmp(values));
		}
	}

	@Override
	public HashSet<Employee> loadData() {
		try {
			URL  url=new URL(path);
			HttpURLConnection connection=(HttpURLConnection) url.openConnection();
			InputStream inputStream=connection.getInputStream();
			br=new BufferedReader(new InputStreamReader(inputStream));
			parse();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return empSet;
	}
}
