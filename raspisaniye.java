  import java.util.Scanner;
      public class raspisaniye {
        public static void main(String[] arg) {
Scanner sc=new Scanner(System.in);
System.out.println("Viberi den nedeli:");
System.out.println("1.Ponedelnik");
System.out.println("2.Vtornik");
System.out.println("3.Sreda");
System.out.println("4.Chetverq");
System.out.println("5.Pyatnitsa");
int x=sc.nextInt();
switch(x){
default:
System.out.println("Vibrano neverno");
break;
case 1:
System.out.println("Russkiy, Matematika, Chimiya, Fizkultura");
break;
case 2:
System.out.println("Fizika, Matematika, Biologiya, Literatura");
break;
case 3:
System.out.println("Matematika, Geoqrafiya, Russkiy, Texnologiya");
break;
case 4:
System.out.println("Chercheniye, Izo, Muzika, Matematika");
break;
case 5:
System.out.println("Russkiy, Literatura, Matematika, Informatika");
break;

}
}
}
