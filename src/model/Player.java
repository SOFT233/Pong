package model;

public class Player {
	
	private int playerId;
	private int score;
	private Paddle paddle;
	
	public int getPlayerId() {
		return playerId;
	}

	public int getScore() {
		return score;
	}
	public Paddle getPaddle() {
		return paddle;
	}
	
	public int scorePoint(){
		return 0;
	}
}
