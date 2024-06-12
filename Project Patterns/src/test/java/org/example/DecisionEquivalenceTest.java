package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DecisionEquivalenceTest {
    private boolean decision(boolean A, boolean B, boolean C) {
        return A && (B || C);
    }

    @Test
    void testEquivalenceClasses() {
        // Test Case 1: A=true, B=true, C=true, Expected: true (Allowed)
        assertTrue(decision(true, true, true));

        // Test Case 2: A=true, B=false, C=true, Expected: true (Allowed)
        assertTrue(decision(true, false, true));

        // Test Case 3: A=false, B=false, C=false, Expected: false (Denied)
        assertFalse(decision(false, false, false));

        // Test Case 4: A=true, B=true, C=false, Expected: true (Allowed)
        assertTrue(decision(true, true, false));

        // Test Case 5: A=true, B=false, C=false, Expected: false (Denied)
        assertFalse(decision(true, false, false));
    }
}

