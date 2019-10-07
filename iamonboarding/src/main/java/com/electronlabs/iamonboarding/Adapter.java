package com.electronlabs.iamonboarding;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.electronlabs.iamonboarding.Fragment_onboard_1;
import com.electronlabs.iamonboarding.Fragment_onboard_2;
import com.electronlabs.iamonboarding.Fragment_onboard_3;

public class Adapter extends FragmentStatePagerAdapter {

    public Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Fragment_onboard_1 tab1 = new Fragment_onboard_1();
                return tab1;

            case 1:
                Fragment_onboard_3 tab2 = new Fragment_onboard_3();
                return tab2;


            case 2:
                Fragment_onboard_2 tab3 = new Fragment_onboard_2();
                return tab3;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
