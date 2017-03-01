package com.greenfox.bx;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by kond on 2017. 03. 01..
 */
public class CreditCardReservation implements CreditCardy, Reservationy, Comparable {
  final static String ls = "01234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  final static String[] lsDow = { "MON","TUE","WED","THU","FRI","SAT","SUN"};
  private int sumCVV;
  private String nameCardholder;
  private String codeAccount;
  private String codeBooking;
  private String dowBooking;

  public CreditCardReservation(String dowBooking, int sumCVV, String nameCardholder, String codeAccount) {
    this.codeBooking = randomZeroToZ(8);
    this.dowBooking = dowBooking;
    this.sumCVV = (sumCVV == 0) ? cumeSumCVV(codeAccount) : sumCVV;
    this.nameCardholder = nameCardholder;
    this.codeAccount = codeAccount;
  }

  @Override
  public void setSumCVV(int sumCVV) {
    this.sumCVV = sumCVV;
  }

  @Override
  public int getSumCVV() {
    return this.sumCVV;
  }

  @Override
  public void setNameCardholder(String nameCardholder) {
    this.nameCardholder = nameCardholder;
  }

  @Override
  public String getNameCardholder() {
    return this.nameCardholder;
  }

  @Override
  public void setCodeAccount(String codeAccount) {
    this.codeAccount = codeAccount;
  }

  @Override
  public String getCodeAccount() {
    return this.codeAccount;
  }

  @Override
  public int cumeSumCVV(String codeAccount) {
    int cvv = 0;

    for(int i=0; i<codeAccount.length(); i++) {
      cvv += Integer.parseInt(codeAccount.substring(i, i+1));
    }

    return cvv;
  }

  @Override
  public boolean ValidCard(String codeAccount, int sumCVV) {
    return (sumCVV == cumeSumCVV(codeAccount)) ? true : false;
  }

  private static String randomZeroToZ(int len) {
    String out = "";
    for(int i=0; i<len; i++) {
      out += ls.charAt((int) (Math.random() * 36));
    }
    return out;
  }

  @Override
  public void setDowBooking(String dowBooking) {
    this.dowBooking = dowBooking;
  }

  @Override
  public String getDowBooking() {
    return this.dowBooking;
  }

  @Override
  public void setCodeBooking(String codeBooking) {
    this.codeBooking = codeBooking;
  }

  @Override
  public String getCodeBooking() {
    return this.codeBooking;
  }

  @Override
  public boolean PlaceReserved(String dowBooking, String codeBooking) {
    return true;
  }

  @Override
  public boolean PlaceCancelled(String dowBooking, String codeBooking) {
    return true;
  }

  @Override
  public String toString() {
    return "Booking# " + this.codeBooking + " for " + this.dowBooking + " paid by " +
    "Name=" + this.nameCardholder + " CC#=" + this.codeAccount + " CVV#=" + this.sumCVV;
  }

  @Override
  public int compareTo(Object reservation) {
    return this.getSumCVV() - ((CreditCardReservation) reservation).getSumCVV();
  }

  public static Comparator<CreditCardReservation> ReservationNumberASC =
          new Comparator<CreditCardReservation>() {
            @Override
            public int compare(CreditCardReservation o1, CreditCardReservation o2) {
              return o1.getCodeBooking().toUpperCase().compareTo(o2.getCodeBooking().toUpperCase());
            }
  };

  public static Comparator<CreditCardReservation> ReservationNumberDESC =
          new Comparator<CreditCardReservation>() {
            @Override
            public int compare(CreditCardReservation o1, CreditCardReservation o2) {
              return o2.getCodeBooking().toUpperCase().compareTo(o1.getCodeBooking().toUpperCase());
            }
  };

  public static Comparator<CreditCardReservation> CreditCardNumberASC =
          new Comparator<CreditCardReservation>() {
            @Override
            public int compare(CreditCardReservation o1, CreditCardReservation o2) {
              return o1.getCodeAccount().toUpperCase().compareTo(o2.getCodeAccount().toUpperCase());
            }
  };

  public static Comparator<CreditCardReservation> CreditCardNumberDESC =
          new Comparator<CreditCardReservation>() {
            @Override
            public int compare(CreditCardReservation o1, CreditCardReservation o2) {
              return o2.getCodeAccount().toUpperCase().compareTo(o1.getCodeAccount().toUpperCase());
            }
  };

  public static Comparator<CreditCardReservation> DOWASC =
          new Comparator<CreditCardReservation>() {
            @Override
            public int compare(CreditCardReservation o1, CreditCardReservation o2) {
              String o1Pos = Integer.toString(Arrays.asList(lsDow).indexOf(o1.getDowBooking()));
              String o2Pos = Integer.toString(Arrays.asList(lsDow).indexOf(o2.getDowBooking()));
              return o1Pos.compareTo(o2Pos);
            }
  };

  public static Comparator<CreditCardReservation> DOWDESC =
          new Comparator<CreditCardReservation>() {
            @Override
            public int compare(CreditCardReservation o1, CreditCardReservation o2) {
              String o1Pos = Integer.toString(Arrays.asList(lsDow).indexOf(o1.getDowBooking()));
              String o2Pos = Integer.toString(Arrays.asList(lsDow).indexOf(o2.getDowBooking()));
              return o2Pos.compareTo(o1Pos);
            }
  };

}
