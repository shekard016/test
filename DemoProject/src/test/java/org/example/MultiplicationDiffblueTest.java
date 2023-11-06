package org.example;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;

public class MultiplicationDiffblueTest {
  /**
  * Method under test: {@link Multiplication#multiply(ArrayList)}
  */
  @Test
  public void testMultiply() {
    // Arrange, Act and Assert
    assertEquals(1, Multiplication.multiply(new ArrayList<>()));
  }

  /**
   * Method under test: {@link Multiplication#multiply(ArrayList)}
   */
  @Test
  public void testMultiply2() {
    // Arrange
    ArrayList<Integer> array = new ArrayList<>();
    array.add(1);

    // Act and Assert
    assertEquals(1, Multiplication.multiply(array));
  }

  /**
   * Method under test: {@link Multiplication#multiply(ArrayList)}
   */
  @Test
  public void testMultiply3() {
    // Arrange
    ArrayList<Integer> array = new ArrayList<>();
    array.add(1);
    array.add(2);

    // Act and Assert
    assertEquals(1, Multiplication.multiply(array));
  }
}

