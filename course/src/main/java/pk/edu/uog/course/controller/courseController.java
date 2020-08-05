package pk.edu.uog.course.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pk.edu.uog.course.model.Course;
import pk.edu.uog.course.repository.courseRepository;

@RestController
@CrossOrigin
@RequestMapping("/course")
public class courseController {
	
	@Autowired
	private courseRepository courserepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<Course> get() {
		List<Course> courses = new ArrayList<Course>();
		courses = courserepository.findActive();
		return courses;
		
//		String line;
//		try {
//			BufferedReader bufferreader = new BufferedReader(new FileReader(Course.csvFile));
//			
//			while ((line = bufferreader.readLine()) != null) {
//				Course course = new Course();
//				Course prerequistcourse = new Course();
//				
//				String[] courseRow = line.split(",");
//				
//				course.setCOURSE_ID(Integer.parseInt(courseRow[0]));
//				course.setCOURSE_CODE(courseRow[1]);
//				course.setCOURSE_TITLE(courseRow[2]);
//				course.setCOURSE_DESC(courseRow[3]);
//				course.setCOURSE_CREDITHOUR(Integer.parseInt(courseRow[4]));
//				
//				if (courseRow[5].compareTo("null") != 0) {
//					prerequistcourse = getOne(Long.parseLong(courseRow[5]));
//					course.setCOURSEPRERQUIST_ID(prerequistcourse);
//				}
//				
//				courses.add(course);
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Course getOne(@PathVariable Long id) {
		Course course = new Course();
		course = courserepository.findOne(id);
		return course;
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Course> getAll() {
		List<Course> courses = new ArrayList<Course>();
		courses = courserepository.findAll();
		return courses;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Course insert(@RequestBody Course course) {
		course.setISACTIVE("Y");
		course = courserepository.saveAndFlush(course);
		return course;
	}

	@RequestMapping(method = RequestMethod.PUT)
	public Course update(@RequestBody Course course) {
		course = courserepository.saveAndFlush(course);
		return course;
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public Course delete(@RequestBody Course course) {
		courserepository.delete(course);
		return course;
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public List<Course> getSearch(@RequestBody String search) {
		List<Course> courses = new ArrayList<Course>();
		courses = courserepository.findBySearch("%"+search+"%");
		return courses;
	}

//	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//	public Course update(@PathVariable Long id, @RequestBody Course course) {
//		course = courserepository.findOne(id);
//		course = courserepository.saveAndFlush(course);
//		return course;
//	}
	
//	@RequestMapping(method = RequestMethod.POST)
//	public Course insert(@RequestBody Course course) {
//		FileWriter filewriter;
//
//		List<Course> courses = get();
//
//		try {
//			filewriter = new FileWriter("Courses.csv");
//
//			for (int i=0; i<courses.size(); i++) {
//				filewriter.append(courses.get(i).toString());
//				filewriter.append("\n");
//			}
//			if (courses.size()>0)
//				course.setCOURSE_ID(courses.get(courses.size()-1).getCOURSE_ID()+1);
//			else
//				course.setCOURSE_ID(1);
//			filewriter.append(course.toString());
//			filewriter.append("\n");
//			filewriter.flush();
//			filewriter.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		return course;
//	}
//
//	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//	public Course update(@PathVariable Long id, @RequestBody Course course) {
//		FileWriter filewriter;
//
//		List<Course> courses = get();
//
//		try {
//			filewriter = new FileWriter("Courses.csv");
//
//			for (int i=0; i<courses.size(); i++) {
//				if (courses.get(i).getCOURSE_ID() == id) {
//					filewriter.append(course.toString());
//				} else {
//					filewriter.append(courses.get(i).toString());
//				}
//				filewriter.append("\n");
//			}
//
//			filewriter.flush();
//			filewriter.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		return course;
//	}
}
