import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lap = 0;
        int auxX = 0;
        int auxY = 0;
        boolean boost_ = true;
        boolean first_ = true;
        // game loop
        while (true) {
            String speed = "100";
            //lap = lap + 1;
            
            int x = in.nextInt();
            int y = in.nextInt();
            int nextCheckpointX = in.nextInt(); // x position of the next check point
            int nextCheckpointY = in.nextInt(); // y position of the next check point
            int nextCheckpointDist = in.nextInt(); // distance to the next checkpoint
            int nextCheckpointAngle = in.nextInt(); // angle between your pod orientation and the direction of the next checkpoint
            int opponentX = in.nextInt();
            int opponentY = in.nextInt();

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            System.err.println(lap);
            System.err.println(nextCheckpointDist);

            // You have to output the target position
            // followed by the power (0 <= thrust <= 100)
            // i.e.: "x y thrust"
            
            if (nextCheckpointDist > 1500) {
            
                if ((nextCheckpointAngle > 90) || (nextCheckpointAngle < -90)) {
                    if (nextCheckpointDist < 10000) {
                        speed = "8";
                    }
                    else {
                        speed = "30";
                    }
                    //boost_ = false;
                }
                else if ((nextCheckpointAngle == 90) || (nextCheckpointAngle == -90)) {
                    if (nextCheckpointDist < 10000) {
                        speed = "10";
                    }
                    else {
                        speed = "40";
                    }
                    //boost_ = false;
                }
                else {
                    if (((nextCheckpointAngle < 1) || (nextCheckpointAngle > -1)) && boost_) {
                        if (nextCheckpointDist > 5500) {
                            speed = "BOOST BOOST";
                            boost_ = false;
                        }
                        else {
                            speed = "100";
                        }
                    }
                    else {
                        speed = "100";
                    }
                }
            
            }
            else {
                if (nextCheckpointDist > 1200) {
                    speed = "80";
                }
                else if (nextCheckpointDist > 800) {
                    speed = "50";
                }
                else {
                    speed = "15";
                }
            }
            
            System.out.println(nextCheckpointX + " " + nextCheckpointY + " " + speed);
        }
    }
}
