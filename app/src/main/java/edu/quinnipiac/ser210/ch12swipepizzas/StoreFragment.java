package edu.quinnipiac.ser210.ch12swipepizzas;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


/**
 * A simple {@link Fragment} subclass.

 */
public class StoreFragment extends ListFragment {
    // TODO: Rename parameter arguments, choose names that match
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
            inflater.getContext(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.store));
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState); }
}