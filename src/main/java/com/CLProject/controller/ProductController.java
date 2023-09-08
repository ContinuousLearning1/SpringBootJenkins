package com.CLProject.controller;

import java.util.List;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.CLProject.entity.Products;
import com.CLProject.service.ProductService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@CrossOrigin("http://localhost:4200")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/addProducts")
	public ResponseEntity<Products> AddProducts(@RequestBody Products products){
		Products data=service.AddProduct(products);
		return new ResponseEntity<Products>(data,HttpStatus.CREATED);
	}
	
	@GetMapping("/getProducts")
	public List<Products> GetProducts(){
		 
		return service.GetProducts();
	}
	
	@PutMapping("/{pid}")
	public Products UpdateProducts(@PathVariable long pid, @RequestBody Products product){
		
		return service.UpdateProducts(pid,product);
		
	}
	
	@DeleteMapping("{pid}")
	@CrossOrigin("http://localhost:4200")
	public ResponseEntity<String> DeleteProduct(@PathVariable long pid){
		boolean delete=service.DeleteProduct(pid);
		
		if(delete) {
		   return ResponseEntity.ok("Product deleted successfully.");
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/exceldetails")
	public void getDatainExcel(HttpServletResponse response) throws Exception {
	response.setContentType("application/octet-stream");
		
		String headerKey="Content-Disposition";
		String headervalue="attachment;filename=ItemDetails.xls";
		response.setHeader(headerKey, headervalue);
		
		service.GetExcelFile(response);
	}

	@GetMapping("/productbyid")
	public Products GetById(@RequestParam long id){
		return service.GeyByIdService(id);
	}
	
	
	
}
