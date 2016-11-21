package com.example.sony.mycrudapplication;

import android.support.v4.app.Fragment;
import android.widget.Toast;

public class MainActivity extends SingleFragmentActivity {


    @Override
    public Fragment createFragment() {
        Toast.makeText(this," started!",Toast.LENGTH_SHORT).show();
        return new LoginFragment();
    }
}
