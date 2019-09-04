package com.wyc.android_horizontalscrollmenu.Adapter;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

import com.wyc.android_horizontalscrollmenu.Entity.MenuListItem;
import com.wyc.android_horizontalscrollmenu.MainActivity;
import com.wyc.android_horizontalscrollmenu.R;

import java.util.List;

public class MenuListAdapter extends RecyclerView.Adapter<MenuListAdapter.VH> {

    public static class VH extends RecyclerView.ViewHolder{
        public final TextView name;
        public VH(View v) {
            super(v);
            name = (TextView) v.findViewById(R.id.list_item_menu_name);
        }
    }
    private List<MenuListItem> menuList;
    private Context context;
    public MenuListAdapter(List<MenuListItem> menuList, Context context) {
        this.menuList = menuList;
        this.context = context;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //LayoutInflater.from指定写法
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_menu, parent, false);
        return new VH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.name.setText(menuList.get(position).getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast =Toast.makeText(context, "啦啦啦", Toast.LENGTH_SHORT);
                //参数1：当前的上下文环境。可用getApplicationContext()或this
                //参数2：要显示的字符串。
                //参数3：显示的时间长短。Toast默认的有两个LENGTH_LONG(长)和LENGTH_SHORT(短)
                toast.setGravity(Gravity.CENTER, 500, 500);//设置提示框显示的位置

                toast.show();//显示消息
            }
        });
    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }




}
