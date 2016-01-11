package com.example.hungry.newspaperwalaapp;

import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
GridView gridView;
String[] itemsToShow=new String[]{"Newspaper" +
        " Pricing","Billing " + "Section","Reports","Bill Receipt","Settings","Contact us"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=(GridView)findViewById(R.id.mainListButtons);
        gridView.setAdapter(new ShowCustomItems(itemsToShow));
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    private class ShowCustomItems extends BaseAdapter {
        String customItemsList[] = null;

        public ShowCustomItems(String[] itemsToShow) {
            customItemsList = itemsToShow;
        }


        @Override
        public int getCount() {
            return customItemsList.length;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater layoutInflater = getLayoutInflater();
            View view = layoutInflater.inflate(R.layout.customgridview, null);
            TextView imageButton = (TextView) view.findViewById(R.id.imgbtnDemo);
            imageButton.setText(customItemsList[position]);
            return view;
        }
    }
}
