package com.example.inversion_control;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class MobilesConfig {
	
	@Bean
	public Color getColor() {
		return new Color();
	}
	
	@Bean
	public Mobiles getOneplusObject(Color getColor)
	{
		return new Oneplus(getColor);
	}
	@Bean
	public Mobiles getIphoneObject(Color getColor)
	{
		return new Iphone(getColor);
	}
}
