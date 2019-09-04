package com.wyc.android_horizontalscrollmenu;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.widget.Adapter;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.wyc.android_horizontalscrollmenu.Adapter.MenuListAdapter;
import com.wyc.android_horizontalscrollmenu.Entity.MenuListItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity{
    @BindView(R.id.menu)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        List<MenuListItem> menuList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            menuList.add(new MenuListItem(i, i+""));
        }
        MenuListAdapter menuListAdapter = new MenuListAdapter(menuList, this);
        recyclerView.setAdapter(menuListAdapter);


    }

    // 实现Horizon自动滚动居中
    /*private void autoScroll(int i) {
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
    }*/

}