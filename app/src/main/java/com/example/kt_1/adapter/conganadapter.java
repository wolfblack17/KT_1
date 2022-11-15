package com.example.kt_1.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kt_1.CongAn;
import com.example.kt_1.R;

import java.util.List;

public class conganadapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<CongAn> congAnList;

    public conganadapter(Context context, int layout, List<CongAn> congAnList) {
        this.context = context;
        this.layout = layout;
        this.congAnList = congAnList;
    }

    @Override
    public int getCount() {
        return congAnList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        TextView txtTen = (TextView) view.findViewById(R.id.textviewTen);
        TextView txtCapBac = (TextView) view.findViewById(R.id.textviewCapBac);
        TextView txtNoiCongTac = (TextView) view.findViewById(R.id.textviewNoiCongTac);
        ImageView imgHinh = (ImageView) view.findViewById(R.id.imageViewHinh);

       CongAn congAn = congAnList.get(i);

       txtTen.setText(congAn.getTen());
       txtCapBac.setText(congAn.getCapBac());
       txtNoiCongTac.setText(congAn.getNoiCongTac());
       imgHinh.setImageResource(congAn.getHinh());


         return view;
    }
}
