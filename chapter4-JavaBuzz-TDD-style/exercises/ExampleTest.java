import static org.junit.Assert.*;
import org.junit.Test;

public class ExampleTest {

  @Test
  public void addsTwoNumbersTogether() {
    Example example = new Example();
    int answer = example.add(2,3);
    assertEquals(answer, 5);
  }
}
