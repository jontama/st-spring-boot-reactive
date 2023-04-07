package com.greglturnquist.hackingspringbootch2reactive.reactive.tt;

public enum Direction {
    EAST(1), SOUTH(2), WEST(3), NORTH(4);

    private final int value;

    Direction(int value) {
        this.value = value;
    }
}