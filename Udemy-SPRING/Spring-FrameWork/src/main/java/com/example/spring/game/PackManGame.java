package com.example.spring.game;

import org.springframework.stereotype.Component;

@Component
public class PackManGame implements GamingConsole{

	@Override
	public void up() {
		System.out.println("PackManGame UP");
	}

	@Override
	public void down() {
		System.out.println("PackManGame DOWN");
	}

	@Override
	public void right() {
		System.out.println("PackManGame RIGHT");
	}

	@Override
	public void left() {
		System.out.println("PackManGame LEFT");
	}

}
