import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EightBallTest {

    private EightBall eightBallExample;

    @Before
    public void before() {
        eightBallExample = new EightBall();
        eightBallExample.addWord("Oops");
        eightBallExample.addWord("You're fucked mate.");
        eightBallExample.addWord("Killed In Gazebo Fire");
    }

    @Test
    public void hasNumberOfEntries() {
        assertEquals(3, eightBallExample.getWordCount());
    }

    @Test
    public void canAddWordToEightBall() {
        eightBallExample.addWord("Ponies");
        assertEquals(4, eightBallExample.getWordCount());
    }

    @Test
    public void pickRandomEntry() {
        assertNotNull(eightBallExample.shakeThat());
    }

    @Test
    public void testRandom() {
        System.out.println(eightBallExample.shakeThat());
    }

}


