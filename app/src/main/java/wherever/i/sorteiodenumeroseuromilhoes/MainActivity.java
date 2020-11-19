package wherever.i.sorteiodenumeroseuromilhoes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int x,c,y,z,a,e,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void sortearmultiplosNumeros(View view){

        // PRIMEIRO NUMERO
        TextView texto= findViewById(R.id.textRESULTADO);
        int c = new Random().nextInt(51);
        texto.setText("Número: "+ c);

        // SE REPETIDO ESCOLHE OUTRO
        if(c==x){
            new Random().nextInt(51);
            texto.setText("Número: "+ c);
        }
        if(c==y){
            new Random().nextInt(51);
            texto.setText("Número: "+ c);
        }
        if(c==z){
            new Random().nextInt(51);
            texto.setText("Número: "+ c);
        }
        if(c==a){
            new Random().nextInt(51);
            texto.setText("Número: "+ c);
        }

        // SEGUNDO NUMERO
        TextView texto1 = findViewById(R.id.textView2);
        int x = new Random().nextInt(51);
        texto1.setText("Número: "+ x);

        // SE REPETIDO ESCOLHE OUTRO
        if(x==y){
            new Random().nextInt(51);
            texto1.setText("Número: "+ x);
        }
        if(x==z){
            new Random().nextInt(13);
            texto1.setText("Número: "+ x);
        }
        if(x==a){
            new Random().nextInt(13);
            texto1.setText("Número: "+ x);
        }

        // TERCEIRO NUMERO
        TextView texto2 = findViewById(R.id.textView3);
        int y = new Random().nextInt(51);
        texto2.setText("Número: "+ y);

        // SE REPETIDO ESCOLHE OUTRO
        if(y==z){
            new Random().nextInt(51);
            texto2.setText("Número: "+ y);
        }
        if(x==a){
            new Random().nextInt(51);
            texto2.setText("Número: "+ y);
        }

        // QUARTO NUMERO
        TextView texto3 = findViewById(R.id.textView4);
        int z = new Random().nextInt(51);
        texto3.setText("Número: "+ z);

        //SE REPETIDO ESCOLHE OUTRO
        if(x==a){
            new Random().nextInt(51);
            texto3.setText("Número: "+ z);
        }

        // QUINTO NUMERO
        TextView texto4 = findViewById(R.id.textView5);
        int a = new Random().nextInt(51);
        texto4.setText("Número: "+ a);


    };

   public void sortearEstrelas(View view){

       // PRIMEIRA ESTRELA
       TextView estrela1 = findViewById(R.id.textView6);
       int d = new Random().nextInt(13);
       estrela1.setText("Estrela: "+ d);

       // SE 0 OU REPETIDO OCORRER
       if(d==0){
           new Random().nextInt(13);
           estrela1.setText("Estrela: "+ d);
       }
       if (d==e){
           new Random().nextInt(13);
           estrela1.setText("Estrela: "+ d);
       }

       // SEGUNDA ESTRELA
       TextView estrela2 = findViewById(R.id.textView7);
       int e = new Random().nextInt(13);
       estrela2.setText("Estrela :" + e);

       // SE O REPETE
       if(e==0){
           new Random().nextInt(13);
           estrela2.setText("Estrela :" + e);
       }
   }

}