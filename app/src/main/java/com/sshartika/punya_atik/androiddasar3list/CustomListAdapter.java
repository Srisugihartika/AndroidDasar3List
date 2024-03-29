package com.sshartika.punya_atik.androiddasar3list;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter{
    private Context context;
    private String[] namabuah;
    private int[] gambarbuah;

    //klik kanan + generate + constructor

    public CustomListAdapter( Context context1, String[] namabuah, int[] gambarbuah) {
        super(context1, R.layout.item_buah, namabuah);
        this.context = context1;
        this.namabuah = namabuah;
        this.gambarbuah = gambarbuah;
    }

    //getview

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //atur layout item
        LayoutInflater layoutInflater;
        View view = LayoutInflater.from(context).inflate(R.layout.item_buah, parent,false);

        //findviewid setiap komponen yg didalam item
        TextView tvNamaBuah = view.findViewById(R.id.tv_item_nama);
        ImageView ivGambarBuah = view.findViewById(R.id.iv_item_gambar);

        //set data
        tvNamaBuah.setText(namabuah[position]);
        ivGambarBuah.setImageResource(gambarbuah[position]);

        return view;
    }
}
