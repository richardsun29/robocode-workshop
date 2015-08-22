package richard;
import robocode.JuniorRobot;

public class Richard extends JuniorRobot {

	/**
	 * MyFirstJuniorRobot's run method - Seesaw as default
	 */
	int moveAngle;
	public void run() {
		moveAngle = 0;
		// Set robot colors
		setColors(green, black, blue, red, purple);
		
		while (true) {
		
			turnGunRight(360);
			turnTo(moveAngle);
			ahead(100);
		}
	}

	/**
	 * When we see a robot, turn the gun towards it and fire
	 */
	public void onScannedRobot() {
		// Turn gun to point at the scanned robot
		//turnTo(scannedAngle);
		//turnGunTo(scannedAngle);
		//ahead(scannedDistance);
		moveAngle = scannedAngle;
		// Fire!
		fire(1);
		
		
	}

	/**
	 * We were hit!  Turn and move perpendicular to the bullet,
	 * so our seesaw might avoid a future shot.
	 */
	public void onHitByBullet() {
		// Move ahead 100 and in the same time turn left papendicular to the bullet
		//turnAheadLeft(100, 90 - hitByBulletBearing);
	}

	public void onHitWall() {
		//turnRight(180);
	}
}
