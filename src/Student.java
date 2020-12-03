public class Student {
  int rating = 0;
  private String name;

  static int count = 0;

  static int sumRating = 0;

  // TODO implement Student class according to the instructions provided in the README.md file

  public Student() {
      count++;
  }

  public Student(String name) {
   this.name = name;
   count++;
  }

  public static double getAvgRating() {
    if (count == 0)
      return 0;
    return Double.valueOf(sumRating)/count;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
    sumRating += rating;
  }

  public boolean betterStudent(Student student) {
    if (this.rating > getAvgRating()){
      return true;
    }
    return false;
  }

  public void changeRating(int rating) {
    sumRating -= this.rating;
    this.rating = rating;
    sumRating += this.rating;

  }

  public static void removeStudent(Student student) {
    sumRating -= student.rating;
    count--;
    student = null;
  }

  @Override
  public String toString() {
    // TODO return String with name and rating of this student
    return this.name + " has rating " + String.format("%d", this.rating);
  }
}
