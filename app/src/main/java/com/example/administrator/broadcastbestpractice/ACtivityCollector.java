package com.example.administrator.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/8 0008.
 * 管理所有活动
 */
public class ACtivityCollector {
    public static List<Activity> activities= new ArrayList<Activity>();
    public  static void addActivity(Activity activity){
        activities.add(activity);
    }
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }
    public static void finishAll(){
        for(Activity activity : activities){
         if(!activity.isFinishing()){
               activity.finish();
         }
        }
    }
}
