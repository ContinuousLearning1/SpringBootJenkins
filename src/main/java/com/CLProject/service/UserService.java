package com.CLProject.service;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CLProject.dao.UserRepository;
import com.CLProject.entity.User;


import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class UserService {

	@Autowired
	private UserRepository dao;
	public User AddUser(User us) {
		if (us.getEmail() == null || us.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Email must be provided.");
        }
		return dao.save(us);
	}
	public List<User> GetDetails() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	
	public void getresponse(HttpServletResponse response) throws Exception{
		List<User> data=dao.findAll();
		HSSFWorkbook workbook=new HSSFWorkbook();
		HSSFSheet sheet=workbook.createSheet("User_Details");
		
		HSSFRow row=sheet.createRow(0);
		row.createCell(0).setCellValue("SNO");
		row.createCell(1).setCellValue("User_id");
		row.createCell(2).setCellValue("Name");
		row.createCell(3).setCellValue("Email");
		row.createCell(4).setCellValue("Password");
		row.createCell(5).setCellValue("ProfileUrl");
		
		
		int rowIndex=1;
		
		for(User ds:data) {
			HSSFRow datarow=sheet.createRow(rowIndex);
			datarow.createCell(0).setCellValue(rowIndex);
			datarow.createCell(1).setCellValue(ds.getId());
			datarow.createCell(2).setCellValue(ds.getName());
			datarow.createCell(3).setCellValue(ds.getEmail());
			datarow.createCell(4).setCellValue(ds.getPassword());
			datarow.createCell(5).setCellValue(ds.getProfileImage());
			
			rowIndex++;
		
		}
		
		ServletOutputStream output= response.getOutputStream();
		workbook.write(output);
		workbook.close();
		output.close();
		
	}
	public long GetCount() {
		// TODO Auto-generated method stub
		return dao.count();
	}
//	public User GetDetailsAsc() {
//		// TODO Auto-generated method stub
//		return dao.findAllByOrderByIdAsc();
//	}
	public User GetId(long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).orElse(null);
	}
	public User Update(long id, User us) {
		User data=dao.findById(id).orElse(null);
		if(data!=null) {
			data.setId(us.getId());
			data.setEmail(us.getEmail());
			data.setName(us.getName());
			data.setPassword(us.getPassword());
			data.setProfileImage(us.getProfileImage());
			
			return dao.save(us);
		}
		return null;
	}
	public boolean Delete(long id) {
		User data=dao.findById(id).orElse(null);
		
		// TODO Auto-generated method stub
		if(data!=null) {
			dao.delete(data);
			return true;
			
		}
		return false;
	}
	

}
