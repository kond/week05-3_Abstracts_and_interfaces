package com.greenfox.bx;

/**
 * Created by kond on 2017. 03. 01..
 */
public class Reservation implements Reservationy {

  final static String ls = "01234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private String codeBooking;
  private String dow;

  public Reservation(String dow) {
    this.codeBooking = randomZeroToZ(8);
    this.dow = dow;
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

  }

  @Override
  public String getDowBooking() {
    return null;
  }

  @Override
  public void setCodeBooking(String codeBooking) {

  }

  @Override
  public String getCodeBooking() {
    return null;
  }

  @Override
  public boolean PlaceReserved(String dowBooking, String codeBooking) {
    return false;
  }

  @Override
  public boolean PlaceCancelled(String dowBooking, String codeBooking) {
    return false;
  }

  public String toString() {
    return "Booking# " + this.codeBooking + " for " + this.dow;
  }
}
