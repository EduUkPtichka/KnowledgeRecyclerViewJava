package com.example.knowledgerecyclerviewjava;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {


    private List<VideoItem> videoList;
    private RecyclerView homeRecyclerView;
    private VideoAdapter videoAdapter;

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        videoList = generateVideoItems();

        homeRecyclerView = rootView.findViewById(R.id.home_recyclerView);

        homeRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        videoAdapter = new VideoAdapter(videoList);


        homeRecyclerView.setAdapter(videoAdapter);

        return rootView;
    }

    private List<VideoItem> generateVideoItems(){
        List<VideoItem> videoItems = new ArrayList<>();

             videoItems.add( new VideoItem(R.drawable.ic_launcher_background, "1", "2 часа", R.drawable.ic_launcher_foreground));
             videoItems.add( new VideoItem(R.drawable.ic_launcher_background, "2","2 часа",  R.drawable.ic_launcher_foreground));
             videoItems.add( new VideoItem(R.drawable.ic_launcher_background, "3","2 часа",  R.drawable.ic_launcher_foreground));

        return videoItems;
    }
}