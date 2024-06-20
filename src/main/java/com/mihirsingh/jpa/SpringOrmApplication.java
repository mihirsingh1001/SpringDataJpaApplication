package com.mihirsingh.jpa;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mihirsingh.jpa.entities.Laptop;
import com.mihirsingh.jpa.entities.Student;
import com.mihirsingh.jpa.entities.User;
import com.mihirsingh.jpa.repository.StudentRepository;
import com.mihirsingh.jpa.services.UserService;

@SpringBootApplication
public class SpringOrmApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	@Autowired
	private StudentRepository studentRepository;

	Logger logger = LoggerFactory.getLogger(SpringOrmApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringOrmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Create User
		// User user = new User();
		// user.setId(23);
		// user.setName("Pawan");
		// user.setAge(26);
		// user.setCity("Nagpur");

		// User savedUser = userService.savUser(user);

		// logger.info("save user ::: " + savedUser);

		// // ====================================================================================

		// // GetAll user
		// List<User> userList = userService.getAllUser();
		// logger.info("UserList size ::: " + userList.size());
		// logger.info("Users ::: " + userList);



		// // GetSingle user
		// User user = userService.getSingleUser(2);
		// logger.info("Users ::: " + user);

		// //======================================================================================

		// // update user
		// User user = new User();
		// user.setName("Mihir");
		// user.setAge(23);
		// user.setCity("Bhopal");

		// User updatedUser = userService.updateUser(user, 1);
		// logger.info("UpdatedUser :::: " + updatedUser);

		// //======================================================================================

		// //delete user
		// userService.deleteUser(1);


		//==========================================================================================

		//ONE TO ONE MAPPING

		Student student = new Student();

		student.setStudent_id(22);
		student.setStudent_name("Atharva Deshmukh");

		Laptop laptop = new Laptop();

		laptop.setLaptop_id(001);
		laptop.setModelNumber("Dell Vostro 221");
		laptop.setBrand("Dell");

		laptop.setStudent(student);
		student.setLaptop(laptop);

		Student std =  studentRepository.save(student);

		logger.info("Student info ::: " + std);

	}

}
