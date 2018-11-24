public class MyString implements CharSequence {
  private char[] data;

  //constructor takes CharSequence and puts it in a char array
  public MyString(CharSequence s) {
    data = new char[s.length()];
    for (int i = 0; i < data.length; i++) {
      data[i] = s.charAt(i);
    }
  }

  //
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

  //returns a string as a CharSequence by adding from start up to but not including end
  public CharSequence subSequence(int start, int end) {
    if (start >= data.length || end > data.length || start < 0 || end < 0) {
      throw new IndexOutOfBoundsException();
    }
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

  public static void main(String[] args) {
    MyString z = new MyString("abc");
    MyString y = new MyString("hllelo");
    MyString x = new MyString("yaayeet");
    System.out.println(z.length() +  " length ");
    System.out.println(x.length() + " length ");
    System.out.println(y.length() + " length");
    System.out.println(x);
    System.out.println(z.charAt(0));
    System.out.println(y.charAt(4));
    System.out.println(x.charAt(3));
    System.out.println(x.subSequence(0,4));
    }
}
