package saltyduckstudios.ducktext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements StateMachineListener {

    private StateMachine textStateMachine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textStateMachine = new StateMachine();
        textStateMachine.addListener(this);
    }


    @Override
    public void onStateChanged(State currentState) {

    }

    private State determineNextState() {
        State nextState;
        return nextState;
    }
}
