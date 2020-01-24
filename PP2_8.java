//**************************************************************
// PP2_8.java     Author: Luc Barenghien
//
// Converts a user's inputted time in days, hours, minutes,
// and seconds into seconds and days
//**************************************************************

import java.util.Scanner;
import java.text.NumberFormat;

public class PP2_8
{
  public static void main(String[] args)
  {
    final int day_sec = 86400;
    final int hour_sec = 3600;
    final int min_sec = 60;
    Scanner myObj = new Scanner(System.in);
    System.out.println("enter days");
    int days = myObj.nextInt();
    System.out.println("enter hours");
    int hours = myObj.nextInt();
    System.out.println("enter minutes");
    int minutes = myObj.nextInt();
    System.out.println("enter seconds");
    int seconds = myObj.nextInt();
    float output = (days*day_sec)+(hours*hour_sec)+(minutes*min_sec)+seconds;
    float days_output = (output/day_sec);
    NumberFormat fm1 = NumberFormat.getNumberInstance();
    fm1.setMinimumFractionDigits(2);
    int new_output = (int) output;
    System.out.println("\n There are " + new_output + " seconds in your input; or " + fm1.format(days_output) + " days.");
  }
}