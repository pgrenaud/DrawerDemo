package com.pgrenaud.android.drawerdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SecondFragment extends Fragment {

    public SecondFragment() {
    }

    public static SecondFragment newInstance() {
        return new SecondFragment();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Log.d("SecondFragment", "onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("SecondFragment", "onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("SecondFragment", "onCreateView");

        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Log.d("SecondFragment", "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();

        Log.d("SecondFragment", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();

        Log.d("SecondFragment", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();

        Log.d("SecondFragment", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();

        Log.d("SecondFragment", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        Log.d("SecondFragment", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.d("SecondFragment", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();

        Log.d("SecondFragment", "onDetach");
    }
}
