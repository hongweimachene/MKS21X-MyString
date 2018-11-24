public class MyString implements CharSequence {
  private char[] data;

  //constructor takes CharSequence and puts it in a char array
  public MyString(CharSequence s) {
    char[] data = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      char[i] = s.charAt(i);
    }
  }

  //
  public char charAt(int index) {
    if (index > data.length) {
      throw new IndexOutOfBoundsException;
    }
    return data[index];
  }

  public int length() {
    return data.length;
  }

  //returns a string as a CharSequence by adding from start up to but not including end
  public CharSequence subSequence(int start, int end) {
    String s = "";
    for (int i = start; i < end; i++) {
      s+=data[i];
    }
  }


}
