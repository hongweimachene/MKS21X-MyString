public class MyString implements CharSequence, Comparable<CharSequence> {
  private char[] data;

  //constructor takes CharSequence and puts it in a char array
  public MyString(CharSequence s) {
    data = new char[s.length()];
    for (int i = 0; i < data.length; i++) {
      data[i] = s.charAt(i);
    }
  }

  public char charAt(int index) {
    //if index isnt valid throw an exception
    if (index >= data.length) {
      throw new IndexOutOfBoundsException();
    }
    return data[index];
  }

  public int length() {
    return data.length;
  }

  public CharSequence subSequence(int start, int end) {
    //if start or end isnt valid throw an exception
    if (start >= data.length || end > data.length || start < 0 || end < 0) {
      throw new IndexOutOfBoundsException();
    }
    //makes a string and adds values of data from index start up to but not including end
    String s = "";
    for (int i = start; i < end; i++) {
      s+=data[i];
    }
    return s;
  }

  public String toString(){
    String s= "";
    for (int i = 0; i < data.length; i++) {
      s+=data[i];
    }
    return s;
  }

  public int compareTo(CharSequence o) {
    if (o == null) {
      throw new NullPointerException();
    }
    if (length() < o.length()) {
      return -1;
    }
    if (length() > o.length()) {
      return 1;
    }
    for (int i = 0; i < length(); i++) {
      if (charAt(i) < o.charAt(i)) {
        return -1;
      }
      if (charAt(i) > o.charAt(i)) {
        return 1;
      }
    }
    return 0;
  }

  /*public static void main(String[] args) {
    MyString z = new MyString("abc");
    MyString y = new MyString("hllelo");
    MyString x = new MyString("yaayeet");
    MyString a = new MyString("zaayeet");
    System.out.println(z.length() +  " length ");
    System.out.println(x.length() + " length ");
    System.out.println(y.length() + " length");
    System.out.println(x);
    System.out.println(z.charAt(0));
    System.out.println(y.charAt(4));
    System.out.println(x.charAt(3));
    System.out.println(x.subSequence(0,4));
    System.out.println(z.compareTo(x));
    System.out.println(x.compareTo(a));
    System.out.println(a.compareTo(x));
  }*/
}
