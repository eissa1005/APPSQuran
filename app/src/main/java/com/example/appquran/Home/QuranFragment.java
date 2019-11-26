package com.example.appquran.Home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.appquran.Adapters.DataHolder;
import com.example.appquran.Adapters.QuranAdapter;
import com.example.appquran.Base.BaseFragment;
import com.example.appquran.R;

import org.jetbrains.annotations.Nullable;


public class QuranFragment extends BaseFragment {

     RecyclerView recyclerView;
     RecyclerView.LayoutManager layoutManager;
     QuranAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
          View view =inflater.inflate(R.layout.fragment_quran,container,false);
           recyclerView = view.findViewById(R.id.recycler_view);
           layoutManager = new GridLayoutManager(getContext(),3,GridLayoutManager.HORIZONTAL,true);
           recyclerView.setLayoutManager(layoutManager);
           adapter = new QuranAdapter(DataHolder.ArSuras);
           recyclerView.setAdapter(adapter);
           return  view;
    }
}
