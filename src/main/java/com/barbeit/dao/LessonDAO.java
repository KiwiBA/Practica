package com.barbeit.dao;

import java.util.List;
import com.barbeit.domain.Lesson;

public interface LessonDAO {
	
	public void saveLesson(Lesson lesson);

	public List<Lesson> listLesson();

}
