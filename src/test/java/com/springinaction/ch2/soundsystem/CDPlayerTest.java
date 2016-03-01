package com.springinaction.ch2.soundsystem;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springinaction.ch2.soundsystem.CDPlayerConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
	@Rule
	public final SystemOutRule log = new SystemOutRule().enableLog();

	@Autowired(required=true)
	private MediaPlayer player;
	
	@Autowired (required=true)
	private CompactDisc cd;
	
	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
		assertNotNull(player);
	}
	
	@Test
	public void play() {
		player.play();
		assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\r\n",
				log.getLog());
	}

}
