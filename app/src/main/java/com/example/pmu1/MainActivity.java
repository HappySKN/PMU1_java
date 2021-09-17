package com.example.pmu1;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Функция для получения максимального значения из двух переданных
     * @param a Первое значение
     * @param b Второе значение
     * @return Возврат наибольшего значения
     */
    public static int max(int a, int b)
    {
        if(a > b) return a;
        else return b;
    }

    /**
     * Функция для получения минимального значения из двух переданных
     * @param a Первое значение
     * @param b Второе значение
     * @return Возврат наименьшего значения
     */
    public static int min(int a, int b)
    {
        if(a < b) return a;
        else return b;
    }

    public void onClickHello(View v)
    {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText("HelloWorld");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}