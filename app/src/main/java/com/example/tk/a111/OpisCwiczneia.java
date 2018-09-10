package com.example.tk.a111;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;

public class OpisCwiczneia extends AppCompatActivity {


    String message;
    public final static  String MESSAGE_DATA = "com.example.tk.a111";

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opis_cwiczneia);


         Intent intent = getIntent();
         message = intent.getStringExtra(MESSAGE_DATA);

        TextView textView2 = (TextView)findViewById(R.id.textView2);

     //   setContentView(textView2);

    //    TextView textView = new TextView(this);


        if(Objects.equals(message, "Unoszenie sztangi łamanej szerokim podchwytem wzdłuż tułowia")){
            message = "Stań prosto. Złap sztangę podchwytem, rozstawiając dłonie nieco szerzej niż na szerokość barków. Sztanga powinna swobodnie spoczywać w Twoich dłoniach na wysokości bioder. W pierwszej fazie ruchu unieś ciężar wzdłuż tułowia do wysokości klatki piersiowej, zginając i prowadząc łokcie za sobą. Przy tym ćwiczeniu pracują stawy: łokciowy i barkowy. W drugiej fazie ruchu opuść ciężar, cały czas kontrolując jego ruch. To pozwoli na przedłużenie napięcia mięśni dwugłowych.";
            textView2.setText(message);
            System.out.println(message);
        }
        if(Objects.equals(message, "Uginanie przedramion na drążku wyciągu dolnego podchwytem pojedynczym")){
            message = "Ustaw dwie rolki wyciągu w najniższym położeniu i przymocuj linki wyciągu do dwóch końców drążka prostego. To tyle, jeśli chodzi o sprzęt. Ty masz za zadanie stanąć prosto w lekkim rozkroku, złapać drążek podchwytem na szerokości barków i systematycznie unosić go, zginając łokcie, do wysokości barków właśnie. I klasyka: łokcie blisko ciała, staw barkowy się nie rusza.";
            textView2.setText(message);
        }
        if(Objects.equals(message, "Uginanie przedramion na wyciągu dolnym podchwytem podwójnym")){
            message = "Ustaw dwie rolki wyciągu w najniższym położeniu i do każdej z nich załóż pojedynczy uchwyt. Złap uchwyty w obie ręce na wysokości bioder, po czym podciągnij je do wysokości barków. Ważne, byś starał się blokować nadgarstki – znów główną robotę wykonuje biceps pospołu ze stawem łokciowym. W takim ustawieniu wyciągu naturalne będzie lekkie odchylenie przedramion do zewnątrz. ";
            textView2.setText(message);
        }
        if(Objects.equals(message, "Uginanie przedramion z hantlami na ławce skośnej")){
            message = "Leżąc na ławce ze skosem dodatnim, oprzyj stopy o podłoże. Hantle złap podchwytem, rozstawiając ręce na szerokość barków. Twoje ramiona powinny być ustawione prostopadle do podłoża. Podnieś hantle na wysokość klatki piersiowej, po czym opuść je do pełnego wyprostowania przedramion. To pełne powtórzenie.";
            textView2.setText(message);

        }

        if(Objects.equals(message, "Wyciskanie francuskie sztangi wąskim chwytem leżąc")){
            message = "Połóż się ze sztangą na ławce. Chwyć gryf wąsko. Ugnij przedramiona w stawie łokciowym i zacznij opuszczać ciężar do czoła. Wróć do pozycji wyjściowej akcentując końcową fazę ruchu dopięciem tricepsów.";
            textView2.setText(message);
        }
        if(Objects.equals(message, "Wyciskanie francuskie sztangi szerokim chwytem leżąc głową w dół")){
            message ="Połóż się ze sztangą na ławce skośnej głową w dół. Chwyć gryf nachwytem szerzej niż na szerokość barków. Ugnij przedramiona w stawie łokciowym i zacznij opuszczać ciężar do czoła. Zatrzymaj ruch i wróć do pozycji wyjściowej akcentując końcową fazę ruchu dopięciem tricepsów. ";
            textView2.setText(message);
        }
        if(Objects.equals(message, "Wyciskanie francuskie hantla zza głowy jednorącz stojąc")){
            message ="Rękę z hantla wyprostuj nad głową. Ugnij przedramię i zacznij opuszczać ciężar za głowę. Zatrzymaj ruch w momencie, gdy hantla będzie równolegle do podłogi. Wróć dynamicznie do pozycji wyjściowej. ";
            textView2.setText(message);

        }
        if(Objects.equals(message, "Prostowanie przedramion z linkami wyciągu dolnego stojąc")){
            message ="Kucnij tyłem do wyciągu i chwyć linki. Trzymaj je mniej więcej na wysokości kości potylicznej czaszki. Wstań z linkami trzymanymi z tyłu. Wyprostuj dynamicznie przedramiona, a następnie powoli wróć do pozycji wyjściowej. ";
            textView2.setText(message);
        }




    }

    public void NowyOnclilyoutube(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/results?search_query="+message)));
    }
}
