package com.xuyu.myview.bezier_curve;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.xuyu.myview.R;
import com.xuyu.myview.bezier_curve.bezier_show.BezierShowActivity;

public class SeventhActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.button1:
                startActivity(new Intent(this, BezierShowActivity.class));
                break;
        }
    }
}
