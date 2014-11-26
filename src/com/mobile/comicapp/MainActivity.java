package com.mobile.comicapp;

import com.mobile.adapters.CustomListviewImageTextAdapter;
import com.mobile.objects.MyChapter;
import com.mobile.utils.GlobalValues;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {

	ListView listChapters;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        GlobalValues.ListChapter.add(new MyChapter(0, "Chapter 1", 25, "ABC"));
        GlobalValues.ListChapter.add(new MyChapter(1, "Chapter 2", 25, "ABC"));
        GlobalValues.ListChapter.add(new MyChapter(2, "Chapter 3", 25, "ABC"));
        GlobalValues.ListChapter.add(new MyChapter(3, "Chapter 4", 25, "ABC"));
        GlobalValues.ListChapter.add(new MyChapter(4, "Chapter 5", 25, "ABC"));
        
        LoadListChaptersToListView();
    }
    
    private void LoadListChaptersToListView(){
    	listChapters = (ListView) findViewById(R.id.main_list_chapter);
    	CustomListviewImageTextAdapter adapter = new CustomListviewImageTextAdapter(this);
    	listChapters.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
