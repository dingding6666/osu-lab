package com.edplan.nso.filepart;

import com.edplan.nso.OsuFilePart;
import com.edplan.nso.beatmapComponent.Colours;

import android.graphics.Color;

import com.edplan.framework.graphics.opengl.objs.Color4;

public class PartColours implements OsuFilePart {
    public static final String TAG = "Colours";

    private Colours colours;

    public PartColours() {
        colours = new Colours();
    }

    public void addColour(int index, int c) {
        colours.addColour(index, c);
    }

    public void addColour(int index, int r, int g, int b) {
        colours.addColour(index, Color.argb(255, r, g, b));
    }

    public void setSliderBorder(int r, int g, int b) {
        colours.setSliderBorder(Color4.rgb255(r, g, b));
    }

    public void setSliderTrackOverride(int r, int g, int b) {
        colours.setSliderTrackOverride(Color4.rgb255(r, g, b));
    }

    @Override
    public String getTag() {

        return TAG;
    }

    @Override
    public String makeString() {

        return (colours != null) ? colours.makeString() : "{@Colours}";
    }

}
