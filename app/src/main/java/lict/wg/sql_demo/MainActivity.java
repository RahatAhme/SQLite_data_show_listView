package lict.wg.sql_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText title,content;
    Button saveButton;
    DataBaseHandler handler ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.titleId);
        content = findViewById(R.id.descriptBoxId);

        saveButton=findViewById(R.id.saveButoonId);
        handler = new DataBaseHandler(MainActivity.this);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String titleText = title.getText().toString();
                String contentText = content.getText().toString();
                Long date = System.currentTimeMillis();

                ToDoModel toDoModel = new ToDoModel();
                toDoModel.setTitle(titleText);
                toDoModel.setContent(contentText);
                toDoModel.setDate(date);

                handler.interData(toDoModel);

                Intent intent = new Intent(getApplicationContext(),ToDoList.class);
                startActivity(intent);


            }
        });
    }
}
