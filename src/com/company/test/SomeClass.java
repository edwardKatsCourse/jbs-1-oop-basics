package com.company.test;

public class SomeClass {

    /*package default*/
    protected void abc() {}
}

class B extends SomeClass {


    public void zyx() {
        abc();
    }
}