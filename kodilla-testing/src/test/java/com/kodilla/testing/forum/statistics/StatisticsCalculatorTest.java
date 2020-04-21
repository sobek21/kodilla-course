package com.kodilla.testing.forum.statistics;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTest {

    @Test
    public void calculateAdvStatistics1() {
        //gdy liczba postów = 0
//given
       Statistics statistics = mock(Statistics.class);
       ArrayList<String> mack = new ArrayList<String>();
       mack.add("Marek");

       StatisticsCalculator mock = new StatisticsCalculator(statistics);
       when(statistics.postsCount()).thenReturn(0);
       when(statistics.commentsCount()).thenReturn(10);
       when(statistics.usersNames()).thenReturn(mack);
        mock.calculateAdvStatistics(statistics);
//when then
        Assert.assertEquals(0,mock.averagePostUsers,0.1);
        Assert.assertEquals(10,mock.averageCommentsUsers,0);
        Assert.assertEquals(0,mock.averageCommentsPost,1);

    }
@Test
    public void calculateAdvStatistics2() {
        //gdy liczba postów = 1000,
//given
        Statistics statistics = mock(Statistics.class);
        ArrayList<String> mack = new ArrayList<String>();
        mack.add("Marek");

        StatisticsCalculator mock = new StatisticsCalculator(statistics);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(mack);
        mock.calculateAdvStatistics(statistics);
//when then
        Assert.assertEquals(1000,mock.averagePostUsers,0.1);
        Assert.assertEquals(100,mock.averageCommentsUsers,1);
        Assert.assertEquals(0.1,mock.averageCommentsPost,0.5);
    }
    @Test
    public void calculateAdvStatistics3() {
        //gdy liczba komentarzy = 0
//given
        Statistics statistics = mock(Statistics.class);
        ArrayList<String> mack = new ArrayList<String>();
        mack.add("Marek");

        StatisticsCalculator mock = new StatisticsCalculator(statistics);
        when(statistics.postsCount()).thenReturn(15);
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(mack);
        mock.calculateAdvStatistics(statistics);
//when then
        Assert.assertEquals(15,mock.averagePostUsers,0.1);
        Assert.assertEquals(0,mock.averageCommentsUsers,0);
        Assert.assertEquals(0,mock.averageCommentsPost,1);

    }
    @Test
    public void calculateAdvStatistics4() {
        //gdy liczba komentarzy < liczba postów,
//given
        Statistics statistics = mock(Statistics.class);
        ArrayList<String> mack = new ArrayList<String>();
        mack.add("Marek");

        StatisticsCalculator mock = new StatisticsCalculator(statistics);
        when(statistics.postsCount()).thenReturn(10);
        when(statistics.commentsCount()).thenReturn(5);
        when(statistics.usersNames()).thenReturn(mack);
        mock.calculateAdvStatistics(statistics);
//when then
        Assert.assertEquals(10,mock.averagePostUsers,0.1);
        Assert.assertEquals(5,mock.averageCommentsUsers,0);
        Assert.assertEquals(0.1,mock.averageCommentsPost,1);

    }
    @Test
    public void calculateAdvStatistics5() {
        //gdy liczba komentarzy > liczba postów
//given
        Statistics statistics = mock(Statistics.class);
        ArrayList<String> mack = new ArrayList<String>();
        mack.add("Marek");

        StatisticsCalculator mock = new StatisticsCalculator(statistics);
        when(statistics.postsCount()).thenReturn(5);
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.usersNames()).thenReturn(mack);
        mock.calculateAdvStatistics(statistics);
//when then
        Assert.assertEquals(5,mock.averagePostUsers,0.1);
        Assert.assertEquals(10,mock.averageCommentsUsers,0);
        Assert.assertEquals(2,mock.averageCommentsPost,1);

    }
    @Test
    public void calculateAdvStatistics6() {
        //gdy liczba użytkowników = 0,
//given
        Statistics statistics = mock(Statistics.class);
        ArrayList<String> mack = new ArrayList<String>();


        StatisticsCalculator mock = new StatisticsCalculator(statistics);
        when(statistics.postsCount()).thenReturn(10);
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.usersNames()).thenReturn(mack);
        mock.calculateAdvStatistics(statistics);
//when then
        Assert.assertEquals(0,mock.averagePostUsers,0.1);
        Assert.assertEquals(0,mock.averageCommentsUsers,0);
        Assert.assertEquals(1,mock.averageCommentsPost,1);

    }
    @Test
    public void calculateAdvStatistics7() {
        //gdy liczba użytkowników = 100
//given
        Statistics statistics = mock(Statistics.class);
        ArrayList<String> mack = new ArrayList<String>();
        int i =0;
        while(i<100){
            mack.add("Marek");
            i++;

        }
        StatisticsCalculator mock = new StatisticsCalculator(statistics);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.usersNames()).thenReturn(mack);
        mock.calculateAdvStatistics(statistics);
//when then
        Assert.assertEquals(10,mock.averagePostUsers,0.80);
        Assert.assertEquals(0.10,mock.averageCommentsUsers,0.80);
        Assert.assertEquals(0,mock.averageCommentsPost,1);
    }
}
