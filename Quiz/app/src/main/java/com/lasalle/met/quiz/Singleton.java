package com.lasalle.met.quiz;

/**
 * Created by FurruPi on 13/12/17.
 */
import java.util.ArrayList;

/**
 * Created by Manel on 13/12/17.
 */
public class Singleton {
    private static Singleton mInstance = null;
    private int numAciertos;
    private int numFallos;
    private ArrayList<String> questions = new ArrayList<String>();
    private ArrayList<String> correctAnswers = new ArrayList<String>();

    private Singleton(){}

    public static  Singleton getInstace(){
        if(mInstance == null){
            mInstance = new Singleton();
        }
        return mInstance;
    }

    public void clearNums(){
        this.numAciertos = 0;
        this.numFallos = 0;
    }

    public int getNumAciertos(){
        return this.numAciertos;
    }

    public int getNumFallos(){
        return this.numFallos;
    }

    public void incAciertos(){
        this.numAciertos++;
    }

    public void incFallos(){
        this.numFallos++;
    }

    public String getQuestion(int i){
        return this.questions.get(i);
    }

    public int sizeQuestions(){
        return this.questions.size();
    }
}
