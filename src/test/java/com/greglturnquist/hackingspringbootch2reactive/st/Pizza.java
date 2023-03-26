package com.greglturnquist.hackingspringbootch2reactive.st;

public abstract class Pizza {

    public enum Topping {HAM, ONION}

    abstract class Builder<T extends Builder<T>> {
        public T addTopping  (Topping topping) {

            return self();
        }

        protected abstract T self();
    }

}
