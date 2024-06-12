package org.example;

public class Decision {
    public boolean decide(boolean A, boolean B, boolean C) {
        return A && (B || C);
    }
}
