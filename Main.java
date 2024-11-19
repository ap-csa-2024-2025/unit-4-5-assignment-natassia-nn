import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Make sure to test your methods here
  }

  public static void printNTimes(String word, int N)
  {
    for (int i = 0; i < word.length(); i++)
    {
      String L = word.substring(i, i+1);
      for (int j = 0; j < N; j++)
      {
        System.out.println(L);
      }
    }
  }

  public static void printNums()
  {
    for ()
    {
      for (int repeater = 0; repeater < 10; repeater++)
      {
        System.out.print(10 + " ");
      }
      System.out.println();
    }

    for (int i = 0; i < 9; i++)
    {
      System.out.println(9 + " ");
    }
    System.out.println();
    // code solution here
  }

  public static void uprightNumberTriangle(int N)
  {
    for (int row = 1; row <= N; row++)
    {
      for (int num = 1; num<=row; num++)
      {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }

  public static void starTree()
  {
    int num_of_spaces = 0;
    for (int row = 9; row>= 1; row--)
    {
        for (int space = 0; space < num_of_spaces; spaces)
    }
    
    for ()
    {

    }

    System.out.println();
  }

  public static void multTable()
  {
    for (int row = 1; row <= 10; row++)
    {
      for (int col = 1; col <= 10; col++)
      {

      }
    }
    // code solution here
  }
}
