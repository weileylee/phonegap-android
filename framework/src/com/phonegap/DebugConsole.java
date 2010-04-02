package com.phonegap;

import android.util.Log;

public class DebugConsole {
  
  private static final String LOG_TAG = "Debug Console";
  
  public DebugConsole(){
    
  }
  
  public void log(String pMessage){
    Log.i(LOG_TAG, pMessage);
  }
  
  public void debug(String pMessage){
    Log.d(LOG_TAG, pMessage);
  }
  
  public void error(String pMessage){
    Log.e(LOG_TAG, pMessage);
  }

}
