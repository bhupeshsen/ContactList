package com.example.contactlist.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.contactlist.R;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.MyViewHolder> {


ArrayList<ContactModelClass>  listData;
Context context;

    public ContactAdapter(Context context, ArrayList<ContactModelClass> list){

        this.listData=list;
        this.context=context;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {

        View viewItem= LayoutInflater.from(parent.getContext()).inflate(R.layout.show_contact_list_layout,parent, false);
        return new MyViewHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount()
    {
        return listData.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView nameTxt,numberTxt;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTxt=itemView.findViewById(R.id.nameTxtId);
            numberTxt=itemView.findViewById(R.id.numberTxtId);

        }
    }
}
