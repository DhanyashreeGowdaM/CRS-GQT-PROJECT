class Player{
	String name;
	int age;
	int matches;
	float average;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	
}

class Cricketer extends Player{
	int runs;
	int hundreds;
	int fifties;
	int wickets;
	int catches;
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getHundreds() {
		return hundreds;
	}
	public void setHundreds(int hundreds) {
		this.hundreds = hundreds;
	}
	public int getFifties() {
		return fifties;
	}
	public void setFifties(int fifties) {
		this.fifties = fifties;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public int getCatches() {
		return catches;
	}
	public void setCatches(int catches) {
		this.catches = catches;
	}
	
}

class Footballer extends Player{
	int fouls;
	int cards;
	int speeds;
	int goals;
	int saves;
	public int getFouls() {
		return fouls;
	}
	public void setFouls(int fouls) {
		this.fouls = fouls;
	}
	public int getCards() {
		return cards;
	}
	public void setCards(int cards) {
		this.cards = cards;
	}
	public int getSpeeds() {
		return speeds;
	}
	public void setSpeeds(int speeds) {
		this.speeds = speeds;
	}
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
	public int getSaves() {
		return saves;
	}
	public void setSaves(int saves) {
		this.saves = saves;
	}
	
}
public class Sample {

	public static void main(String[] args) {
		Cricketer c = new Cricketer();
		Footballer f = new Footballer();

		System.out.println(c.getName());//Player
		System.out.println(c.getAge());//Player
		System.out.println(c.getMatches());//Player
		System.out.println(c.getRuns());//Cricketer
		System.out.println(c.getWickets());//Cricketer
		System.out.println(c.getHundreds());//Cricketer
		System.out.println(c.getFifties());//Cricketer
		System.out.println(c.getCatches());//Cricketer
		System.out.println(c.getAverage());//Player
	}

}
