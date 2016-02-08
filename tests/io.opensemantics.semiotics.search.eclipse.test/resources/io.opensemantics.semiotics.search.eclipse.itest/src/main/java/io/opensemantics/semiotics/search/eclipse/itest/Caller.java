package io.opensemantics.semiotics.search.eclipse.itest;

public class Caller {

  private Callee callee;

  public Caller() {
    callee = new Callee();
  }

  public void callsCalleeViaMember() {
    callee.called();
  }
}
