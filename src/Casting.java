public class Casting {
    public static void main(String[] args) {
        short age = 5;
        int ageFloat  =  age;

        double d = 5555552442323242443434433434.2411242142115214213213213;
        float  c = (float) d;

        System.out.println(c);

        char a = 98;
        char b = 'b';

        if('b' >= 5){
            System.out.println("Ok b, jest wieksze od 5");
        }
    }
}
