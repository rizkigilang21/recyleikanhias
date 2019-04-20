package com.example.recyclewithdetails;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;



public class ListActivity extends RecyclerView.Adapter<ListActivity.ViewHolder> {

    private static final String TAG = "ListView";

    private ArrayList<String> namaGambar = new ArrayList<>();
    private ArrayList<String> gambars = new ArrayList<>();
    private ArrayList<String> deskripsi = new ArrayList<>();
    private ArrayList<String> penjelasan = new ArrayList<>();

    private Context mContext;

    public ListActivity(Context mContext,ArrayList<String> namaGambar, ArrayList<String> gambars, ArrayList<String> deskripsi , ArrayList<String> penjelasan ) {
        this.namaGambar = namaGambar;
        this.gambars = gambars;
        this.deskripsi = deskripsi;
        this.penjelasan = penjelasan;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int i) {
        Log.d(TAG,"onBindViewHolder: called.");

        Glide.with(mContext)
                .asBitmap()
                .load(gambars.get(i))
                .into(holder.image);
        holder.imageName.setText(namaGambar.get(i));
        holder.imageDesc.setText(deskripsi.get(i));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
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
        return namaGambar.size();
    }

    @Override
    public int getItemViewType(int position){
        return position;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView imageName;
        TextView imageDesc;
        RelativeLayout parentLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.gambar);
            imageName = itemView.findViewById(R.id.nama);
            imageDesc = itemView.findViewById(R.id.deskripsi);
            parentLayout = itemView.findViewById(R.id.list);
        }
    }
}
