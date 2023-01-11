package com.driver;

public class Main {
  B child=new B();
  System.out.println(child.meth);
  System.out.println(child.meth);
  
}
class A{
  String meth(){
    return "Invoking method from class A";
  }
}
class B extends A{
  String meth(){
    return "Method is overridden in Extendend class B";
  }
}
