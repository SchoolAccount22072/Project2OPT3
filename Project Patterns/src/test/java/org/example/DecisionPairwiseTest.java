package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DecisionPairwiseTest {
    private boolean decision(boolean A, boolean B, boolean C) {
        return A && (B || C);
    }

    @Test
    void testPairwise() {
        // Test Case 1: A=true, B=true, C=true, Expected: true (Allowed)
        assertTrue(decision(true, true, true));

        // Test Case 2: A=true, B=true, C=false, Expected: true (Allowed)
        assertTrue(decision(true, true, false));

        // Test Case 3: A=true, B=false, C=true, Expected: true (Allowed)
        assertTrue(decision(true, false, true));

        // Test Case 4: A=true, B=false, C=false, Expected: false (Denied)
        assertFalse(decision(true, false, false));

        // Test Case 5: A=false, B=true, C=true, Expected: false (Denied)
        assertFalse(decision(false, true, true));

        // Test Case 6: A=false, B=false, C=false, Expected: false (Denied)
        assertFalse(decision(false, false, false));
    }
}

