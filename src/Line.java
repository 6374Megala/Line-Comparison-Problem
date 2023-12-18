public class Line implements Comparable<Line>{
    private double x1, y1, x2, y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }
    public  boolean equals(Object obj) {
        if (this == obj) return true;

        Line otherLine = (Line) obj;

        return Double.compare(otherLine.getX1(), getX1()) == 0 &&
                Double.compare(otherLine.getY1(), getY1()) == 0 &&
                Double.compare(otherLine.getX2(), getX2()) == 0 &&
                Double.compare(otherLine.getY2(), getY2()) == 0;
    }
    public double length(){
        double length=Math.sqrt(Math.pow((getX2()-getX1()),2)+Math.pow((getY2()-getY1()),2));
        return length;
    }

    @Override
    public int compareTo(Line o) {

        if (this.equals(o)) {
            return 0; // Lines are equal
        } else {
            // Compare lines based on their lengths
            double thisLength = length();
            double otherLength = o.length();
            return Double.compare(thisLength, otherLength);
        }
    }
}
