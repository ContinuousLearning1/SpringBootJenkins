package com.CLProject.service;

import java.util.List;
import java.util.Optional;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CLProject.dao.ProductDAO;
import com.CLProject.entity.Products;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class ProductService {
	@Autowired
	private ProductDAO dao;

	public Products AddProduct(Products products) {
		// TODO Auto-generated method stub
		return dao.save(products);
	}

	public List<Products> GetProducts() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	public Products UpdateProducts(long pid, Products product) {
		// TODO Auto-generated method stub
		Products data=dao.findById(pid).orElse(null);
		if(data!=null) {
			data.setName(product.getName());
			data.setCost(product.getCost());
			data.setDescription(product.getDescription());
			data.setImages(product.getImages());
			data.setQuantity(product.getQuantity());
			
			return dao.save(data);
		}
		return null;
	}

	public boolean DeleteProduct(long pid) {
		Optional<Products> productOptional = dao.findById(pid);
       if (productOptional.isPresent()) {
          dao.delete(productOptional.get());
            return true;
       }
        return false;
	}
	
	
	public void GetExcelFile(HttpServletResponse response)throws Exception {
		List<Products> data=dao.findAll();
		HSSFWorkbook workbook=new HSSFWorkbook();
		HSSFSheet sheet=workbook.createSheet("ItemDetails");
		
		HSSFRow row=sheet.createRow(0);
		row.createCell(0).setCellValue("SNo");
		row.createCell(1).setCellValue("Item Name");
		row.createCell(2).setCellValue("Item Cost");
		row.createCell(3).setCellValue("Item Image");
		row.createCell(4).setCellValue("Item Description");
		row.createCell(5).setCellValue("Item Quantity");
		
		int RowIndex=1;
		for(Products ps:data) {
			HSSFRow rows=sheet.createRow(RowIndex);
			rows.createCell(RowIndex).setCellValue(RowIndex);
			rows.createCell(RowIndex).setCellValue(ps.getName());
			rows.createCell(RowIndex).setCellValue(ps.getCost());
			rows.createCell(RowIndex).setCellValue(ps.getImages());
			rows.createCell(RowIndex).setCellValue(ps.getDescription());
			rows.createCell(RowIndex).setCellValue(ps.getQuantity());
			RowIndex++;
			
			
		}
		
		ServletOutputStream output= response.getOutputStream();
		workbook.write(output);
		workbook.close();
		output.close();
		
	}

	public Products GeyByIdService(long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).orElse(null);
	}
	
	
	

}
