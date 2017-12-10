package com.example.android.learnrecyclerv;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Bayu Setiawan on 10/12/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<ListItem> listItems;
    private Context context;

    public MyAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ListItem listItem=listItems.get(position);

        holder.textViewHead.setText(listItem.getHead());
        holder.textViewDesc.setText(listItem.getDesc());

        Picasso.with(context)
            .load(listItem.getImgUrl())
            .into(holder.imageViewImg);

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"You Clicked "+listItem.getHead(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewHead;
        public TextView textViewDesc;
        public ImageView imageViewImg;
        public LinearLayout linearLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            textViewHead=(TextView)itemView.findViewById(R.id.textViewHead);
            textViewDesc=(TextView)itemView.findViewById(R.id.textViewDesc);
            imageViewImg=(ImageView)itemView.findViewById(R.id.imageViewImg);
            linearLayout=(LinearLayout)itemView.findViewById(R.id.linearLayout);
        }
    }
}
