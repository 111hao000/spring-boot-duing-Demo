package com.duing.controller;

import com.duing.model.Guest;
import com.duing.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

    @GetMapping("")
    public List<Guest> getGuests(Model model) {
        List<Guest> result = guestService.getGuests();
        return result;
    }
    @GetMapping("/{id}")
    public Guest getGuests(@PathVariable int id) {
        Guest guest = guestService.getGuestById(id);
        return guest;
    }
    @GetMapping("/update")
    public Guest updateGuest(Integer id,String name,String role) {
        Guest newGuest = new Guest(id,name,role);
        System.out.println(newGuest);
        guestService.updateGuest(newGuest);
        return newGuest;
    }
    @GetMapping("/delete/{id}")
    public String deleteGuest(@PathVariable(name = "id") int id){
        guestService.deleteGuest(id);
        return "Success";
    }


}
