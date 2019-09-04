package com.wyc.android_horizontalscrollmenu;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private HorizontalScrollView hor;
    private LinearLayout ll;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hor);
        hor = findViewById(R.id.hor);
        ll = findViewById(R.id.ll);
        for (int i = 0; i < ll.getChildCount(); i++) {
            ll.getChildAt(i).setOnClickListener(this);
        }
    }

    // 实现Horizon自动滚动居中
    private void autoScroll(int i) {
        // Width of the screen
        DisplayMetrics metrics = getResources()
                .getDisplayMetrics();
        int widthScreen = metrics.widthPixels;

        // Width of one child (Button)
        int widthChild = ll.getChildAt(i).getWidth(); // 获取对应位置的子View的宽度

        // Nb children in screen
        int nbChildInScreen = widthScreen / widthChild;

        // Child position left
        int positionLeftChild = ll.getChildAt(i).getLeft(); // 获取对应位置的子View的左边位置 - 坐标

        // Auto scroll to the middle
        hor.smoothScrollTo((positionLeftChild - ((nbChildInScreen * widthChild) / 2) + widthChild / 2), 0);
//        hor.smoothScrollTo((positionLeftChild - (widthScreen / 2) + widthChild / 2), 0);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.a:
                autoScroll(0);
                break;
            case R.id.aa:
                autoScroll(1);
                break;
            case R.id.aaa:
                autoScroll(2);
                break;
            case R.id.aaaa:
                autoScroll(3);
                break;
            case R.id.aaaaa:
                autoScroll(4);
                break;
            case R.id.aaaaaa:
                autoScroll(5);
                break;
            case R.id.aaaaaaa:
                autoScroll(6);
                break;
            case R.id.aaaaaaaa:
                autoScroll(7);
                break;
        }
    }
}