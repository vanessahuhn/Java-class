/*correction exercices 1*/

public class Name{
    public static void main(String[]args){
        /*var ex2*/
        int nb1=74;
        int nb2=36;
        int nb3=5;
        int nb4=10;
        int nb5=15;
        int nb6=10;
        int sum=nb1+nb2+nb3+nb4+nb5+nb6;

        /*var ex3*/
        double nb7 = 50;
        double nb8 = 3;
        double div1 = nb7/nb8;

        /*var ex4*/
        int suma = -5 + 8 * 6;
        int sumb = (55+9) % 9 ;
        double sumc = 20 + -3*5 / 8 ;
        double sumd = 5+15/3*2-8%3;

        /*var ex5*/
        int fstnb = 25;
        int sdnb = 5;
        int exout = fstnb *  sdnb;


        /*met ex1*/
        System.out.println("Hello");
        System.out.println("Jean-Baptiste");

        /*met ex2*/
        System.out.println(sum);

        /*met ex3*/
        System.out.println(div1);

        /*met ex4*/
        System.out.println(suma);
        System.out.println(sumb);
        System.out.println(sumc);
        System.out.println(sumd);

        /*met ex5*/
        System.out.println(fstnb + "*"+ sdnb + "=" + exout);
    }

}

public class Exo{
    public static void main(String[]args){

        //exo 6
        int fstnbr = 125;
        int sdnbr  = 24;
        int res = fstnbr + sdnbr;
        String plus = "+";
        String egale = "=";
        System.out.println(fstnbr + plus + sdnbr + egale + res);

        //exo 7
        int fstnbr1 = 125;
        int sdnbr2 = 24;
        int div = fstnbr1 / sdnbr2;
        System.out.println(fstnbr1 + " / " + sdnbr2 + " = " + div);

        //exo 8
        int fstnbr2 = 125;
        int sdnbr3 = 24;
        int mod = fstnbr2 % sdnbr3;
        System.out.println(fstnbr2 + " mod " + sdnbr3 + " = " + mod);

        //exo 9
        int bb = 1;
        while ( bb < 11){
            System.out.println(8 + "*" + bb + "=" + (8 * bb) );
            bb++;
            }

        //exo 10
        double a=25.5;
        double b=3.5;
        double c=40.5;
        double d=4.5;

        double e=(a*b-b*b);
        double f=(c-d);

        System.out.println(e/f);

        //exo 11
        double result= 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(result);

        //exo 12
        double note1= 15.5;
        double note2= 12.1;
        double note3= 19.7;
        double average= (note1 + note2 + note3)/3;
        System.out.println(average);

        //exo 13
        int A = 1;
        int B = 2;
        int C = 0;
        System.out.println("avant" + A + " " + B);
        C = A;
        A = B;
        B = C;

        System.out.println("après" + A + " " + B);


    }

}

public class MyClass {
   public static void main(String args[]) {
       String verre1="tea";
       String verre2="water";
       String verreVide;

       verreVide=verre1;
       verre1=verre2;
       verre2=verreVide;

       System.out.println(verre1);
       System.out.println(verre2);
   }
}
