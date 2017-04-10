import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ClassroomTest{
  Classroom classroom;
  Person students;

  @Before 
  public void before() {
    this.classroom = new Classroom();
    this.students = new Person();
  }

  @Test
  public void classroomStartsEmpty() {
    assertEquals(0, this.classroom.studentCount());
  }

  @Test
  public void canAddStudents() {
    this.classroom.addStudent(this.students);
    assertEquals(1, this.classroom.studentCount());
  }

  @Test
  public void cannotAddStudentsWhenClassroomFull() {
    for(int i = 0; i < 15; i++) {
      this.classroom.addStudent(this.students);
    }
    assertEquals(10, this.classroom.studentCount());
  }

  @Test
  public void classroomIsFull() {
    for(int i = 0; i < 10; i++) {
      this.classroom.addStudent(this.students);
    }
    assertEquals(true, this.classroom.isClassroomFull());
  }

  @Test
  public void canEmptyClassroom() {
    this.classroom.addStudent(this.students);
    this.classroom.emptyClassroom();
    assertEquals(0, this.classroom.studentCount());
  }

}
