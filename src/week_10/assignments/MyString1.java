package week_10.assignments;

public class MyString1 {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public MyString1() {
    }

    public MyString1(String str) {
        this.str = str;
    }

    public MyString1(char[] chars) {
        this.str = "";
        for (int i = 0; i < chars.length; i++) {
            this.str += chars[i];
        }
    }

    public char charAt(int index) {
        return this.str.charAt(index);
    }

    public int length() {
        return this.str.length();
    }
    public MyString1 substring(int begin,int end){
        char[] chars = new char[end-begin];
        int count=0;
        for (int i = begin; i < end; i++) {
            chars[count]= str.charAt(i);
            count++;
        }

        MyString1 myString1 = new MyString1(chars);
        return myString1;
    }
    public MyString1 toLowerCase() {
        char[] chars = new char[this.str.length()];
        for (int j = 0; j < chars.length; j++) {
            chars[j] = Character.toLowerCase(this.str.charAt(j));
        }
        MyString1 myString1 = new MyString1(chars);
        return myString1;
    }

    public boolean equals(MyString1 s) {
        if (str.equals(s)) {
            return true;
        } else {
            return false;
        }
    }

    public static MyString1 valueOf(int i) {
        String valueOf = Integer.toString(i);
        char[] chars = new char[valueOf.length()];
        for (int j = 0; j < chars.length; j++) {
            chars[j] = valueOf.charAt(j);
        }
        MyString1 myString1 = new MyString1(chars);
        return myString1;

    }

    public String toString() {
        return str;
    }

}
