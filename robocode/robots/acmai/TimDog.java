/*
 *  Forked from timmit.nano.TimDog 0.33
 *  http://robocode-archive.strangeautomata.com/robots/timmit.nano.TimDog_0.33.jar
 */
 
package acmai;
import robocode.*;
import java.awt.Color;

public class TimDog extends AdvancedRobot {
	
	static int direction	= 1;   // 1 is forward, -1 is backward
	static double epEnergy	= 100; // enemy's previous energy
	
	public void run(){
		setColors(
			Color.green, // body
			Color.green, // gun
			Color.white  // radar
		);
		
		setAdjustGunForRobotTurn(true);
		setAdjustRadarForGunTurn(true);
		do{
			turnRadarRightRadians(1); // spin radar to find the enemy robot
		}while(true);
	}
	
	public void onScannedRobot(ScannedRobotEvent e){
		double absBearing = getHeadingRadians() + e.getBearingRadians();
		
		/* ROBOT TURN METHOD
		 * 
		 * Turn perpendicular to the enemy robot, so you can sidestep enemy bullets.
		 * Instead of turning exactly perpendicular, the robot randomly adjusts the angle
		 * a little bit to help with dodging.
		 */
		double turnAngle = relativeOf(e.getBearingRadians() + Math.PI/2);
		turnAngle -= Math.PI/4 * Math.random() * direction;
		setTurnRightRadians(turnAngle);
		
		/* ROBOT MOVE METHOD
		 * 
		 * Detect when the enemy's energy changes (they fired a bullet, or got hit by one) and
		 * move a random distance and direction to dodge it.
		 */
		if(epEnergy != (epEnergy = e.getEnergy())){ // enemy energy changed
			if(Math.random() > 0.6)
				direction = 1;
			else
				direction = -1;
				
			double distance = e.getDistance() * Math.random() + 30;
			if(e.getDistance() < 200) // confuse other robot's targeting even more
				distance = -distance;
			
			setAhead(distance * direction);
		}
		
		/* GUN TURN METHOD
		 * 
		 * Predict where to aim the gun based on the enemy's distance and speed
		 * using complicated trig stuff
		 */
		setTurnGunRightRadians(relativeOf(absBearing - getGunHeadingRadians() + Math.asin(
								e.getVelocity() * Math.sin(e.getHeadingRadians() - absBearing) / 17)));
		
		/* SHOOT METHOD
		 * 
		 * Fire a bullet. The bullet's power is based on how close you are to the enemy
		 */
		double firePower = 200 / e.getDistance() + 1;
		setFire(firePower);
		
		/* RADAR TURN METHOD
		 * 
		 * Keep the radar locked onto the enemy to track its movement and energy
		 */
		setTurnRadarRightRadians(relativeOf(absBearing - getRadarHeadingRadians()) * 2);
		scan();
	}
	
	public void onWin(WinEvent e) { // flash random colors when you win :)
		setTurnGunRight(1000);
		while(true) {
			switch((int)(Math.random() * 6)) {
				case 0: setBodyColor(Color.red); break;
				case 1: setBodyColor(Color.blue); break;
				case 2: setBodyColor(Color.green); break;
				case 3: setBodyColor(Color.orange);break;
				case 4: setBodyColor(Color.yellow);break;
				case 5: setBodyColor(Color.magenta);break;
			}
			fire(0.1);
		}
	}
	
	//HELPER METHOD//
	static double relativeOf(double r){return Math.atan2(Math.sin(r),Math.cos(r));}
}
