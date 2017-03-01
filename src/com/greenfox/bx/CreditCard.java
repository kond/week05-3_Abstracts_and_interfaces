package com.greenfox.bx;

import main.java.music.StringedInstrument;

/**
 * Created by kond on 2017. 03. 01..
 */
public class CreditCard implements CreditCardy {
  private int sumCVV;
  private String nameCardholder;
  private String codeAccount;

  // parameters are CVV, name, cardnumber;
  // when CVV is 0, then the Constructor computes the CVV, otherwise it uses the value sent
  public CreditCard(int sumCVV, String nameCardholder, String codeAccount) {
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

    for(int i=0; i<codeAccount.length()-1; i++) {
      cvv += (int) codeAccount.charAt(i);
    }

    return cvv;
  }

  @Override
  public boolean ValidCard(String codeAccount, int sumCVV) {
    return (sumCVV == cumeSumCVV(codeAccount)) ? true : false;
  }

  //String.format("Name=%s CC#=%s CVV=%d")
  public String toString() {
    return "Name=" + this.nameCardholder + " CC#=" + this.codeAccount + " CVV#=" + this.sumCVV;
  }
}
