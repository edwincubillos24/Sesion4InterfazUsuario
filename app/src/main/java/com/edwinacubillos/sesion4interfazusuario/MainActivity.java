package com.edwinacubillos.sesion4interfazusuario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText eTo, eSubject, eMessage;
    Button bSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTo = (EditText) findViewById (R.id.eTo);
        eSubject = (EditText) findViewById (R.id.eSubject);
        eMessage = (EditText) findViewById(R.id.eMessage);
        bSend = (Button) findViewById(R.id.bSend);

        bSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*
                String to,subject,message;
                to = eTo.getText().toString();
                subject = eSubject.getText().toString();
                message = eMessage.getText().toString();

                eSubject.setText(to);
                */
                int to,subject,message;
                to = Integer.parseInt(eTo.getText().toString());
                subject = Integer.parseInt(eSubject.getText().toString());

                message = to * subject;

            //    eMessage.setText(String.valueOf(message)); opcion1
                eMessage.setText(Integer.toString(message));

            }
        });

    }
}
