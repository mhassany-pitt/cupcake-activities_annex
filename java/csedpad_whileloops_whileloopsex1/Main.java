class WhileLoopsEx1 {
  public static void main(String[] args) {

    int sum = 0, i = 1;

    while (i <= 1000) {
      sum += i;
      i++;
    }

    System.out.println("Sum = " + sum);
  }
}