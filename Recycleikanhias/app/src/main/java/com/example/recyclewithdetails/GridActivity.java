package com.example.recyclewithdetails;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class GridActivity extends RecyclerView.Adapter<GridActivity.GridViewHolder> {

    private static final String TAG = "ListView";
    private ArrayList<String> namaGambar = new ArrayList<>();
    private ArrayList<String> gambars = new ArrayList<>();
    private ArrayList<String> deskripsi = new ArrayList<>();
    private ArrayList<String> penjelasan = new ArrayList<>();

    private Context mContext;

    public GridActivity(Context mContext,ArrayList<String> namaGambar, ArrayList<String> gambars, ArrayList<String> deskripsi , ArrayList<String> penjelasan ) {

        this.namaGambar = namaGambar;
        this.gambars = gambars;
        this.deskripsi = deskripsi;
        this.penjelasan = penjelasan;
        this.mContext = mContext;

    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_grid, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, final int i) {
        Glide.with(mContext)
                .asBitmap()
                .load(gambars.get(i))
                .into(holder.imgPhoto);
        holder.imgPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"onClick: clicked on: "+ namaGambar.get(i));
                Toast.makeText(mContext, namaGambar.get(i),Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, GalleryActivity.class);
                intent.putExtra("image_url",gambars.get(i));
                intent.putExtra("image_name",namaGambar.get(i));
                intent.putExtra("image_desc",penjelasan.get(i));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return gambars.size();
    }

    @Override
    public int getItemViewType(int position){
        return position;
    }

    class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}

