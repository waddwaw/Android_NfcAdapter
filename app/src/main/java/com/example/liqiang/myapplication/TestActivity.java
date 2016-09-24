package com.example.liqiang.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by liqiang on 16/9/24.
 */
public class TestActivity extends BaseActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.disableNfcReaderMode();
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.enableNfcReaderMode();
    }
}
