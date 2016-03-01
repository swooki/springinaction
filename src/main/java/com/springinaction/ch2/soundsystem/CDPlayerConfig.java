package com.springinaction.ch2.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
	@Bean
	public CompactDisc sgtPappers() {
		return new SgtPappers();
	}
	
	@Bean
	public CDPlayer cdPlayer() {
		return new CDPlayer(sgtPappers());
	}
}
