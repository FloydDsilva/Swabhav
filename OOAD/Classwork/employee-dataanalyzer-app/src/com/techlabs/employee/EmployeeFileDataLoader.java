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

public class EmployeeFileDataLoader {
	HashSet<Employee> empSet=new HashSet<Employee>();
	BufferedReader br=null;
	

	public HashSet<Employee> loadEmployeesFile(String path) {
		try {
			br=new BufferedReader(new FileReader(path));
			parse();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empSet;
	}
	
	public void parse() throws IOException {
		String line="";
		while((line=br.readLine())!=null) {
			String values[] = line.split(",");
			loadEmp(values);
		}
	}
	private void loadEmp(String[] values) {
		int id=Integer.parseInt(values[0]);
		String name=values[1];
		String designation=values[2];
		Integer managerId=convertNull(values[3]);
		String doj=values[4];
		int salary=Integer.parseInt(values[5]);
		Integer commission=convertNull(values[6]);
		int deptNo=Integer.parseInt(values[7]);
		empSet.add(new Employee(id, name, designation, managerId, doj, salary, commission, deptNo));
	}

	private Integer convertNull(String string) {
		if(string.equalsIgnoreCase("null")) {
			return null;
		}
		return Integer.parseInt(string);
	}
	
	
}
