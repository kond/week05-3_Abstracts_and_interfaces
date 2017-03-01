package com.greenfox.bx;

import java.util.ArrayList;

/**
 * Created by kond on 2017. 03. 01..
 */
public class App {

  final static String[] lsDow = { "MON","TUE","WED","THU","FRI","SAT","SUN"};

  public static void main(String[] args) {
    ArrayList<CreditCardReservation> bookings = new ArrayList<CreditCardReservation>();
    int ct = 10;

    for (int i = 0; i<ct; i++) {
      bookings.add(new CreditCardReservation(randomDow(10),0,"DEF" + i , random16()));
    }

    for (CreditCardReservation iBooking: bookings){
      System.out.println(iBooking.toString());
    }
  }

  static String randomDow(int ct) {
    return lsDow[(int)( Math.random() * 6)];
  }

  static String random16() {
    String out ="";
    for(int i = 0; i<16; i++) {
      out += Integer.toString( (int) ( Math.random() * 9));
    }

    return out;
  }

  public static void mainWorkshop03(String[] args) {
    ArrayList<CreditCard> cards = new ArrayList<CreditCard>();
    int ct = 10;

    for (int i = 0; i<ct; i++) {
      cards.add(new CreditCard(0, "ABC" + i, random16())); //parameters are CVV, name, cardnumber; when CVV is 0, then the Constructor computes the CVV, otherwise it uses the value sent
    }

    for (CreditCard iCard: cards) {
      System.out.println(iCard.toString() +
              ((iCard.ValidCard(iCard.getCodeAccount(), iCard.getSumCVV())) ?
              " (validated) " : " (invalid) "));
    }
  }

  public static void mainWorkshop02(String[] args) {
    ArrayList<Reservation> bookings = new ArrayList<Reservation>();
    int ct = 10;

    for (int i = 0; i<ct; i++) {
      bookings.add(new Reservation(randomDow(10)));
    }

    for (Reservation iBooking: bookings){
      System.out.println(iBooking.toString());
    }
  }

}
