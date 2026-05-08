package com.plurasight;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @org.junit.jupiter.api.Test
    void checkIn() {
        Room room = new Room(5,150);
        room.checkIn();
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @org.junit.jupiter.api.Test
    void checkOut() {
        Room room = new Room(2,260);
        room.cleanRoom();
        assertFalse(room.isDirty());
        assertTrue(room.isAvailable());
    }

    @org.junit.jupiter.api.Test
    void cleanRoom() {
        Room room = new Room(1,120);
        room.cleanRoom();
        assertFalse(room.isDirty());
    }
}