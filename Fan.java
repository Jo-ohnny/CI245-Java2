package homework_java;

public class Fan {
	
	/*- speed: int
- on : Boolean
- radius: double
- color: string
+ Fan( )
+ getSpeed( ): int
+ isOn( ) : Boolean
+ getRadius( ): double
+ getColor( ): string
+ setSpeed( value: int ) : void
+ setOn( ) : void
+ setRadius( value: double) : void
+ setColor( value: string) : void
+ toString() : string*/
	
	//Fields
	private int speed;
	private  Boolean  on ;
	private  double radius;
	private String color; 
	
	
	// Speed constants
	private static final int SLOW = 1;
	private static final int MEDIUM = 2;
	private static final int FAST = 3;
	
	//Default constructor
	public Fan() {
		speed = SLOW;
		on = false ;
		color = "Blue";
		radius = 5;
	}
	
	//speficific constructor
	public void Fan(int Nspeed,Boolean  onN,double Nradius, String Ncolor) {
		speed = Nspeed;
		on = onN ;
		color = Ncolor;
		radius = Nradius;
	}
	
	//acessors
	public int getSpeed( ) {
		return speed;
	}
	
	
	public double getRadius( ) {
		return radius;
	}
	
	
	public String getColor( ) {
		return color;
	}
	
	public boolean isOn() {
	        return on;
	    }
	
	//Mutators or seters
	public void SetSpeed( int Nspeed) {
		speed = Nspeed;
	}
	
	
	
	public void SetRadius( double Nradius) {
		radius = Nradius;
	}
	
	
	
	public void SetColor( String Ncolor) {
		 color = Ncolor;
	}
	
	
	public void setOn(boolean onN) {
        on = onN;
    }
	
	
	 // toString
    public String toString() {
        if (on) {
            return "====================================================\nThe Fan is on \n\tThe speed is: " + speed + ", \n\tcolor: " + color + ", \n\tradius: " + radius;
        } else {
            return "====================================================\nThe Fan is off \n\tThe speed is: " + speed + ", \n\tcolor: " + color + ", \n\tradius: " + radius;
        }
    }
}
