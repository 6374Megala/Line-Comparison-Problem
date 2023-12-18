public class Main {
    public static void main(String[] args) {

        Line line1 = new Line(1, 2, 4, 6);
        Line line2 = new Line(1, 5, 4, 6);
        double len=line1.length();
        boolean c=line1.equals(line2);
        int com=line1.compareTo(line2);

        System.out.println(len);
        System.out.println(c);
        System.out.println(com);
    }



}