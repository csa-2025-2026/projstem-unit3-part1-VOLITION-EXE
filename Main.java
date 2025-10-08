import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Rectangle r1 = new Rectangle(2, 5);
    Rectangle r2 = new Rectangle(4, 2);

    boolean isRotated = (r1.getLength() == r2.getWidth()) && (r1.getWidth() == r2.getLength());

    boolean isCongruent = isRotated || r1.equals(r2);
    boolean isSimilar = isCongruent || ( (r1.getLength() / r2.getLength()) == (r1.getWidth() / r2.getWidth()));


    System.out.println(isRotated);
    System.out.println(isCongruent);
    System.out.println(isSimilar);
  }
}
