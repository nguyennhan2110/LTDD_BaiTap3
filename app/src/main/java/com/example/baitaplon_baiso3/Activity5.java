package com.example.baitaplon_baiso3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Activity5 extends Fragment {
    ListView lv137;
    ArrayList<Notification> arrtb137;
    NotificationAdapter adapter137;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_5, container, false);
        lv137 = (ListView) view.findViewById(R.id.listviewtb);
        arrtb137 = new ArrayList<>();
        arrtb137.add(new Notification(R.drawable.coffee, "Dặt hàng thành công !", "15 phút trước"));
        arrtb137.add(new Notification(R.drawable.coffee, "Mua hàng thành công !", "5 giờ trước"));
        arrtb137.add(new Notification(R.drawable.coffeehouse, "Khuyến mãi CoffeeHouse mua 2 tặng 1 đến hết ngày 12/12/2020 !", "1 ngày trước"));
        arrtb137.add(new Notification(R.drawable.coffeeden, "Đã huỷ đơn hàng !", "2 ngày trước trước"));
        arrtb137.add(new Notification(R.drawable.coffeeden, "Mua hàng thành công !", "3 ngày trước"));
        adapter137 = new NotificationAdapter(getActivity(), R.layout.item_notification, arrtb137);
        lv137.setAdapter(adapter137);
        return view;
    }
}