package com.techlabs.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVFile {

	protected final String path;
	protected String delimiter;
	protected BufferedReader bufferedReader;
	
	public CSVFile(String path,String delimiter) {
		this.path = path;
		this.delimiter=delimiter;
	}

	public String getPath() {
		return path;
	}
	
	public void readCSVFile() {
		try {
			bufferedReader=new BufferedReader(new FileReader(path));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void displayCSVFile() {
		String line;
		try {
			while((line=bufferedReader.readLine())!=null) {
				String data[]=line.split(delimiter);
				for(String value:data) {
					System.out.print(value+" ");
				}
				System.out.println();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String[][] getCSVFile() {
		String line;
		int lineNumber=0;
		String data[][]=new String[100][];
		int i=0;
		try {
			while((line=bufferedReader.readLine())!=null) {
				String dataline[]=line.split(delimiter);
				data[lineNumber]=dataline;
				lineNumber++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;	
	}
}
