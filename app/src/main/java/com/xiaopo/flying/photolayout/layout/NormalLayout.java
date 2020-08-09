package com.xiaopo.flying.photolayout.layout;

import android.content.Context;

import com.xiaopo.flying.photolayout.layout.straight.NumberStraightLayout;
import com.xiaopo.flying.puzzle.PuzzleView;

public class NormalLayout extends NumberStraightLayout {


    public NormalLayout(int theme) {
        super(theme);
    }

    @Override
    public int getThemeCount() {
        return 1;
    }

    @Override
    public void layout() {

    }
}
