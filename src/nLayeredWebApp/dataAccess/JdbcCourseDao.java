package nLayeredWebApp.dataAccess;

import java.util.ArrayList;
import java.util.List;
import nLayeredWebApp.entities.Course;

public class JdbcCourseDao implements CourseDao {
	private List<Course> courses = new ArrayList<>();
	@Override
	public void add(Course course) {
		courses.add(course);
		System.out.println("Added to database with Jdbc.");
	}

	@Override
	public List<Course> getAllCourse() {
		return courses;
	}
}
