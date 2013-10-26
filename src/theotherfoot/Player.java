package theotherfoot;

//might want to derive Player, NPC from abstract entity class or something.
//for now they are separate.
public class Player {

	private String name;
	private int health;
	private int agility;
	private int wisdom;
	
	//make a constructor
	Player(String name, int health, int agility, int wisdom){
		
		//set class' values to inputed values
		this.name = name;
		this.health = health;
		this.agility = agility;
		this.wisdom = wisdom;
		
	}
}
