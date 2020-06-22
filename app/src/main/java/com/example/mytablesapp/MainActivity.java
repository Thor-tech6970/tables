package com.example.mytablesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBar;

    ListView listView;

    ArrayAdapter arrayAdapter;

    public  void passednumber(int tableof) {

        List tables = new ArrayList();

        listView = (ListView) findViewById(R.id.tableListView);

        for (int i=1;i<=10;i++){

            tables.add(Integer.toString(tableof*i));


        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,tables);

        listView.setAdapter(arrayAdapter);

    }}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.tableListView);

        seekBar = (SeekBar) findViewById(R.id.tableSeekBar);



       seekBar.setMax(100);

       seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
          @Override
          public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

              int min =1;
              int tableof;

              if(progress<1){

                  tableof = min;

                  //seekBar.setProgress(tableof);
              }

              else{

                  tableof = progress;

                  //seekBar.setProgress(tableof);

              }
              passednumber(tableof);
          }

          @Override
          public void onStartTrackingTouch(SeekBar seekBar) {

          }

          @Override
          public void onStopTrackingTouch(SeekBar seekBar) {

          }
      });


    }
}
