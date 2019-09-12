package com.vladimirvlasoff.notes;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NoteActivity extends AppCompatActivity {

    private EditText editTextNote;
    private Button buttonSave;

    private String filename = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        editTextNote = findViewById(R.id.editTextNote);
        buttonSave = findViewById(R.id.buttonAddNote);

    }

    public void onClickSave(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Введите название:");
        builder.setMessage("Введите название заметки");
        final EditText finalNote = new EditText(this);
        builder.setView(finalNote);
        builder.setPositiveButton("Сохранить", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String value = finalNote.getText().toString();
                filename = value;
                NoteData noteData = new NoteData(filename,editTextNote.getText().toString());
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        builder.setNegativeButton("Отменить", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(NoteActivity.this, "Успешно отменено", Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }
}
