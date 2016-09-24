package com.example.liqiang.myapplication;

import android.annotation.TargetApi;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by liqiang on 16/9/24.
 */
public class BaseActivity extends AppCompatActivity {

    private NfcAdapter mNfcAdapter;

    @TargetApi(Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG", "----");

        mNfcAdapter = NfcAdapter.getDefaultAdapter(this);

        enableNfcReaderMode();

    }

    public boolean enableNfcReaderMode() {
        if (mNfcAdapter != null) {
            mNfcAdapter.enableReaderMode(BaseActivity.this, new NfcAdapter.ReaderCallback() {
                @Override
                public void onTagDiscovered(Tag tag) {

                }
            }, 1, null);
            return true;
        }
        return false;
    }

    public boolean disableNfcReaderMode() {
        if (mNfcAdapter != null) {
            mNfcAdapter.disableReaderMode(BaseActivity.this);
            return true;
        }
        return false;
    }
}
