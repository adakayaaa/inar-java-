package week_10.assignments;

public class MyStringBuilder2 {
    StringBuilder str;

    public StringBuilder getStr() {
        return this.str;
    }

    public MyStringBuilder2() {

    }

    public MyStringBuilder2(char[] chars) {
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            s += chars[i];
        }
        StringBuilder stringBuilder = new StringBuilder(s);
        this.str = stringBuilder;
    }
    public MyStringBuilder2(String s) {
        this.str = new StringBuilder(s);
    }

    public MyStringBuilder2 substring(int begin) {
        String s = getStr().toString().substring(begin);
        MyStringBuilder2 myStringBuilder = new MyStringBuilder2(s);
        return myStringBuilder;
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s){
        String result = getStr().insert(offset,s).toString();
        MyStringBuilder2 myStringBuilder = new MyStringBuilder2(result);
        return myStringBuilder;
    }

    public MyStringBuilder2 reverse(){
        String result= getStr().reverse().toString();
        MyStringBuilder2 myStringBuilder = new MyStringBuilder2(result);
        return myStringBuilder;
    }

    public MyStringBuilder2 toUpperCase() {
        String s = getStr().toString().toUpperCase();
        MyStringBuilder2 myStringBuilder = new MyStringBuilder2(s);
        return myStringBuilder;
    }

    public String toString() {
        return this.str.toString();
    }
}

