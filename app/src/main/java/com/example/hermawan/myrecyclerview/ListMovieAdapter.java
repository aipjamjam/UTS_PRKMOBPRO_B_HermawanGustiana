package com.example.rizkifr.myrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class ListMovieAdapter extends
        RecyclerView.Adapter<ListMovieAdapter.CategoryViewHolder> {

    private Context context;

    public ArrayList<Movie> getListMovie(){
        return listMovie;
    }


    public void setListMovie(ArrayList<Movie> listMovie){
        this.listMovie = listMovie;
    }

    private ArrayList<Movie> listMovie;

    public ListMovieAdapter(Context context){
        this.context = context;
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent,
                                                 int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_row_movie, parent,
                        false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {

        holder.tvName.setText(getListMovie().get(position).getName());
        holder.tvRemarks.setText(getListMovie().get(position).getRemarks());

        Glide.with(context)
                .load(getListMovie().get(position).getPhoto())
                .override(55, 55)
                .crossFade()
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListMovie().size();
    }


   class CategoryViewHolder extends RecyclerView.ViewHolder{

        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;

       public CategoryViewHolder(View itemView) {
           super(itemView);

           tvName = (TextView) itemView.findViewById(R.id.tv_item_name);
           tvRemarks = (TextView) itemView.findViewById(R.id.tv_item_remarks);
           imgPhoto = (ImageView) itemView.findViewById(R.id.img_item_photo);
        }
   }
}
