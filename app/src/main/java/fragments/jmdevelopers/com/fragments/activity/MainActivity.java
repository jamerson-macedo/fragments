package fragments.jmdevelopers.com.fragments.activity;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fragments.jmdevelopers.com.fragments.R;
import fragments.jmdevelopers.com.fragments.fragments.ContatosFragment;

public class MainActivity extends AppCompatActivity {
    private Button conversas;
    private Button contatos;
    private ContatosFragment contatosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contatos=findViewById(R.id.buttoncontatos);

        // removendo a sombra de cima
        getSupportActionBar().setElevation(0);
        contatosFragment=new ContatosFragment();
        android.support.v4.app.FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        // local onde voce quer usar


        transaction.replace(R.id.frameID, contatosFragment);

        transaction.commit();

        contatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContatosFragment contatosFragment=new ContatosFragment();
                android.support.v4.app.FragmentTransaction transaction1=getSupportFragmentManager().beginTransaction();
                transaction1.replace(R.id.frameID,contatosFragment);
            }
        });
    }
}
