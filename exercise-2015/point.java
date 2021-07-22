public class point {
    private int x, y; //variables

    //constructor
    public point(){
        this.x = 0;
        this.y = 0;
    }

    public point(int x, int y){
        this.x = x;
        this.y = y;
    }

    // setters
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    // getters

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int[] getXY(){
        int[] results = new int[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }

    // tostring

    public String toString(){
        return "("+x+","+y+")";
    }

    // methods

    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }

    public double distance(point another){
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }

    public double distance(){
        return Math.sqrt(this.x*this.x+this.y*this.y);
    }

    // test driver
    public static void main(String[] args) {
        point p1 = new point(1,2);
        System.out.println(p1);

        point p2 = new point();
        System.out.println(p2);

        p1.setX(3);
        p1.setY(4);
        System.out.println(p1);
        System.out.println("x is: "+p1.getX());
        System.out.println("y is: "+p1.getY());

        p1.setXY(5, 6);
        System.out.println(p1);
        System.out.println("x is: "+p1.getXY()[0]);
        System.out.println("y is: "+p1.getXY()[1]);

        p2.setXY(10, 11);
        System.out.printf("distance is %.2f%n",p1.distance(10,11));
        System.out.printf("distance is %.2f%n",p1.distance(p2));
        System.out.printf("distance is %.2f%n",p2.distance(p1));
        System.out.printf("distance is %.2f%n",p1.distance());

    }
}
