package com.coral.kotlin;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by xss on 2017/7/22.
 */

public class JavaTest2 {

    private int i;

    private int j = 1;

    private String s;

    private InnerClass innerObj;

    private static int a;

    private final int b = 1;

    private final String C = "xss";

    public void setI(int i) {
        this.i = i;
    }

    public void setS(String s) {
        this.s = s;
    }

    private Button btn;


    public void setData(int i, String s) {
        setI(i);
        setS(s);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(null, "Hello kotlin", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void setInnerObj(InnerClass obj) {
        if (obj == null) {
            obj = new InnerClass();
        }
        this.innerObj = obj;
        Log.e("xss", "set obj");

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(102);
        list.add(101);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
    }

    public static class InnerClass {
        private int a;

        public void setA(int a) {
            this.a = a;
        }
    }
}
