package com.yifenglv.android.loginsystem;

/**
 * Created by user1 on 2017/7/23.
 */
import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivitySet {

    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    public static void finishAll() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }

}
