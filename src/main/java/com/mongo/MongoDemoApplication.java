package com.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoDemoApplication /*implements CommandLineRunner*/{



	public static void main(String[] args) {
		SpringApplication.run(MongoDemoApplication.class, args);
	}


	/*@Override
	public void run(String... strings) throws Exception {
        Student student = studentRepository.findByName("Nagendra");
        if(student != null){
         System.out.println("Student with name " + student.getName() + " already exists");
        }else {
            studentRepository.save(new Student("Nagendra", 24));
        }


        //fetch Students
        List<Student> allStudents = studentRepository.findAll();


    }*/
}
