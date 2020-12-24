package com.sofiahardcode.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NightLifeFragment extends Fragment {
    public NightLifeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> nightClubs = new ArrayList<>();
        nightClubs.add(new Place(R.string.club_void, R.string.club_void_description, R.drawable.club_void));
        nightClubs.add(new Place(R.string.club_fargo, R.string.club_fargo_description, R.drawable.club_fargo));
        nightClubs.add(new Place(R.string.quattro_piano_bar, R.string.quattro_piano_bar_description, R.drawable.quattro_piano_bar));

        ListView listView = rootView.findViewById(R.id.list);
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), nightClubs);
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}