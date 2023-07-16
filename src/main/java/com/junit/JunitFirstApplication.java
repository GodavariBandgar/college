package com.junit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.junit.calculator.Calculators;

@SpringBootApplication
public class JunitFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(JunitFirstApplication.class, args);
		
		Calculators calculators = new Calculators();
		int div = calculators.div(1056425,652230555);
		int mul = calculators.mul(10, 5);
		int sum = calculators.sum(10, 56);
		int sub = calculators.sub(656, 86);
		System.out.println("This is the divsion"+div);
		System.out.println("This is the multiplications"+mul);
		System.out.println("This is the sum of two "+sum);
		System.out.println("This is the subtration of two"+sub);
		
		
		
	}

}
