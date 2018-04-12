package lict.wg.sql_demo;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by USER on 3/20/2018.
 */

public class ToDoModel {


        private int id;
        private String title;
        private String content;
        private long date;

        public ToDoModel() {
        }

        public ToDoModel(int id, String title, String content, long date) {
            this.id = id;
            this.title = title;
            this.content = content;
            this.date = date;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public long getDate() {
            return date;
        }

        public void setDate(long date) {
            this.date = date;
        }



    }

