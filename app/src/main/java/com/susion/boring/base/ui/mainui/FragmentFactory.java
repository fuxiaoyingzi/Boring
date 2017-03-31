package com.susion.boring.base.ui.mainui;

import android.support.v4.app.Fragment;

import com.susion.boring.base.view.MainUIFragmentIndex;
import com.susion.boring.read.ReadPageFragment;
import com.susion.boring.music.MusicPageFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by susion on 17/2/10.
 */
public class FragmentFactory implements MainUIFragmentIndex{

    private static List<Fragment> mMainUIFragments;


    private FragmentFactory(){

    }
    public static List<Fragment> getMainUIFragments() {
        if (mMainUIFragments == null) {
            mMainUIFragments = new ArrayList<>();
            mMainUIFragments.add(ITEM_MUSIC, new MusicPageFragment());
            mMainUIFragments.add(ITEM_INTERESTING, new ReadPageFragment());
        }
        return mMainUIFragments;
    }

}
