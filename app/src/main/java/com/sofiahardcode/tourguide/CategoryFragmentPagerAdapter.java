package com.sofiahardcode.tourguide;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryFragmentPagerAdapter extends FragmentPagerAdapter {
    private Context context;

    public CategoryFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AttractionsFragment();
            case 1:
                return new RestaurantsFragment();
            case 2:
                return new NightLifeFragment();
            case 3:
            default:
                return new EventsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.attractions);
            case 1:
                return context.getString(R.string.restaurants);
            case 2:
                return context.getString(R.string.night_life);
            case 3:
            default:
                return context.getString(R.string.events);
        }
    }
}
