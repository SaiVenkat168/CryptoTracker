package com.example.cryptotracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class CryptoRVAdapter extends RecyclerView.Adapter<CryptoRVAdapter.Viewholder>
{

    private static DecimalFormat df2 = new DecimalFormat("#.##");
    private ArrayList<CryptoModal> list;
    private Context context;


    public CryptoRVAdapter(ArrayList<CryptoModal> list, Context context)
    {
        this.list = list;
        this.context = context;
    }

    public void filterList(ArrayList<CryptoModal> filterlist)
    {
        list = filterlist;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.currency_rv_item, parent, false);
        return new CryptoRVAdapter.Viewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position)
    {
        CryptoModal modal = list.get(position);
        holder.nameTV.setText(modal.getCompanyname());
        holder.rateTV.setText("$ " + df2.format(modal.getPrice()));
        holder.symbolTV.setText(modal.getLogo());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder
    {
        private TextView symbolTV, rateTV, nameTV;

        public Viewholder(@NonNull View itemView)
        {
            super(itemView);
            symbolTV = itemView.findViewById(R.id.idTVSymbol);
            rateTV = itemView.findViewById(R.id.idTVRate);
            nameTV = itemView.findViewById(R.id.idTVName);
        }
    }


}
