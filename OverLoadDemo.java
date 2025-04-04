package viswajith;


	class OverLoadDemo {
	    void area(float x) {
	        System.out.println("The area of the square is " + (x * x) + " sq units");
	    }

	    void area(float x, float y) {
	        System.out.println("The area of the rectangle is " + (x * y) + " sq units");
	    }

	    void area(double x) {
	        double z = Math.PI * x * x;
	        System.out.println("The area of the circle is " + z + " sq units");
	    }
	}

	class OverLoad {
	    public static void main(String args[]) {
	        OverLoadDemo ob = new OverLoadDemo();
	        ob.area(5.0f);
	        ob.area(11.0f, 12.0f); 
	        ob.area(2.5); 
	        }
	}


