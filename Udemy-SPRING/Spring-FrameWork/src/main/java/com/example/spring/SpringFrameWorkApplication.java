package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.spring.enterprise.example.web.MyWebController;
import com.example.spring.game.GameRunner;

@SpringBootApplication
public class SpringFrameWorkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringFrameWorkApplication.class, args);
		//MarioGame game = new MarioGame();
		//GamingConsole game = new PackManGame();
		//SuperContraGame game = new SuperContraGame();
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
		
		MyWebController controller = context.getBean(com.example.spring.enterprise.example.web.MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
		
		
	}

}
