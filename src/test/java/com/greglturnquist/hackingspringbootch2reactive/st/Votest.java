package com.greglturnquist.hackingspringbootch2reactive.st;

public class Votest {
    private final String a1;
    String a2 = "";
    String a3 = "";

    public static class Builder {

        private String a1 = "";
        private String a2 = "";
        private String a3 = "";

        public Builder a1(String  val){ a1 = val; return this; }

        public Builder a2(String  val){ a2 = val; return this; }

        public Builder a3(String  val){ a3 = val; return this; }

        public Votest build(){
            return new Votest(this);
        }
    }

    private Votest(Builder builder) {

        a1 = builder.a1;
        a2 = builder.a2;
        a3 = builder.a3;

    }

}

class TestData {
    public static void main(String[] args) {
       new  Votest.Builder().a2("a");
    }
}
