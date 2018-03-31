package com.example.dell.calci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Float.parseFloat;

public class MainActivity extends AppCompatActivity {

    Button one,two,three,four,five,six,seven,eight,nine,zero,equal,plus,minus,mul,div,clear,decimal;
    TextView tv;
    float num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        equal = (Button) findViewById(R.id.equal);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        clear = (Button) findViewById(R.id.clear);
        decimal = (Button) findViewById(R.id.decimal);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText() + "9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText() + "0");
            }
        });
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText() + ".");
            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = parseFloat(tv.getText().toString());
                tv.setText(tv.getText() + "+");

                equal.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String [] parts = tv.getText().toString().split("\\+");
                        num2 = parseFloat(parts[1]);
                        tv.setText(""+(num1+num2));

                    }
                });
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = parseFloat(tv.getText().toString());
                tv.setText(tv.getText() + "-");

                equal.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String [] parts = tv.getText().toString().split("-");
                        num2 = parseFloat(parts[1]);
                        tv.setText(""+(num1-num2));

                    }
                });
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = parseFloat(tv.getText().toString());
                tv.setText(tv.getText() + "x");

                equal.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String [] parts = tv.getText().toString().split("x");
                        num2 = parseFloat(parts[1]);
                        tv.setText(""+(num1*num2));

                    }
                });
            }
        });

//        div.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                num1 = parseFloat(tv.getText().toString());
//                tv.setText(tv.getText() + "/");
//
//                equal.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        String [] parts = tv.getText().toString().split("/");
//                        num2 = parseFloat(parts[1]);
//                        tv.setText(""+(num1/num2));
//
//                    }
//                });
//            }
//        });





    }
}
