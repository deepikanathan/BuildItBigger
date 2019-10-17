package com.udacity.gradle.builditbigger;

import androidx.test.runner.AndroidJUnit4;
import org.junit.runner.RunWith;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/**
 * Verify that the AynscTask is loading the jokes
 */
@RunWith(AndroidJUnit4.class)
public class EndPointAsyncTaskTest {

    @Test
    public void testDoInBackground() throws Exception {
        MainActivityFragment fragment = new MainActivityFragment();
        fragment.gotJoke = true;
        new EndPointAsyncTask().execute(fragment);
        Thread.sleep(5000);
        assertNotNull(fragment.jokeToShow);
        assertTrue("Joke = " + fragment.jokeToShow, fragment.jokeToShow != null);
    }
}
