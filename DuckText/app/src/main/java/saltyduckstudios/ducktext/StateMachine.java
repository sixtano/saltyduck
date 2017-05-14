package saltyduckstudios.ducktext;

import java.util.ArrayList;

/**
 * Psuedo Generic statemachine for switching between game states.
 *
 * Created by Tom on 14/05/2017.
 */

public class StateMachine {

    private State currentState;
    private State previousState;
    private State nextState;

    private ArrayList<StateMachineListener> listeners;

    /**
     * Create a State Machine
     */
    StateMachine() {
        listeners = new ArrayList<>();
        currentState = State.Initial;
        previousState = null;
        nextState = null;
    }

    /**
     * Advance State.
     */
    public void proceedToNextState() {
        previousState = currentState;
        setState(nextState);

    }

    public void proceedToPreviousState() {
            previousState = currentState;
            setState(previousState);
    }

    public void setNextState(State state) {
        nextState = state;
    }

    public void setPreviousState(State state) {
        previousState = state;
    }

    private void setState(State aState) {
        currentState = aState;
        for (StateMachineListener listener : listeners) {
            listener.onStateChanged(currentState);
        }
    }

    /**
     * Add a listener
     * @param listener
     * @return True if listener added successfully.
     */
    public boolean addListener(StateMachineListener listener) {
        return listeners.add(listener);
    }
}
