package com.sofiahardcode.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Place place = getItem(position);

        ImageView imageView = convertView.findViewById(R.id.item_image);

        if (place.hasImage()) {
            imageView.setImageResource(place.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        TextView titleView = convertView.findViewById(R.id.item_title);
        titleView.setText(place.getTitleResourceId());

        TextView descriptionView = convertView.findViewById(R.id.item_description);
        descriptionView.setText(place.getDescriptionResourceId());

        return convertView;
    }
}
