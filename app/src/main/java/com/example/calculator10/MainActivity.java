package com.example.calculator10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button Button0,button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttonEqual,buttonDot,buttonC,  buttonMod,buttonRoot,buttonPow;
    public ImageButton buttonDel;

    TextView text1,result;

    String f=new String();

    Double oparant1=Double.NaN,oparant2,temp=Double.NaN;


    boolean activeadd,activesub,activemul,activediv,activemod,activeroot,activepow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDivision = (Button) findViewById(R.id.buttonDiv);
        buttonEqual = (Button) findViewById(R.id.buttonEqueal);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonMod=(Button) findViewById(R.id.buttonMod);
        buttonRoot=(Button) findViewById(R.id.buttonSqureroot);
        buttonDel=(ImageButton) findViewById(R.id.buttonDel);
        buttonPow=(Button) findViewById(R.id.buttonPow);
        text1=(TextView) findViewById(R.id.Expretion);
        result=(TextView) findViewById(R.id.result);

        Button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + "0");
                if(!Double.isNaN(oparant1)) {
                   f=f+"0";
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + "1");
                if(!Double.isNaN(oparant1)) {
                    f=f+"1";
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + "2");
                if(!Double.isNaN(oparant1)) {
                    f=f+"2";
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + "3");
                if(!Double.isNaN(oparant1)) {
                    f=f+"3";
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + "4");
                if(!Double.isNaN(oparant1)) {
                    f=f+"4";
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + "5");
                if(!Double.isNaN(oparant1)) {
                    f=f+"5";
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + "6");
                if(!Double.isNaN(oparant1)) {
                    f=f+"6";
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + "7");
                if(!Double.isNaN(oparant1)) {
                    f=f+"7";
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + "8");
                if(!Double.isNaN(oparant1)) {
                    f=f+"8";
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + "9");
                if(!Double.isNaN(oparant1)) {
                    f=f+"9";
                }
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + ".");
                if(!Double.isNaN(oparant1)) {
                    f=f+".";
                }

            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText("");
                result.setText("");
                f="";
                temp=Double.NaN;
                oparant1=Double.NaN;
                activemul=false;
                activediv=false;
                activeadd=false;
                activesub=false;
                activemod=false;
                activeroot=false;
            }
        });
        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text1.getText().length() > 0) {
                    CharSequence currentText = text1.getText();
                    text1.setText(currentText.subSequence(0, currentText.length()-1));
                }
                else {
                    temp = Double.NaN;
                    oparant1 = Double.NaN;
                    text1.setText("");
                    result.setText("");
                }
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                oparant1=Double.parseDouble(text1.getText().toString());
                text1.setText(text1.getText()+"+");
                activeadd=true;

            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                oparant1=Double.parseDouble(text1.getText().toString());
                text1.setText(text1.getText()+"-");
                activesub=true;

            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                oparant1=Double.parseDouble(text1.getText().toString());
                text1.setText(text1.getText()+"*");
                activemul=true;

            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                oparant1=Double.parseDouble(text1.getText().toString());
                text1.setText(text1.getText()+"/");
                activediv=true;

            }
        });
        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                oparant1=Double.parseDouble(text1.getText().toString());
                text1.setText(text1.getText()+"%");
                activemod=true;

            }
        });
        buttonPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                oparant1=Double.parseDouble(text1.getText().toString());
                text1.setText(text1.getText()+"^");
                activepow=true;

            }
        });
        buttonRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activeroot=true;
                text1.setText(text1.getText()+""+"√");
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                oparant2=Double.parseDouble(f);
                cal();
                result.setText(oparant1+"");
                oparant1=Double.NaN;
                oparant2=Double.NaN;


            }
        });

    }
    public void cal(){
        if(!Double.isNaN(oparant1)){



            if (activeadd == true) {
                oparant1=this.oparant1+oparant2;
                activeadd=false;
            }
            else if (activesub == true) {
                oparant1=this.oparant1-oparant2;
                activesub=false;
            }

            else if (activemul == true) {
                oparant1=this.oparant1*oparant2;
                activemul=false;
            }

            else if (activeroot== true) {
                oparant1=Math.sqrt(this.oparant1);
                activeroot=false;
            }
            else if (activediv== true) {
                oparant1 =this.oparant1/oparant2;
                activediv=false;
            }
            else if (activemod== true) {
                oparant1 =this.oparant1%oparant2;
                activemod=false;
            }
            else if (activepow== true) {
                oparant1 =Math.pow(this.oparant1,oparant2);
                activepow=false;
            }


        }
        else {
            try{
                oparant1=Double.parseDouble(text1.getText() + "");
            }
            catch (Exception e){}
        }


    }
}
