package com.techlabs.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	protected final String path;
	protected String delimiter;
	protected BufferedReader bufferedReader;
	
	public FileRead(String path) {
		this.path = path;
	}

	public FileRead(String path, String delimiter) {
		this.path = path;
		this.delimiter = delimiter;
	}

	public void readFile() {
		try {
			bufferedReader=new BufferedReader(new FileReader(path));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void displayFile() {
		String line;
		try {
			while((line=bufferedReader.readLine())!=null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getPath() {
		return path;
	}
	public String getDelimiter() {
		return delimiter;
	}
	
	
}
