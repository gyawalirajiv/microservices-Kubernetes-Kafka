package com.example.authenticationservice.services;

import com.example.authenticationservice.entities.DTOs.TokenResponse;
import com.example.commonsmodule.DTOs.UserDTO;
import com.example.authenticationservice.entities.DTOs.UserLoginDTO;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface AuthenticationService {
    TokenResponse login(UserLoginDTO payload) throws JsonProcessingException;

    UserDTO register(UserDTO payload);

    UserDTO getUserByUserId(Long id);

    UserDTO sendReservationApprovedEmailToTutor(Long tutorUserId);
}
