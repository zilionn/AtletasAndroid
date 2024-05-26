package com.zilion.atletasandroid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

public class FragmentOutro extends Fragment {

    private EditText edtName, edtBirthdate, edtNeighborhood, edtAcademy, edtRecord;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_outro, container, false);

        edtName = view.findViewById(R.id.edtName);
        edtBirthdate = view.findViewById(R.id.edtBirthdate);
        edtNeighborhood = view.findViewById(R.id.edtNeighborhood);
        edtAcademy = view.findViewById(R.id.edtAcademy);
        edtRecord = view.findViewById(R.id.edtRecord);

        Button btnRegister = view.findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(v -> {
            String name = edtName.getText().toString();
            String birthdate = edtBirthdate.getText().toString();
            String neighborhood = edtNeighborhood.getText().toString();
            String academy = edtAcademy.getText().toString();
            String record = edtRecord.getText().toString();

            OutroAtleta atleta = new OutroAtleta(name, birthdate, neighborhood, academy, record);
            Toast.makeText(view.getContext(), atleta.toString(), Toast.LENGTH_LONG).show();
        });

        return view;
    }
}
