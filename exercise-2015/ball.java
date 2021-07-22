import java.util.Arrays;

public class ball {
    private double x, y, xStep, yStep;

    public ball(double x, double y, double xStep, double yStep){
        this.x = x;
        this.y = y;
        this.xStep = xStep;
        this.yStep = yStep;
    }

    // 6 setters

    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setXStep(double xStep){
        this.xStep = xStep;
    }
    public void setYStep(double yStep){
        this.yStep = yStep;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void setXYStep(double xStep, double yStep){
        this.xStep = xStep;
        this.yStep = yStep;
    }

    // getters

    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getXStep(){
        return this.xStep;
    }
    public double getYStep(){
        return this.yStep;
    }
    public double[] getXY(){
        double[] results = new double[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }
    public double[] getXYStep(){
        double[] results = new double[2];
        results[0] = this.xStep;
        results[1] = this.yStep;
        return results;
    }

    // tostring
    
    public String toString(){
        return "Ball@("+x+","+y+"),Speed=("+xStep+","+yStep+")";
    }

    // method

    public ball move(){
        x += xStep;
        y += yStep;
        return this;
    }

    // test driver

    public static void main(String[] args) {

        ball b1 = new ball(1, 2, 11, 12);
        System.out.println(b1);

        b1.setX(3);
        b1.setY(4);
        b1.setXStep(13);
        b1.setYStep(14);
        System.out.println(b1);

        System.out.println("x is: "+b1.getX());
        System.out.println("y is: "+b1.getY());
        System.out.println("xstep is: "+b1.getXStep());
        System.out.println("ystep is: "+b1.getYStep());

        b1.setXY(5, 6);
        b1.setXYStep(15, 16);
        System.out.println(b1);
        
        System.out.println("x and y are: "+Arrays.toString(b1.getXY()));
        System.out.println("xstep and ystep are: "+Arrays.toString(b1.getXYStep()));

        System.out.println(b1.move().move().move());
    }
}
