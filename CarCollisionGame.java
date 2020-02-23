
import java.util.Random;


// ...
// write here all missing classes
// ...
class Car {
	int number;
	public void setLives(int n) {
		 number = n;
	}

	public boolean hasLives() {
		if(getLives() != 0) {
			return true;
		}else{
			return false;
		}
	}

	public int hit() {
	return this.number;
	}


	public int getLives() {
		return this.number;
	}
}

class Score extends Obstacle {
	int s;
	public int increment() {
		s = number + intensity;
		return s;
	}

}

class Obstacle extends Car {

	int intensity;
	public void setIntensity(int i) {
		intensity = i;

	}
}

class Truck extends Obstacle {
	int lives;
	public Truck(){
		lives = this.number - intensity;

	}

}

class Pillar extends Obstacle {
	int lives;
	public Pillar(){
		lives = this.number - intensity;
	}
}

class Life extends Obstacle {
	int lives;
	public Life() {
		lives = this.number + intensity;
	}
}




public class CarCollisionGame {
	public static void main(String[] args) {
		
		Random random = new Random();
		Car c = new Car();
		c.setLives(10);
		
		Score s = new Score();
		while(c.hasLives()) {
			if (random.nextDouble() < .75) {
				System.out.println("Ouch! Obstacle hit!");
				Obstacle o = null;
				double r = random.nextDouble();
				if (r < 0.4) {
					o = new Truck(); // this should decrease the number of lives
					System.out.println("  That was a truck!");
				} else if ( r > 0.6) {
					o = new Pillar(); // this should decrease the number of lives
					System.out.println("  That was a pillar!");
				} else {
					o = new Life(); // this should increase the number of lives
					System.out.println("  That was a new life! Hurray :)");
				}
				o.setIntensity(1 + random.nextInt(3));
				c.hit();
				System.out.println("  Car has now " + c.getLives() + " lives");
			} else {
				System.out.println("No obstacles hit");
			}
			s.increment();
		}
		
		System.out.println("Game over");
		System.out.println("Final score is " + s);
	}



}
