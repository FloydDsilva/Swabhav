package com.techlabs.action;

import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.ImageDBO;

public class RetrieveAction implements Action {
	List<ImageDBO> dataList = null;
	ResultSet rs = null;
	ImageDBO dataBean = null;
	private Connection connection;
	
	public RetrieveAction() {
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
	public String execute() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		HttpServletRequest request = ServletActionContext.getRequest();
		String id = request.getParameter("id");
		try {
			dataList = new ArrayList<>();
			rs =getData();
			if (rs != null) {
				while (rs.next()) {
					dataBean = new ImageDBO();
					dataBean.setId(rs.getInt("id"));
					dataBean.setName(rs.getString("name"));
					dataList.add(dataBean);
				}
			}
			try {
				rs = getPhoto(id);
				if (rs.next()) {
					Blob ph = rs.getBlob("image");
					byte data[] = ph.getBytes(1, (int) ph.length());
					OutputStream out = response.getOutputStream();
					out.write(data);
					out.flush();
					out.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	public ResultSet getData() {
		try {
			return connection.prepareStatement("SELECT NAME,ID FROM image_upload").executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public ResultSet getPhoto(String id) {
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT IMAGE FROM image_upload WHERE ID=?");
			ps.setString(1, id);
			return ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public List<ImageDBO> getDataList() {
		return dataList;
	}

	public void setDataList(List<ImageDBO> dataList) {
		this.dataList = dataList;
	}
}
