
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {

@Test
    public void isCodeUp() {
    String expected = "CodeUp";
    String actual = "Codeup";
    assertEquals(expected, actual);
}

@Test
    public void sameList() {
    List<String> languages = new ArrayList<>();
    List<String> moreLanguages = new ArrayList<>();
    assertNotSame(languages, moreLanguages);
   }

   @Test
    public void equalArrays() {
       int[] numbers = {1, 2, 3};
       int[] otherNumbers = new int[3];
       otherNumbers[0] = 1;
       otherNumbers[1] = 2;
       otherNumbers[2] = 3;
    assertArrayEquals(numbers, otherNumbers);
   }

   @Test
    public void trueOrFalse() {
       String language = "PHP";
       language.contains("H"); // use assertTrue for this statement
       language.contains("J"); // use assertFalse for this statement
       assertFalse("J is not in PHP", false);
    assertTrue("H is in PHP", true);

   }

   @Test
    public void testReturnString() {
    assertEquals("Well, hello!", Main.returnString("hello"));
   }

   @Test
    public void testAdd() {
     assertEquals(4, Main.add(2,2));
   }

}
