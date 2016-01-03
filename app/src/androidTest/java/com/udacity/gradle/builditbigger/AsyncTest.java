package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;
import android.util.Pair;

/**
 * Created by oleplus on 1/3/16.
 */
public class AsyncTest extends AndroidTestCase {
    public AsyncTest() {

    }
    public void test() {

        // Thanks http://stackoverflow.com/questions/2321829/android-asynctask-testing-with-android-test-framework
        EndpointsAsyncTask task = new EndpointsAsyncTask();
        task.execute(new Pair<Context, String>(getContext(), "Manfred"));
        String result = null;

        try {
            result = task.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }
}
