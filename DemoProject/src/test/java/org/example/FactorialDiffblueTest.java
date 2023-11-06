package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FactorialDiffblueTest {
  /**
  * Method under test: {@link Factorial#dofactorial(int)}
  */
  @Test
  public void testDofactorial() {
    // Arrange, Act and Assert
    assertEquals(1, Factorial.dofactorial(1));
    assertEquals(1, Factorial.dofactorial(0));
  }
}

