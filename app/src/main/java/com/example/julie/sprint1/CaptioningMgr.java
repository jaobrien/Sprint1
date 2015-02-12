package com.example.julie.sprint1;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.CaptioningManager;

/**
 * Created by Julie on 2/11/2015.
 */

public class CaptioningMgr
{
    public final Boolean getCCState()
    {
        Context context = Accessibility.getAppContext();
        CaptioningManager captioningManager = (CaptioningManager) context.getSystemService(Context.CAPTIONING_SERVICE);
        return captioningManager.isEnabled();
    }
}
