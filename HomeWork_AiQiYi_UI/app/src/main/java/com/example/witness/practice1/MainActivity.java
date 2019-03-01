package com.example.witness.practice1;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;
import Adapter.TitleAdapter;
import android.widget.LinearLayout;
import Adapter.BottomAdapter;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recy;
    private RecyclerView bottom_recy;

    private TitleAdapter mAdapter;
    private  BottomAdapter bottomAdapter;

    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recy = findViewById(R.id.recy1);
    bottom_recy= findViewById(R.id.recy2);

        // 设置布局管理器
        LinearLayoutManager ms = new LinearLayoutManager(this);
        ms.setOrientation(LinearLayoutManager.HORIZONTAL);// 设置 recyclerview 布局方式为横向布局
        //     LinearLayoutManager 种 含有3 种布局样式  第一个就是最常用的 1.横向 , 2. 竖向,3.偏移
        recy.setLayoutManager(ms);//给RecyClerView 添加设置好的布局样式


        mAdapter = new TitleAdapter(getData());
        // 设置adapter
        recy.setAdapter(mAdapter);

        LinearLayoutManager ms2 = new LinearLayoutManager(this);
        ms2.setOrientation(LinearLayoutManager.HORIZONTAL);
        bottom_recy.setLayoutManager(ms2);
        bottomAdapter = new BottomAdapter(getData());
        bottom_recy.setAdapter(bottomAdapter);


    }

    private ArrayList<String> getData() {
        ArrayList<String> list = new ArrayList<>();
        list.add("首页");
        list.add("电视剧");
        list.add("电影");
        list.add("动漫");
        list.add("娱乐");
        list.add("综艺");
        list.add("少儿");
        list.add("体育");
        list.add("原创");
        list.add("健康");
        list.add("咨询");
        return list;
    }
    private ArrayList<String> getData2() {
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("全部");
        list2.add("动作");
        list2.add("科幻");
        list2.add("喜剧");
        list2.add("爱情");
        list2.add("恐怖");
        list2.add("动漫");
        list2.add("伦理");
        list2.add("华语");
        list2.add("欧美");
        list2.add("日韩");
        list2.add("微电影");
        list2.add("原创");
        list2.add("网络");
        return  list2;
    }
}