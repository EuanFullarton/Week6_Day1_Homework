public class Classroom{

  private Person[] students;

  public Classroom() {
    this.students = new Person[10];
  }

  public void addStudent (Person students) {
    if(isClassroomFull()) {
      return;
    }
    int studentCount = studentCount();
    this.students[studentCount] = students;
  }

  public boolean isClassroomFull() {
    return studentCount() == students.length;
  }

  public void emptyClassroom() {
    for(int i = 0; i < students.length; i++) {
      this.students[i] = null;
    }
  }

  public int studentCount() {
    int count = 0;
    for(Person students : this.students) {
      if(students != null){
        count++;
      }
    } 
    return count;
  }

}
