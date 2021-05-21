package com.abhay.sb.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.abhay.sb.producer.ProducerSevice;

@Component
public class TestRunner implements CommandLineRunner {
	
	@Autowired
	private ProducerSevice ps;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		ps.send("ABCD", "Hi I am sending the data fro Producer App");
		
		System.out.println(" SENT MSG ...!!");

	}

}
