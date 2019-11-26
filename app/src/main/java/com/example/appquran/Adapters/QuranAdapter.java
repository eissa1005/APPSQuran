package com.example.appquran.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.appquran.R;


public class QuranAdapter  extends RecyclerView.Adapter<QuranAdapter.ViewHolder> {

    String[] names;
    public QuranAdapter(String[] names){
        this.names = names;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_sura,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
         holder.name.setText(names[position]);
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    static  class ViewHolder extends RecyclerView.ViewHolder{

         TextView name;
         ImageView img_sura;
       public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name =(TextView)itemView.findViewById(R.id.name);
            img_sura=(ImageView)itemView.findViewById(R.id.imageView);

        }
    }
}
