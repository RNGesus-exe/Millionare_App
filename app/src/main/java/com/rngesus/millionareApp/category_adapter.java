package com.rngesus.millionareApp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class category_adapter extends RecyclerView.Adapter<category_adapter.ViewHolder> {

    public category_adapter(Context context){

    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_category;
        private ImageView iv_category;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_category = itemView.findViewById(R.id.tv_category);
            iv_category = itemView.findViewById(R.id.iv_category);
        }
    }

    @NonNull
    @Override
    public category_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { //ASK
        View view;    ///ASK SIR
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull category_adapter.ViewHolder holder, int position) { //ASK
        holder.tv_category.setText(DataManager.category_names_arr.get(position));
    }

    @Override
    public int getItemCount() {
        return DataManager.category_names_arr.size() ;
    }
}
