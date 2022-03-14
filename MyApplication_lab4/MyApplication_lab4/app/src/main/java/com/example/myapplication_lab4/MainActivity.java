package com.example.myapplication_lab4;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvGoods;
    CutomGoodsAdapter adt;
    ArrayList<Goods> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceSate){
        super.onCreate(savedInstanceSate);
        setContentView(R.layout.activity_main);
        lvGoods = findViewById(R.id.lvGoods);

        arrayList = new ArrayList<>();
        arrayList.add(new Goods("Ca nấu lẩu, lẩu mì mini",
                                "Shop Devang",R.drawable.ca_nau_lau));

        arrayList.add(new Goods("1 KG khô gà bơ tỏi",
                "LTD Food",R.drawable.ga_bo_toi));

        arrayList.add(new Goods("Xe cần cẩu đa năng",
                "Thế gới đồ chơi",R.drawable.xa_can_cau));

        arrayList.add(new Goods("Đồ chơi dạng mô hình",
                "Thế gới đồ chơi",R.drawable.do_choi_dang_mo_hinh));

        arrayList.add(new Goods("Lãnh đaoh đơn giản",
                "Minh Long Book",R.drawable.lanh_dao_gian_don));

        arrayList.add(new Goods("Hiểu lòng con trẻ",
                "Minh Long Book",R.drawable.hieu_long_con_tre));


        adt = new CutomGoodsAdapter(this, R.layout.custom_listview, arrayList);


        lvGoods.setAdapter(adt);
    }
}
