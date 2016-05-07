import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Created by elene on 5/8/16.
 */

public class TestProgram {

    @Test
    public void AssertionTest() {
        assert(3!=5);
    }

    @Test
    public void MockitoTest(){
        Mecxre yuti = mock(Mecxre.class);
        when(yuti.haveAGoodNight(true)).thenReturn("arcerti");
        assert(yuti.haveAGoodNight(true).equals("arcerti"));
    }




}
