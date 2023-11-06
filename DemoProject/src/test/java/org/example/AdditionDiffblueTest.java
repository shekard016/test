package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AdditionDiffblueTest {
  /**
  * Method under test: {@link Addition#add(double, double)}
  */
  @Test
  public void testAdd() {
    // Arrange, Act and Assert
    assertEquals(20.0d, Addition.add(10.0d, 10.0d), 0.0);
    assertEquals(10.5d, Addition.add(0.5d, 10.0d), 0.0);
    assertEquals(9.5d, Addition.add(-0.5d, 10.0d), 0.0);
    assertEquals(Double.NaN, Addition.add(Double.NaN, 10.0d), 0.0);
  }
}

