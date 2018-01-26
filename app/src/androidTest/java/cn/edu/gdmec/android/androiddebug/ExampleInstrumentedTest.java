package cn.edu.gdmec.android.androiddebug;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("cn.edu.gdmec.android.androiddebug", appContext.getPackageName());
    }

   /* public void test() throws Exception{
        final int expected = 1;
        final int reality = 1;
        //断言
        assertEquals ( expected, reality );
    }*/

}
