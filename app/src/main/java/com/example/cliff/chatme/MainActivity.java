package com.example.cliff.chatme;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import ai.api.AIListener;
import ai.api.android.AIConfiguration;
import ai.api.android.AIService;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private Button listenButton;
    private TextView resultTextView;
    private AIService aiService;


    public void listenButtonOnClick(final View view) {
        aiService.startListening();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        listenButton = (Button) findViewById(R.id.listenButton);
//        resultTextView = (TextView) findViewById(R.id.resultTextView);
//
//        final AIConfiguration config = new AIConfiguration("CLIENT_ACCESS_TOKEN",
//                AIConfiguration.SupportedLanguages.English,
//                AIConfiguration.RecognitionEngine.System);
//
//        aiService = AIService.getService(this, config);
//        aiService.setListener(this);
    }
//
//    @Override
//    public void onResult(ai.api.model.AIResponse result) {
//
//    }
//
//    @Override
//    public void onError(ai.api.model.AIError error) {
//
//    }
//
//    @Override
//    public void onAudioLevel(float level) {
//
//    }
//
//    @Override
//    public void onListeningStarted() {
//
//    }
//
//    @Override
//    public void onListeningCanceled() {
//
//    }
//
//    @Override
//    public void onListeningFinished() {
//
//    }

//    public void onResult(final AIResponse response) {
//        Result result = response.getResult();
//
//        // Get parameters
//        String parameterString = "";
//        if (result.getParameters() != null && !result.getParameters().isEmpty()) {
//            for (final Map.Entry<String, JsonElement> entry : result.getParameters().entrySet()) {
//                parameterString += "(" + entry.getKey() + ", " + entry.getValue() + ") ";
//            }
//        }
//
//        // Show results in TextView.
//        resultTextView.setText("Query:" + result.getResolvedQuery() +
//                "\nAction: " + result.get   Action() +
//                "\nParameters: " + parameterString);
//    }
//
//    @Override
//    public void onError(final AIError error) {
//        resultTextView.setText(error.toString());
//    }
//
//
//    private class AIResponse {
//    }
}
