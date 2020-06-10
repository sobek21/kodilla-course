package com.kodilla.spring.portfolio;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testAdd() {

        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("This is ToDoList");
        board.getInProgressList().getTasks().add("This is InProgressList");
        board.getDoneList().getTasks().add("This is Done List");

        String toDoListResult = board.getToDoList().getTasks().get(0);
        String inProgressListResult = board.getInProgressList().getTasks().get(0);
        String doneListResult = board.getDoneList().getTasks().get(0);

        //Then
        assertThat(toDoListResult).isEqualTo("This is ToDoList");
        assertThat(inProgressListResult).isEqualTo("This is InProgressList");
        assertThat(doneListResult).isEqualTo("This is Done List");
    }
}