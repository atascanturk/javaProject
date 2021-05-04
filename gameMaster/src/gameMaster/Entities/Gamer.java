package gameMaster.Entities;

public class Gamer extends User {

	private int id;	
	private double money;
	
	public Gamer() {
		super();
	}

	public Gamer(int id, double money) {
		super();
		this.id = id;		
		this.money = money;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
}
