package com.libelium.mysignalsconnecttest;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainNew extends Activity {

    private MySignals ms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainnew);
//        ms = new MySignals(this);
//        printCharacteristic();
        Intent mySignalsServiceIntent = new Intent(this, MySignalsService.class);
        this.startService(mySignalsServiceIntent);


    }

    protected void printCharacteristic(){
        while (true){
            try{
                Thread.sleep(3000);
                System.out.println(ms.readCharacteristic(ms.getBluetoothCharacteristic()));
            }
            catch(Exception e){

            }


        }
    }
}
