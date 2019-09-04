package com.wyc.android_horizontalscrollmenu.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import butterknife.BindView;
import butterknife.ButterKnife;

import com.wyc.android_horizontalscrollmenu.Entity.MenuListItem;
import com.wyc.android_horizontalscrollmenu.R;

import java.util.List;

public class MenuListAdapter extends BaseAdapter {

    private List<MenuListItem> menuList;
    private LayoutInflater layoutInflater;

    public MenuListAdapter(List<MenuListItem> menuList, Context context) {
        this.menuList = menuList;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        return null;
    }

    @Override
    public int getCount() {
        return menuList == null ? 0: menuList.size();
    }

    @Override
    public MenuListItem getItem(int position) {
        return menuList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    static class ViewHolder {
        @BindView(R.id.list_item_menu_img)
        ImageView img;
        @BindView(R.id.list_item_menu_name)
        TextView list_item_menu_name;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
