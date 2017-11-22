package com.bawei.lx_ddxc_demo4.app;

import android.app.Application;

import com.bawei.lx_ddxc_demo4.gen.DaoMaster;
import com.bawei.lx_ddxc_demo4.gen.DaoSession;
import com.bawei.lx_ddxc_demo4.gen.UserDao;

/**
 * Created by Zhang on 2017/11/22.
 */

public class MyApp extends Application {
    public static UserDao userDao;

    @Override
    public void onCreate() {
        super.onCreate();
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(this, "lenvess.db", null);
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDb());
        DaoSession daoSession = daoMaster.newSession();
        userDao = daoSession.getUserDao();
    }
}
