package com.example.hotel.serivecesimpl;

import com.example.hotel.entity.Hotel;
import com.example.hotel.repo.HotelRepo;
import com.example.hotel.seriveces.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
      HotelRepo hotelRepo;
    @Override
    public Hotel createHotel(Hotel hotel) {
        Hotel save = hotelRepo.save(hotel);

        return save;
    }

    @Override
    public List<Hotel> getAllHotels() {
        List<Hotel> allHotels = this.hotelRepo.findAll();
        return allHotels;
    }

    @Override
    public Hotel getByHotelId(Integer hotelId) {
        Optional<Hotel> byId = this.hotelRepo.findById(hotelId);
//        if(byId.isPresent())
//        {
//            Hotel hotel = byId.get();
//        }
//        else
//        {
//            System.out.println("Hotel Not Found of this id"+byId);
//        }

         return byId.get();
    }

}
