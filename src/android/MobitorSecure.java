package com.mobitor.cordova.secure;

import java.lang.reflect.Method;
import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.content.*;
import android.os.Build;
import android.provider.*;
import android.app.*;

public class MobitorSecure extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
        if (action.equals("isSecure")) {
			callbackContext.success(isSecured() ? 1 : 0);
			return true;
		}
        return false;
    }
	
	private boolean isDeviceSecure() {
        KeyguardManager keyguardManager = (KeyguardManager)(cordova.getActivity().getApplicationContext().getSystemService(Context.KEYGUARD_SERVICE));
        try {
            Method isSecure = null;
            isSecure = keyguardManager.getClass().getMethod("isDeviceSecure");
            return ((Boolean) isSecure.invoke(keyguardManager)).booleanValue();
        } catch (Exception e) {
            return keyguardManager.isKeyguardSecure();
        }
    }

    public boolean isSecured() {
            return isDeviceSecure();
    }
}