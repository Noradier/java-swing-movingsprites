package id.ac.its.benny.ShootingMissiles;

public class Asteroid extends Sprite{
	private int x;
	private int y;
	
	public Asteroid(int x, int y) {
		super(x,y);
		
		initAsteroid();
	}
	
	private void initAsteroid() {
		
		loadImage("src/resources/asteroid.png");
		getImageDimensions();
	}
}
