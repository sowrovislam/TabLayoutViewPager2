package com.example.viewtablayout;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:return new MoviFragment();
            case 1:return new MigucFragment();
            case 3:return new GamseFragment();
        }

        return new MoviFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
