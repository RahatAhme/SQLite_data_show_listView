package lict.wg.sql_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ToDoList extends AppCompatActivity {

    ListView listView;
    Adapter adapter;
    ArrayList<ToDoModel> todoList;
    DataBaseHandler dbh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_list);

        listView = findViewById(R.id.listViewId);

        dbh = new DataBaseHandler(this);
        todoList = dbh.viewAll();
        adapter = new Adapter(ToDoList.this, todoList , R.layout.single_row.class);
        listView.setAdapter(adapter);
    }
}
