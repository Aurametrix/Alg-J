package Parkinglot;



import java.util.concurrent.ArrayBlockingQueue;

import Vehicle.Vehicle;

/**

*

*/

public class Parkinglot {



private static Parkinglot P = new Parkinglot();



private ArrayBlockingQueue<Space> q1;

private ArrayBlockingQueue<Space> q2;

private ArrayBlockingQueue<Space> q3;



private Parkinglot() {



int count = 0;

q1 = new ArrayBlockingQueue(10);

for (int i=0; i < 10; i++)

q1.add(new Space(count++, 1));

q2 = new ArrayBlockingQueue(20);

for (int i=0; i < 20; i++)

q2.add(new Space(count++, 2));

q3 = new ArrayBlockingQueue(70);

for (int i=0; i < 20; i++)

q3.add(new Space(count++, 3));



}



public Space park (Vehicle v) throws ParkingException {



Space next = null;

switch (v.getType()) {

case 1: next = q1.poll();

if (next != null) break;

case 2: next = q2.poll();

if (next != null) break;

case 3: next = q3.poll();

if (next != null) break;

default:  throw new ParkingException("Not a known vehicle type " + v.getType());

}



return next;



}



public void exit (Vehicle v) throws ParkingException {



Space free = v.getS();

switch (v.getType()) {

case 1: q1.add(free); break;

case 2: q2.add(free); break;

case 3: q3.add(free); break;

default:  throw new ParkingException("Not a known vehicle type " + v.getType());

}



}



public static Parkinglot getRef() {

return P;

}



}
