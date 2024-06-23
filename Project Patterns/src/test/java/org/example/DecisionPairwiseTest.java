package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class DecisionPairwiseTest {

    @Test
    public void testDecidePairwise() {
        Decision decision = new Decision();

        // A = true, B = true, C = true => True
        assertTrue(decision.decide(true, true, true));

        // A = true, B = true, C = false => True
        assertTrue(decision.decide(true, true, false));

        // A = true, B = false, C = true => True
        assertTrue(decision.decide(true, false, true));

        // A = false, B = true, C = true => False
        assertFalse(decision.decide(false, true, true));

        // A = true, B = false, C = false => False
        assertFalse(decision.decide(true, false, false));

        // A = false, B = false, C = true => False
        assertFalse(decision.decide(false, false, true));

        // A = false, B = true, C = false => False
        assertFalse(decision.decide(false, true, false));

        // A = false, B = false, C = false => False
        assertFalse(decision.decide(false, false, false));
    }
}
