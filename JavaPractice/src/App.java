public class App {
    public static void main(String args[]) {
                String s1 = "hi";
                String s2 = "               ";
                String s3 = s1+s2;
                int x=12;
                //Complete this line
                String s = String.format("%03d", x);
                int a = Integer.parseInt(s);
        System.out.println(s3+"     "+s);
    }
}