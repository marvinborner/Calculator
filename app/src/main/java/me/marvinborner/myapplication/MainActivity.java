package me.marvinborner.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDiv,
            buttonMul, button10, buttonC, buttonEqual;
    TextView PreResultTextView, ResultTextView;

    double mValueOne, mValueTwo;

    boolean Addition, Subtraction, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        buttonAdd = findViewById(R.id.buttonadd);
        buttonSub = findViewById(R.id.buttonsub);
        buttonMul = findViewById(R.id.buttonmul);
        buttonDiv = findViewById(R.id.buttondiv);
        buttonC = findViewById(R.id.buttonC);
        buttonEqual = findViewById(R.id.buttoneql);
        PreResultTextView = findViewById(R.id.preRes);
        ResultTextView = findViewById(R.id.res);

        ResultTextView.setMovementMethod(new ScrollingMovementMethod());


        // TYPE NUMBERS
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultTextView.setText(ResultTextView.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultTextView.setText(ResultTextView.getText() + "1");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultTextView.setText(ResultTextView.getText() + ".");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultTextView.setText(ResultTextView.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultTextView.setText(ResultTextView.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultTextView.setText(ResultTextView.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultTextView.setText(ResultTextView.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultTextView.setText(ResultTextView.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultTextView.setText(ResultTextView.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultTextView.setText(ResultTextView.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultTextView.setText(ResultTextView.getText() + "9");
            }
        });

        // ACTUAL MATHS
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ResultTextView != null) {
                    mValueOne = Double.parseDouble(ResultTextView.getText() + "");
                    Addition = true;
                    PreResultTextView.setText("+");
                    ResultTextView.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Double.parseDouble(ResultTextView.getText() + "");
                Subtraction = true;
                PreResultTextView.setText("-");
                ResultTextView.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Double.parseDouble(ResultTextView.getText() + "");
                Multiplication = true;
                PreResultTextView.setText("×");
                ResultTextView.setText(null);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Double.parseDouble(ResultTextView.getText() + "");
                Division = true;
                PreResultTextView.setText("÷");
                ResultTextView.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mValueOne != 0) {
                    mValueTwo = Double.parseDouble(ResultTextView.getText() + "");
                    PreResultTextView.setText("");
                    if (Addition) {
                        ResultTextView.setText(mValueOne + mValueTwo + "");
                        Addition = false;
                    } else if (Subtraction) {
                        ResultTextView.setText(mValueOne - mValueTwo + "");
                        Subtraction = false;
                    } else if (Multiplication) {
                        ResultTextView.setText(mValueOne * mValueTwo + "");
                        Multiplication = false;
                    } else if (Division) {
                        ResultTextView.setText(mValueOne / mValueTwo + "");
                        Division = false;
                    }
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultTextView.setText("");
                PreResultTextView.setText("");
            }
        });
    }

    public void UpdatePreResult(View v) {
        Button NumberButton = (Button) v;
        if (mValueOne != 0) {
            PreResultTextView.setText(NumberButton.getText().toString() + Double.parseDouble(ResultTextView.getText() + ""));
        }
    }
}
