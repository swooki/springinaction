package com.springinaction.knights.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springinaction.knights.BraveKnight;
import com.springinaction.knights.Knight;
import com.springinaction.knights.Minstrel;
import com.springinaction.knights.Quest;
import com.springinaction.knights.SlayDragonQuest;

@Configuration
public class KnightConfig {
	@Bean
	public Knight knight() {
		return new BraveKnight(quest(), minstrel());
	}
	@Bean
	public Quest quest() {
		return new SlayDragonQuest(System.out);
	}
	
	@Bean
	public Minstrel minstrel() {
		return new Minstrel(System.out);
	}
}
