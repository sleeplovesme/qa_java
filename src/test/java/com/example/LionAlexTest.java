package com.example;

import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.*;

public class LionAlexTest {

    @Mock
    Feline feline;

    @Test
    public void getFriendsReturnsListOfFriends() throws Exception {
        LionAlex alex = new LionAlex(feline);
        List<String> actual = alex.getFriends();
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        assertEquals(expected, actual);
    }

    @Test
    public void getPlaceOfLivingReturnsNewYorkZoo() throws Exception {
        LionAlex alex = new LionAlex(feline);
        String actual = alex.getPlaceOfLiving();
        String expected = "Нью-Йоркский зоопарк";
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensReturnsZeroKittens() throws Exception {
        LionAlex alex = new LionAlex(feline);
        int actual = alex.getKittens();
        int expected = 0;
        assertEquals(expected, actual);
    }
}