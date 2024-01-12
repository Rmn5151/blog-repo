package com.example.hotel.controller;

import com.example.hotel.entity.Hotel;
import com.example.hotel.seriveces.HotelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    HotelService hotelService;
    public HotelController(HotelService hotelService)
    {
        this.hotelService=hotelService;
    }
    @PostMapping("/")
     public ResponseEntity<Hotel>createHotel(@RequestBody Hotel hotel)
     {
         Hotel hotel1 = this.hotelService.createHotel(hotel);
         return new ResponseEntity<>(hotel1, HttpStatus.CREATED);
     }
     @GetMapping("/{hotelId}")
      public ResponseEntity<Hotel>getById(@PathVariable Integer hotelId)
      {
          Hotel byHotelId = this.hotelService.getByHotelId(hotelId);
          return ResponseEntity.ok(byHotelId);
      }
}
