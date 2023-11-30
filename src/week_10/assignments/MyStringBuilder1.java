package week_10.assignments;

public class MyStringBuilder1 {
    StringBuilder str;

    public StringBuilder getStr() {
        return this.str;
    }

    public MyStringBuilder1() {

    }

    public MyStringBuilder1(String s) {
        this.str = new StringBuilder(s);
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        this.str = str.append(s.getStr());
        MyStringBuilder1 myStringBuilder1 = new MyStringBuilder1(str.toString());
        return myStringBuilder1;

    }

    public MyStringBuilder1 append(int i) {
        this.str = str.append(i);
        MyStringBuilder1 myStringBuilder1 = new MyStringBuilder1(str.toString());
        return myStringBuilder1;
    }

    public int length() {
        return this.str.length();
    }

    public char charAt(int index) {

        return this.str.charAt(index);
    }
    public MyStringBuilder1 toLowerCase(){
      String s= getStr().toString().toLowerCase();
      MyStringBuilder1 myStringBuilder1= new MyStringBuilder1(s);
      return myStringBuilder1;
    }
    public MyStringBuilder1 substring(int begin, int end){
        String s= getStr().toString().substring(begin,end);
        MyStringBuilder1 myStringBuilder1= new MyStringBuilder1(s);
        return myStringBuilder1;
    }

    public String toString() {
        return this.str.toString();
    }
}

