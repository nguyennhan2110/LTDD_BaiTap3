package com.example.baitaplon_baiso3;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Activity6 extends Fragment {

    ListView listViewShop137;
    ListViewBaseAdapter adapter137;
    ArrayList<ListViewBean> arr_bean_shop137;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_6, container, false);
        listViewShop137 = (ListView) view.findViewById(R.id.listviewCauthu);
        arr_bean_shop137 = new ArrayList<ListViewBean>();
        arr_bean_shop137.add(new ListViewBean(R.drawable.house, "Trang chủ"));
        arr_bean_shop137.add(new ListViewBean(R.drawable.login, "Thông tin cá nhân"));
        arr_bean_shop137.add(new ListViewBean(R.drawable.custom, "Lịch sử mua hàng"));
        arr_bean_shop137.add(new ListViewBean(R.drawable.thanhtoan, "Thanh toán"));
        arr_bean_shop137.add(new ListViewBean(R.drawable.help, "Trợ giúp"));
        arr_bean_shop137.add(new ListViewBean(R.drawable.st, "Cài đặt"));
        arr_bean_shop137.add(new ListViewBean(R.drawable.export, "Đăng xuất"));
        adapter137 = new ListViewBaseAdapter(arr_bean_shop137, getActivity());
        listViewShop137.setAdapter((ListAdapter) adapter137);
        listViewShop137.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(getActivity(), Profile.class);
                    startActivity(intent);
                } else if (position == 6) {
                    final AlertDialog.Builder alertDialogbuilder = new AlertDialog.Builder(getActivity());
                    alertDialogbuilder.setTitle("Đăng Xuất");
                    alertDialogbuilder.setMessage("Bạn có muốn đăng xuất?");
                    alertDialogbuilder.setCancelable(false).setPositiveButton("Đăng Xuất", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getActivity(), Login.class);
                            startActivity(intent);
                        }
                    }).setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    alertDialogbuilder.show();
                }
            }
        });
        return view;
    }
}