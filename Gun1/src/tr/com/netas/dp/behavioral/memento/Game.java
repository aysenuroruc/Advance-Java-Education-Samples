package tr.com.netas.dp.behavioral.memento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Game {
	
	
	private int gold;
	private int wood;
	private int level;
	
	
	
	
	public Game() {
		super();
	}


	public Game(int gold, int wood, int level) {
		super();
		this.gold = gold;
		this.wood = wood;
		this.level = level;
	}


	private Map<String,Game> games = new HashMap<String,Game>();
	
	
	public void play() {
		
		this.gold += new Random().nextInt(100);
		this.wood += new Random().nextInt(1000);
		this.level += new Random().nextInt(10);
		
		
	}


	public int getGold() {
		return gold;
	}


	public void setGold(int gold) {
		this.gold = gold;
	}


	public int getWood() {
		return wood;
	}


	public void setWood(int wood) {
		this.wood = wood;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}



	public void info() {
		
		System.out.println(this);
		
	}


	@Override
	public String toString() {
		return "Game [gold=" + gold + ", wood=" + wood + ", level=" + level + "]";
	}


	public void save(String savePointName) {
		
		Game game = new Game(this.gold, this.wood, this.level);
		this.games.put(savePointName,game);
		System.err.println("Game saved ("+savePointName+") --> "+this);
		
	}


	public void load(String savePointName) {
		
		this.wood = this.games.get(savePointName).getWood();
		this.gold = this.games.get(savePointName).getGold();
		this.level = this.games.get(savePointName).getLevel();
		
	}
	
	
	

}
