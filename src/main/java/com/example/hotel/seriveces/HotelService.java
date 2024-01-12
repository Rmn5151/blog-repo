package com.example.hotel.seriveces;

import com.example.hotel.entity.Hotel;

import java.util.List;

public interface HotelService {
     Hotel createHotel(Hotel hotel);
     List<Hotel> getAllHotels();
     Hotel getByHotelId(Integer id);

}
