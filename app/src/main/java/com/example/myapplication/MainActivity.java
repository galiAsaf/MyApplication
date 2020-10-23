package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompatSideChannelService;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        int id = item.getItemId();
        if (id == R.id.one)
        {
            restartGame();
        }
        if (id==R.id.two)
        {
            Toast.makeText(this,"Login pressed", Toast.LENGTH_LONG).show();

        }
        return true;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn10;
    private Button restart;
    private boolean flag = false;
    private boolean flag2 = true;
    int turn =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btn10 = findViewById(R.id.button10);
        restart = findViewById(R.id.button11);



        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        restart.setOnClickListener(this);

    }
//i stop in ubable hasima

    @Override
    public void onClick(View v) {
        if ((!flag) && (flag2))
        {
            switch (v.getId()) {
                case R.id.button:
                    findTurn(v);
                    Toast.makeText( this, "btn1", Toast.LENGTH_LONG).show();
                    flag = checkWin();
                    v.setEnabled(false);
                    break;
                case R.id.button2:
                    findTurn(v);
                    Toast.makeText( this, "btn1", Toast.LENGTH_LONG).show();
                    flag = checkWin();
                    v.setEnabled(false);
                    break;
                case R.id.button3:
                    findTurn(v);
                    Toast.makeText( this, "btn1", Toast.LENGTH_LONG).show();
                    flag = checkWin();
                    v.setEnabled(false);
                    break;
                case R.id.button4:
                    findTurn(v);
                    Toast.makeText( this, "btn1", Toast.LENGTH_LONG).show();
                    flag = checkWin();
                    v.setEnabled(false);
                    break;
                case R.id.button5:
                    findTurn(v);
                    Toast.makeText( this, "btn1", Toast.LENGTH_LONG).show();
                    flag = checkWin();
                    v.setEnabled(false);
                    break;
                case R.id.button6:
                    findTurn(v);
                    Toast.makeText( this, "btn1", Toast.LENGTH_LONG).show();
                    flag = checkWin();
                    break;
                case R.id.button7:
                    findTurn(v);
                    Toast.makeText( this, "btn1", Toast.LENGTH_LONG).show();
                    flag = checkWin();
                    break;
                case R.id.button8:
                    findTurn(v);
                    Toast.makeText( this, "btn1", Toast.LENGTH_LONG).show();
                    flag = checkWin();
                    break;
                case R.id.button9:
                    findTurn(v);
                    Toast.makeText( this, "btn1", Toast.LENGTH_LONG).show();
                    flag = checkWin();
                    break;
                case R.id.button11:
                    flag = false;
                    flag2 = false;
                    restartGame();
                    Toast.makeText( this, "btn1", Toast.LENGTH_LONG).show();
                    break;
            }
        }


        if (flag == true)
        {
            if (turn % 2 == 0)
            {
                ((Button)btn10).setText("X -> you WIN");
            }
            else
            {
                ((Button)btn10).setText("O -> you WIN");
            }
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        turn++;
    }

    public void findTurn (View b) {
        //((Button)b).getText();
        //((Button)b).setText("");
        if (((Button)b).getText().toString() == "") {
            if (turn % 2 == 0) {
                ((Button) b).setText("X");
            } else {
                ((Button) b).setText("O");
            }
        }

    }

    public boolean checkWin ()
    {
        if (!((((Button)btn1).getText().toString() == "") && (((Button)btn2).getText().toString() == "") && (((Button)btn3).getText().toString() == "")))
        {
            if ((btn1.getText().toString() == btn2.getText().toString()) && (btn1.getText().toString() == btn3.getText().toString()))
            {//check first line
                return true;
            }
        }

        if (!((((Button)btn4).getText().toString() == "") && (((Button)btn5).getText().toString() == "") && (((Button)btn6).getText().toString() == "")))
        {
            if ((btn4.getText().toString() == btn5.getText().toString()) && (btn4.getText().toString() == btn6.getText().toString())) {//check second line
                return true;
            }
        }
        if (!((((Button)btn7).getText().toString() == "") && (((Button)btn8).getText().toString() == "") && (((Button)btn9).getText().toString() == "")))
        {
            if ((btn7.getText().toString() == btn8.getText().toString()) && (btn7.getText().toString() == btn9.getText().toString())) {//check third line
                return true;
            }
        }
        if (!((((Button)btn1).getText().toString() == "") && (((Button)btn5).getText().toString() == "") && (((Button)btn7).getText().toString() == "")))
        {
            if ((btn1.getText().toString() == btn5.getText().toString()) && (btn1.getText().toString() == btn7.getText().toString()))
            {//check first row
                return true;
            }
        }
        if (!((((Button)btn2).getText().toString() == "") && (((Button)btn4).getText().toString() == "") && (((Button)btn8).getText().toString() == "")))
        {
            if ((btn2.getText().toString() == btn4.getText().toString()) && (btn2.getText().toString() == btn8.getText().toString()))
            {//check second row
                return true;
            }
        }
        if (!((((Button)btn3).getText().toString() == "") && (((Button)btn6).getText().toString() == "") && (((Button)btn9).getText().toString() == "")))
        {
            if ((btn3.getText().toString() == btn6.getText().toString()) && (btn3.getText().toString() == btn9.getText().toString()))
            {//check third row
                return true;
            }
        }

        return false;
    }
    public void restartGame() {
        ((Button) btn1).setEnabled(true);
        ((Button) btn1).setText("");
        ((Button) btn2).setEnabled(true);
        ((Button) btn2).setText("");
        ((Button) btn3).setEnabled(true);
        ((Button) btn3).setText("");
        ((Button) btn4).setEnabled(true);
        ((Button) btn4).setText("");
        ((Button) btn5).setEnabled(true);
        ((Button) btn5).setText("");
        ((Button) btn6).setEnabled(true);
        ((Button) btn6).setText("");
        ((Button) btn7).setEnabled(true);
        ((Button) btn7).setText("");
        ((Button) btn8).setEnabled(true);
        ((Button) btn8).setText("");
        ((Button) btn9).setEnabled(true);
        ((Button) btn9).setText("");
    }
}

