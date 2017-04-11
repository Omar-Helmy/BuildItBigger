package com.udacity.gradle.builditbigger;
import org.junit.Test;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.regex.Pattern;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by OMAR on 04/04/2017.
 */
@RunWith(AndroidJUnit4.class)

public class TaskTest {

    @Test
    public void testDoInBackground() throws Exception{
            MainActivity mainActivity = new MainActivity();
            JockTask endpointsAsyncTask = new JockTask(mainActivity);
            endpointsAsyncTask.execute();
            String result = endpointsAsyncTask.get(30, TimeUnit.SECONDS);
            assertNotNull(result);
            assertTrue(result.length() > 0);
    }
}
