package com.techlabs.action;

import java.io.File;
import java.io.FileInputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import com.opensymphony.xwork2.Action;

public class ImageAction implements Action {

	private String name;
	private File image;
	private String msg;

	private Connection connection;

	public ImageAction() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/aurionpro2?" + "user=root&password=root");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String execute() {
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("INSERT INTO IMAGE_UPLOAD(NAME,IMAGE) VALUES(?,?)");
			preparedStatement.setString(1, name);
// for inserting image in database
			FileInputStream inputStream = new FileInputStream(image);
			preparedStatement.setBinaryStream(2, inputStream);
			int i = preparedStatement.executeUpdate();
			setName("");
			if (i > 0) {
				setMsg("Image successfully inserted.");
			} else {
				setMsg("Something gone wrong.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}