package com.example.daniel.targetview;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Daniel on 20/04/2016.
 */
public class landscapeAdapter extends RecyclerView.Adapter<landscapeAdapter.landscapeViewHolder> {


    private List<Landscape> landscapes;

    public landscapeAdapter(List<Landscape> landscapes) {
        this.landscapes = landscapes;
    }

    @Override
    public landscapeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //return null;
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardviewlandscape, parent, false);
        return new landscapeViewHolder(v);

    }

    @Override
    public void onBindViewHolder(landscapeViewHolder landscapeViewHolder, int position) {

        Landscape land = landscapes.get(position);
        landscapeViewHolder.imgPic.setImageResource(land.getPicture());
        landscapeViewHolder.tvName.setText(land.getName());

    }

    @Override
    public int getItemCount() {
        return landscapes.size();
    }

    public static class landscapeViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgPic;
        private TextView tvName;

        public landscapeViewHolder(View itemView) {
            super(itemView);

            imgPic = (ImageView) itemView.findViewById(R.id.imgPic);
            tvName = (TextView) itemView.findViewById(R.id.tvName);

        }
    }

}
