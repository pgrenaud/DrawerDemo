package com.pgrenaud.android.drawerdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FirstFragment extends Fragment {

    public FirstFragment() {
    }

    public static FirstFragment newInstance() {
        return new FirstFragment();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Log.d("FirstFragment", "onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("FirstFragment", "onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("FirstFragment", "onCreateView");

        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Log.d("FirstFragment", "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();

        Log.d("FirstFragment", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();

        Log.d("FirstFragment", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();

        Log.d("FirstFragment", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();

        Log.d("FirstFragment", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        Log.d("FirstFragment", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.d("FirstFragment", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();

        Log.d("FirstFragment", "onDetach");
    }
}
