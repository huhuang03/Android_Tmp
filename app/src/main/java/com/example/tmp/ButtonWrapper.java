package com.example.tmp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.Button;

@SuppressLint("AppCompatCustomView")
public class ButtonWrapper extends Button {
    public ButtonWrapper(Context context) {
        this(context, null);
    }

    public ButtonWrapper(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
        Log.d("debug", "should not be here");
    }

    public ButtonWrapper(Context context, AttributeSet attrs, int defStyle) {
        this(context, attrs, defStyle, 0);
    }

    public ButtonWrapper(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        Log.d("debug", "(Context context, AttributeSet attrs, int defStyle) called");
        Log.i("debug", "defStyleAttr: " + defStyleAttr + ", defStyleRes: " +  defStyleRes + ", the real style: " + R.style.ButtonTest);
    }
}
