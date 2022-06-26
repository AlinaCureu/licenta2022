package com.jonyapps.a2022proiect.ui.inregistrare;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.jonyapps.a2022proiect.R;
import com.jonyapps.a2022proiect.SQL;
import java.sql.Connection;
import java.sql.Statement;


public class InregistrareFragment extends Fragment {

    private Button b2;
    private EditText name,password,email,address,phonenumber,confirmpassword;
    TextView alreadyNewAccount;
    Button btnRegister;

    public View onCreateView( LayoutInflater inflater,
                              ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_inregistrare, container, false);
        b2= v.findViewById(R.id.btnRegister);
        name= v.findViewById(R.id.inputUser);
        password= v.findViewById(R.id.inputPassword);
        email= v.findViewById(R.id.inputEmail);
        address= v.findViewById(R.id.inputAddress);
        phonenumber= v.findViewById(R.id.inputNumberPhone);
       b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQL connection = new SQL();
                try {
                    Connection sqlConnection=connection.getConnection();
                    Statement statement=sqlConnection.createStatement();
                    String sqlinsert = "Insert into register(name,email,password,phonenumber) values ('" + name.getText().toString() + "','" + email.getText().toString() + "','" + password.getText().toString() + "','" + phonenumber.getText().toString() + "')";
                    statement.execute(sqlinsert);

                    /*ResultSet resultSet = statement.executeQuery("INSERT INTO Tabela VALUES (23,'BKL');");
                    while (resultSet.next()) {
                        //textView.setText(resultSet.getString(1));
                        Log.i("Sql",resultSet.getString(1));
                    }*/
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.e("Error",e.getMessage());
                }
            }
        });


        return v;
    }
}