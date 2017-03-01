package com.greenfox.bx;

/**
 * Created by kond on 2017. 03. 01..
 */
public class CreditCardReservation implements CreditCardy, Reservationy {
  final static String ls = "01234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
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
}
