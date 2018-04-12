package lict.wg.sql_demo;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by USER on 3/20/2018.
 */

public class Adapter extends BaseAdapter {

    Context context;
    ArrayList<ToDoModel> toDoModels;
    int resources;

    public Adapter(Context context, ArrayList<ToDoModel> toDoModels, int resources) {
        this.context = context;
        this.toDoModels = toDoModels;
        this.resources = resources;
    }




    @Override
    public int getCount() {
        return toDoModels.size();
    }

    @Override
    public ToDoModel getItem(int position) {
        return  toDoModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(resources,parent,false);
        TextView title = view.findViewById(R.id.titleID);
        TextView content = view.findViewById(R.id.contentID);
        TextView date = view.findViewById(R.id.dateID);
        ToDoModel toDoModel = getItem(position);
        title.setText(toDoModel.getTitle());
        content.setText(toDoModel.getContent());
        Date df = new java.util.Date(toDoModel.getDate());
        String vv = new SimpleDateFormat("dd,MM,YYYY").format(df);
        date.setText(vv);

        return view;
    }
}
