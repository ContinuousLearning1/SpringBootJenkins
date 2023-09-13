package com.CLProject;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ClProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClProjectApplication.class, args);
		System.out.println("Applications started");
	}

//	@Autowired
//	private AdminDAO dao;
	
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		AdminEntity ae=new AdminEntity();
//		ae.setId(10002);
//		ae.setName("Admin1");
//		ae.setPassword("password123");
//		dao.save(ae);
//	}

}
