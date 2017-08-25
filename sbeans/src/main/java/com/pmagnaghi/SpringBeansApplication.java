package com.pmagnaghi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringBeansApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBeansApplication.class, args);

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for ( String name : beanNames ){
			System.out.println(name);
		}
	}
}
