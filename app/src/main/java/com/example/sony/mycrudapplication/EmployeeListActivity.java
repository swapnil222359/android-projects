package com.example.sony.mycrudapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by sony on 18-11-2016.
 */
public class EmployeeListActivity extends SingleFragmentActivity{

    public static Intent newIntent(Context packagecontext){
        Intent intent= new Intent(packagecontext,EmployeeListActivity.class);
        return intent;
    }

    @Override
    public Fragment createFragment() {
        return new EmployeeListFragment();
    }
}
