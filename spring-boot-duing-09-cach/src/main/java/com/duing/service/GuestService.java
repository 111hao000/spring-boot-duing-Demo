package com.duing.service;

import com.duing.model.Guest;

import java.util.List;

public interface GuestService {

    List<Guest> getGuests();
    Guest getGuestById(int id);
    Guest updateGuest(Guest guest);
    void deleteGuest(int id);
}
