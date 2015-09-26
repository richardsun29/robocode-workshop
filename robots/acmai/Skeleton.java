/*
 *  Forked from timmit.nano.TimDog 0.33
 *  http://robocode-archive.strangeautomata.com/robots/timmit.nano.TimDog_0.33.jar
 */
 
package acmai;
import robocode.*;
import java.awt.Color;

public class Skeleton extends AdvancedRobot {
	
	static int direction	= 1;   // 1 is forward, -1 is backward
	static double epEnergy	= 100; // enemy's previous energy
	
	public void run(){
		// TODO: setColors
		
		setAdjustGunForRobotTurn(true);
		setAdjustRadarForGunTurn(true);
		do{
			turnRadarRightRadians(1);
		}while(true);
	}
	
	public void onScannedRobot(ScannedRobotEvent e){
		double absBearing = getHeadingRadians() + e.getBearingRadians();
		
		//ROBOT TURN METHOD//
		double turnAngle = 0.1;
		//double turnAngle = relativeOf(e.getBearingRadians() + Math.PI/2);
		// TODO: direction random offset
		setTurnRightRadians(turnAngle);
		
		//ROBOT MOVE METHOD//
		if(epEnergy != (epEnergy = e.getEnergy())){ // enemy energy changed
			// TODO: direction
			
			// TODO: distance	
			double distance = 0;
			
			setAhead(distance * direction);
		}
		
		//GUN TURN METHOD//
		setTurnGunLeft(10);
		//setTurnGunRightRadians(relativeOf(absBearing - getGunHeadingRadians() + Math.asin(
		//						e.getVelocity() * Math.sin(e.getHeadingRadians() - absBearing) / 17)));
		
		//SHOOT METHOD//
		// TODO: firepower
		double firePower = 1;
		setFire(firePower);
		
		//RADAR TURN METHOD//
		setTurnRadarRightRadians(relativeOf(absBearing - getRadarHeadingRadians()) * 2);
		scan();
	}
	

	public void onWin(WinEvent e) {
		setTurnGunRight(1000);
		// TODO: victory dance
	}
	
	//HELPER METHOD//
	static double relativeOf(double r){return Math.atan2(Math.sin(r),Math.cos(r));}
}
