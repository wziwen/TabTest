package com.example.fragments;


import com.example.uitestacitivity.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentRed extends Fragment 
{

	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) 
	{
		View mView=inflater.inflate(R.layout.layout_red, container, false);
		return mView;
	}
	
}
