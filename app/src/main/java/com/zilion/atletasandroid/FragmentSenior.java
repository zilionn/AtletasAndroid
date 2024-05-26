package com.zilion.atletasandroid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

public class FragmentSenior extends Fragment {

    private EditText edtName, edtBirthdate, edtNeighborhood;
    private CheckBox chkHeartProblem;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_senior, container, false);

        edtName = view.findViewById(R.id.edtName);
        edtBirthdate = view.findViewById(R.id.edtBirthdate);
        edtNeighborhood = view.findViewById(R.id.edtNeighborhood);
        chkHeartProblem = view.findViewById(R.id.chkHeartProblem);

        Button btnRegister = view.findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(v -> {
            String name = edtName.getText().toString();
            String birthdate = edtBirthdate.getText().toString();
            String neighborhood = edtNeighborhood.getText().toString();
            boolean hasHeartProblem = chkHeartProblem.isChecked();

            AtletaSenior atleta = new AtletaSenior(name, birthdate, neighborhood, hasHeartProblem);
            Toast.makeText(view.getContext(), atleta.toString(), Toast.LENGTH_LONG).show();
        });

        return view;
    }
}
