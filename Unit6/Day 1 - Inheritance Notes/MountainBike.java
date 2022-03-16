public class MountainBike extends Bicycle
{
 
    // the MountainBike subclass adds one more field, seatheight
    private int seatheight;
 
    // the MountainBike subclass has one constructor
    public MountainBike(int gear, int speed, int sh)
    {
        super(gear, speed);
        seatheight = sh;
    }
 
    
    public void setSeatHeight(int newValue)
    {
        seatheight = newValue;
    }
 
    //Should return: 
    //                Number of gears are 4 
    //                speed of the bicycle is 5
    //                seat height is 10
    public String toString()
    {
        return super.toString() +"\nseat height is "  + seatheight;

    }
    
}
 