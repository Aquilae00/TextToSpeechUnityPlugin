package com.example.ttsunityplugin;
import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.util.Log;

import com.unity3d.player.UnityPlayer;

import java.util.Locale;

public class TTSPlugin {

    private static TextToSpeech tts;
    private static Context context;
    private static String message;

    public static void setContext(Context c) {
        context = c;
    }
    public static void sayMessage(String msg){
        message = msg;
        tts = new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                Log.d("TTSLOG","onInit");
                if(status == TextToSpeech.SUCCESS){
                    tts.setLanguage(Locale.US);
                    tts.stop();
                    tts.speak(message,TextToSpeech.QUEUE_FLUSH,null);
                }
            }
        });
        Log.d("TTSLOG","Message sent");
    }
}
