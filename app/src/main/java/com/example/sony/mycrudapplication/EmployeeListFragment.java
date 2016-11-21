package com.example.sony.mycrudapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sony on 18-11-2016.
 */
public class EmployeeListFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private Employee mEmployee;
    private EmployeeAdapter employeeadapter;
    private Employee emp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view= inflater.inflate(R.layout.viewemployeelist,container,false);
        mRecyclerView= (RecyclerView) view.findViewById(R.id.list_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateUI();
        return view;
    }

    private void updateUI() {
        EmployeeLab emplab= EmployeeLab.get(getActivity());
        List<Employee> list = emplab.getList();
        if(employeeadapter==null){
            employeeadapter=new EmployeeAdapter(list);
            mRecyclerView.setAdapter(employeeadapter);
        }
        else
            employeeadapter.notifyDataSetChanged();


    }

    public class EmployeeHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView mEmpName;
        private TextView mEmpid;
        public EmployeeHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            mEmpid= (TextView) itemView.findViewById(R.id.empid);
            mEmpName= (TextView) itemView.findViewById(R.id.empname);
        }
        public void BindEmployee(Employee emp){
            mEmployee=emp;
            mEmpid.setText(emp.getId());
            mEmpName.setText(emp.getName());

        }

        @Override
        public void onClick(View v) {

        }
    }

    public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeHolder>{

        private List<Employee>emplist;
        public EmployeeAdapter(List<Employee> list) {
            emplist=list;
        }

        @Override
        public EmployeeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(R.layout.item_list_employee,parent,false);
            return new EmployeeHolder(view);
        }

        @Override
        public void onBindViewHolder(EmployeeHolder holder, int position) {
            Employee emp = emplist.get(position);
            holder.BindEmployee(emp);
        }

        @Override
        public int getItemCount() {
            return emplist.size();
        }
    }
}
