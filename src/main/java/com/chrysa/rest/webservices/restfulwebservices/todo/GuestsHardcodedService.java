package com.chrysa.rest.webservices.restfulwebservices.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class GuestsHardcodedService {
    @Autowired
    private static List<GuestsCalendar> guests = new ArrayList<>();

    private static int idCounter = 0;
    static{
        //guests.add(new GuestsCalendar(++idCounter,"Danai","paei Elvetia",new Date(),	new Date()));
        //guests.add(new GuestsCalendar(++idCounter,"Efi","paei Elvetia",new Date(2023,03,03),new Date(2023,03,04)));
        guests.add(new GuestsCalendar(++idCounter,"Chrysa","Chrysa","paei Manchester",LocalDateTime.of(2023,03,05, 10, 00),LocalDateTime.of(2023,03,06, 10, 00)));
        guests.add(new GuestsCalendar(++idCounter,"Chrysa","Chrysa","paei Manchester",LocalDateTime.of(2023,03,10, 10, 00),LocalDateTime.of(2023,03,14, 10, 00)));
    }

    public static List<GuestsCalendar> findAllGuests(){
        return guests;

    }

    public GuestsCalendar deleteById(long id){
        GuestsCalendar guest=findById(id);
        if(guest==null) {
            return null;
        }
        if(guests.remove(guest)){
            return guest;
        }
        return null;
    }

    public GuestsCalendar findById(long id) {
        for(GuestsCalendar guest:guests){
            if(guest.getId()== id){
                return guest;
            }
        }
        return null;
    }

    public GuestsCalendar save(GuestsCalendar guest){
        if(guest.getId()==-1 || guest.getId()==0){
            guest.setId(++idCounter);
            guests.add(guest);
        }else{
            deleteById(guest.getId());
            guests.add(guest);
        }
        return guest;
    }

}
