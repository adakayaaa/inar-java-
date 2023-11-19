package week_11.assignments;

import java.util.ArrayList;

public class MyStack extends ArrayList {
    MyStack(){

    }

    public boolean isEmpty(){
        if(size()==0){
            return true;
        }
        return false;
    }
    public Object peek(){
        return get(super.size()-1);
    }
    public Object pop(){
        Object o= get(super.size()-1);
        remove(super.size()-1);
        return o;
    }
    public void push(Object o){
        add(o);
    }
    public String toString(){
        return "stack: " + super.toString();
    }



}
