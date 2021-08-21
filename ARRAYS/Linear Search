import java.util.*;

import java.io.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt (); //taking input size of array
    int[] arr = new int[n]; //array declaration
    for (int i = 0; i < n; i++)
    {
      arr[i] = scn.nextInt ();  //input array elements
    }
    int data = scn.nextInt ();  // input data to match in array
    int idx = -1;   //set our answer to -1 if we do not find our element
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] == data)
      {
        idx = i;
        break;
      }
    }
    System.out.println (idx); // it prints the index if number is present, else -1.
  }
}
