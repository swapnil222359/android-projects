package com.example.sony.mycrudapplication;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sony on 18-11-2016.
 */

public class EmployeeLab {
    private static EmployeeLab sEmployeeLab;
    private List<Employee> mList;

    public static EmployeeLab get(Context context){
        if(sEmployeeLab==null){
            sEmployeeLab=new EmployeeLab(context);

        }
        return sEmployeeLab;
    }
    public void addEmployee(String name,String age,String number,String dep){
        mList=new ArrayList<>();
        Employee emp = new Employee(name ,Integer.parseInt(age),Integer.parseInt(number),dep);
        mList.add(emp);

    }
    private EmployeeLab(Context context){
        mList= new ArrayList<>();
        for(int i=1;i<10;i++)
        {
            }

    }
    public List<Employee> getList(){
        return mList;
    }
}
