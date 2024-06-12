package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DecisionTest {
    private boolean decision(boolean A, boolean B, boolean C) {
        return A && (B || C);
    }

    @Test
    void testMC_DC() {
        // Test Case 1: A=true, B=true, C=false, Expected: true
        assertTrue(decision(true, true, false));

        // Test Case 2: A=true, B=false, C=true, Expected: true
        assertTrue(decision(true, false, true));

        // Test Case 3: A=true, B=false, C=false, Expected: false
        assertFalse(decision(true, false, false));

        // Test Case 4: A=false, B=true, C=false, Expected: false
        assertFalse(decision(false, true, false));

        // Test Case 5: A=false, B=false, C=true, Expected: false
        assertFalse(decision(false, false, true));
    }
}
