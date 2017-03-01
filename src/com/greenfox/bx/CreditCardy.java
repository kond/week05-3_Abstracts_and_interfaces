package com.greenfox.bx;

/**
 * Created by kond on 2017. 03. 01..
 */
interface CreditCardy {

  void setSumCVV(int sumCVV);
  int getSumCVV();
  void setNameCardholder(String nameCardholder);
  String getNameCardholder();
  void setCodeAccount(String codeAccount);
  String getCodeAccount();

  int cumeSumCVV(String codeAccount); // computes codeAccount checksum (see below)
  boolean ValidCard (String codeAccount, int sumCVV); // compare sumCVV with checksum of codeAccount

  String toString (); //String.format("Name=%s CC#=%s CVV=%d")
}
