package ex04.di;

import org.springframework.beans.factory.annotation.Autowired;

public class Soccer {
	
	@Autowired
	private PlayerImpl  player;

	public void setPlayer(PlayerImpl player) {
		this.player = player;
	}
}
