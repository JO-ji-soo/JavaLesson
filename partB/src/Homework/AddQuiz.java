package Homework;

public class AddQuiz {
    private int data1;
    private int data2;
    private int userAnswer;
    
    public AddQuiz(int data1, int data2, int userAnswer){
        this.data1 = data1;
        this.data2 = data2;
        this.userAnswer = 0;
    }

    public boolean isRight(){
        return this.userAnswer == (this.data1+this.data2);
    }
    public int getData1(){
        return data1;
    }

    public int getData2(){
        return data2;
    }

    public int userAnswer(){
        return userAnswer;
    }

    public int getRightAnswer(){
        return data1 + data2;
    }

    public int getUserAnswer() {
        return 0;
    }




    
}