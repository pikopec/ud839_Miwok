package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by Piotr on 2016-08-23.
 */
public class NumbersClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), "Open the list of numbers", Toast.LENGTH_SHORT).show();
    }
}
