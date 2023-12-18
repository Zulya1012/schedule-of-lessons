  import java.util.Scanner;
  public class raspisaniye {
    public static void main(String[] arg) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Select day of week:");
      System.out.println("1.Monday");
      System.out.println("2.Tuesday");
      System.out.println("3.Wednesday");
      System.out.println("4.Thursday");
      System.out.println("5.Friday");
      int x = sc.nextInt();
      switch (x) {
      default:
        System.out.println("selected incorrectly");
        break;
      case 1:
        System.out.println("Russian language, mathematics, chemistry, physical training");
        break;
      case 2:
        System.out.println("physics, mathematics, biology, literature");
        break;
      case 3:
        System.out.println("mathematics, geography, russian language, technology");
        break;
      case 4:
        System.out.println("drawing, art, music, mathematics");
        break;
      case 5:
        System.out.println("russian language, literature, mathematics, informatics");
        break;

      }
    }
  }
