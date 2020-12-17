package com.example.provaexame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView CãoRecy;

    private List<Cachorro> listacao = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CãoRecy = findViewById(R.id.ViewR);
        criar();

        Adapter adaptador = new Adapter(this.listacao);


        //configurar layout

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        CãoRecy.setLayoutManager(layoutManager);
        CãoRecy.setHasFixedSize(true);
        CãoRecy.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        CãoRecy.setAdapter(adaptador);
    }

    public void criar() {
        Cachorro Caozinho = new Cachorro("Homem Aranha - De volta ao lar", "Ação", "2019");
        this.listacao.add(Caozinho);

        Caozinho = new Cachorro("titulo", "2018", "genero");
        this.listacao.add(Caozinho);

        Caozinho = new Cachorro("titulo", "2019", "genero");
        this.listacao.add(Caozinho);

        Caozinho = new Cachorro("titulo", "2015", "genero");
        this.listacao.add(Caozinho);
    }


   
}