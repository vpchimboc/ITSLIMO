package tecnologico.limon.itslimon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SoftwareActivity extends AppCompatActivity {
    TextView titulo_objetivo, text_objetivo, titulo_descripcion, texto_descripcion, tituloDuracion, tituloSemestres, tiempoAnios, semestre, tiempo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_software);
        titulo_objetivo= findViewById(R.id.titulo_objetivo);
        text_objetivo=findViewById(R.id.texto_objetivo);
        titulo_objetivo.setText(R.string.title_objetivo);
        text_objetivo.setText(R.string.objetivoDesarrollo);
        titulo_descripcion=findViewById(R.id.titulo_descripcion);
        texto_descripcion=findViewById(R.id.texto_descripcion);
        titulo_descripcion.setText(R.string.title_descripcion);
        texto_descripcion.setText(R.string.descrpcionDesarrollo);
        tituloDuracion=findViewById(R.id.tituloDuracion);
        tituloSemestres=findViewById(R.id.tituloSemestre);
        tiempoAnios=findViewById(R.id.tiempoAnios);
        semestre=findViewById(R.id.semestre);
        tiempo=findViewById(R.id.tiempo);

        tituloDuracion.setText(R.string.title_duracion);
        tituloSemestres.setText(R.string.title_semestre);
        tiempoAnios.setText(R.string.title_anios);
        semestre.setText(R.string.semestre);
        tiempo.setText(R.string.anios);




    }
}