package com.example.fragment_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class myadapter extends RecyclerView.Adapter<myadapter.myviewholder> {

    List<model> data;

    public myadapter(List<model> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

       holder.id.setText(data.get(position).getId());
        holder.title.setText(data.get(position).getTitle());
        holder.body.setText(data.get(position).getBody());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class myviewholder extends RecyclerView.ViewHolder{


        TextView id,title,body;

        public myviewholder(@NonNull View itemView) {
            super(itemView);

            id=itemView.findViewById(R.id.t);
            title=itemView.findViewById(R.id.t1);
            body=itemView.findViewById(R.id.t2);
        }
    }
}
