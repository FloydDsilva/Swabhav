package com.techlabs.file.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.techlabs.file.CSVFile;
import com.techlabs.file.FileRead;

public class FileAccessTest {

	public static void main(String[] args) {
		try {
			BufferedReader bufferedReader=new BufferedReader(new FileReader("D:\\SwabhavRepository\\Assignments\\read-display-files\\src\\com\\techlabs\\file\\test\\Cricket.csv"));
			String line;
			String splitby=",";
			while((line=bufferedReader.readLine())!=null) {
				String data[]=line.split(splitby);
				System.out.println("Name:"+data[0]+" Age:"+data[1]+" Score:"+data[2]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CSVFile csv=new CSVFile("D:\\SwabhavRepository\\Assignments\\read-display-files\\src\\com\\techlabs\\file\\test\\Cricket.csv", ",");
		csv.readCSVFile();
		csv.displayCSVFile();
		String data[][]=csv.getCSVFile();
		System.out.println("using");
		useCSVFile(data);
		System.out.println("CSV File");
		FileRead csvfile=new FileRead("D:\\SwabhavRepository\\Assignments\\read-display-files\\src\\com\\techlabs\\file\\test\\Cricket.csv", ",");
		csvfile.readFile();
		csvfile.displayFile();
		
		System.out.println("XML File");
		FileRead xmlfile=new FileRead("D:\\SwabhavRepository\\Assignments\\read-display-files\\src\\com\\techlabs\\file\\test\\Students.xml", ",");
		xmlfile.readFile();
		xmlfile.displayFile();
		
		System.out.println("HTML File");
		FileRead htmlFile=new FileRead("D:\\SwabhavRepository\\Assignments\\read-display-files\\src\\com\\techlabs\\file\\test\\Students.xml", ",");
		htmlFile.readFile();
		htmlFile.displayFile();
		
	}
	public static void useCSVFile(String[][] data) {
		for (String[] line : data) {
			System.out.println("Name:"+line[0]+" Age:"+line[1]+" Score:"+line[2]); 
			  System.out.println();
			}
	}
}
