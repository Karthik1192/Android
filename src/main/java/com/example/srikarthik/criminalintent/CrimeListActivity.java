package com.example.srikarthik.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Sri Karthik on 3/9/2017.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment()
        {
            return new CrimeListFragment();
        }
}
