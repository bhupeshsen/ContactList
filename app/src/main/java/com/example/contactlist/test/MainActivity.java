package com.example.contactlist.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.contactlist.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  RecyclerView contactList;
  ContactAdapter contactAdapterList;
  ArrayList<ContactModelClass> contactModelClassArrayList;
  EditText userName,userContact;
  private Button btnAdd;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userContact=findViewById(R.id.userMobile);
        userName=findViewById(R.id.userName);
        btnAdd=findViewById(R.id.btnAdd);
        contactModelClassArrayList=new ArrayList<>();
        contactList=findViewById(R.id.contactListId);
        contactList.setHasFixedSize(true);
        contactList.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    btnAdd.setOnClickListener(v->
    {

        String strUserName = "", strUserContact = "";
        if (userName.getText() != null) {
            strUserName = userName.getText().toString();
        }

        if (strUserName.equals("")) {
            Toast.makeText(this, "Please enter user name", Toast.LENGTH_LONG).show();
            return;
        }

        if (userContact.getText() != null) {
            strUserContact = userContact.getText().toString();
        }
        if (strUserContact.equals("")) {
            Toast.makeText(this, "Please enter your contact number", Toast.LENGTH_LONG).show();
            return;
        }


        addContact(strUserName, strUserContact);
    });

    }

public void addContact(String strna, String strcon)
{



    Toast.makeText(this, "userr"+strna+"contact"+strcon, Toast.LENGTH_LONG).show();


   ContactModelClass obj = new  ContactModelClass();

    obj.setUserName(strna);
    obj.setUserNumber(strcon);


    contactModelClassArrayList.add(obj);



    contactAdapterList = new ContactAdapter(this, contactModelClassArrayList);
    contactList.setAdapter(contactAdapterList);
}
}
