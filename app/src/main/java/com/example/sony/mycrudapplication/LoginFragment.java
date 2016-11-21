package com.example.sony.mycrudapplication;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by sony on 18-11-2016.
 */
public class LoginFragment extends Fragment {

    private Button viewlist;
    private Button addemp;
    private Button modifyemp;
    private Button updatemp;
    private Button deleteemp;
    @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        Toast.makeText(getActivity()," entered!",Toast.LENGTH_LONG).show();
        View view=inflater.inflate(R.layout.login_form,container,false);
        viewlist= (Button) view.findViewById(R.id.view);
        viewlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  EmployeeListActivity.newIntent(getActivity());
                startActivity(intent);

            }
        });
        addemp= (Button) view.findViewById(R.id.add);
        addemp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity()," clicked!",Toast.LENGTH_SHORT).show();
                final Dialog dialog= new Dialog(getActivity());
                dialog.setContentView(R.layout.add_employee);
                dialog.setCancelable(true);
                Button add;
                final EditText name= (EditText) dialog.findViewById(R.id.name);
                final EditText age= (EditText) dialog.findViewById(R.id.age);
                final EditText number= (EditText) dialog.findViewById(R.id.mobile_number);
                final EditText dep= (EditText) dialog.findViewById(R.id.department);

                add= (Button) dialog.findViewById(R.id.addtheemployee);
                add.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EmployeeLab employeeLab= EmployeeLab.get(getActivity());
                        employeeLab.addEmployee(name.getText().toString(),age.getText().toString(),number.getText().toString(),dep.getText().toString());
                        dialog.dismiss();

                    }
                });



            }
        });
        return view;
    }
}
