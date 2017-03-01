package com.greenfox.bx;

/**
 * Created by kond on 2017. 03. 01..
 */
public class Reservation implements Reservationy {

  final static String ls = "01234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private String codeBooking;
  private String dowBooking;

  public Reservation(String dowBooking) {
    this.codeBooking = randomZeroToZ(8);
    this.dowBooking = dowBooking;
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
    return "Booking# " + this.codeBooking + " for " + this.dowBooking;
  }
}
