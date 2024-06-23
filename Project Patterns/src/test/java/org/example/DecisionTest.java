package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
public class DecisionTest {
    @Test
    public void testDecide() {
        Decision decision = new Decision();
        assertTrue(decision.decide(true, true, false));
        assertTrue(decision.decide(true, false, true));
        assertFalse(decision.decide(false, true, true));
        assertFalse(decision.decide(true, false, false));
        assertFalse(decision.decide(false, false, true));
        assertFalse(decision.decide(false, true, false));
        assertTrue(decision.decide(true, true, true));
        assertFalse(decision.decide(false, false, false));}}
